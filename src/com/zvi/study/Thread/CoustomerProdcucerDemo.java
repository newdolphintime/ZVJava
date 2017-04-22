package com.zvi.study.Thread;

import java.util.LinkedList;

/**
 * Created by Zv on 2017/04/22.
 */
public class CoustomerProdcucerDemo {
    public static void main(String[] args) {
        LinkedList<Egg> eggs = new LinkedList<>();
        Prodcucer prodcucer = new Prodcucer(eggs);
        Coustomer coustomer = new Coustomer(eggs);

        new Thread(prodcucer, "公鸡A").start();
        new Thread(prodcucer, "母鸡B").start();

        new Thread(coustomer, "吃货").start();
    }
}

/**
 * 产品
 */
class Egg {
    int id;

    public Egg(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "->" + id;
    }
}

/*
* 生产者
* */
class Prodcucer implements Runnable {
    private LinkedList<Egg> eggs;
    private int id = 1;//产品编号

    public Prodcucer(LinkedList<Egg> eggs) {
        this.eggs = eggs;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (eggs) {
                //1.判断篮子是否满了
                while (eggs.size() == 5) {
                    System.out.println(Thread.currentThread().getName() + "篮子已满..");
                    try {
                        eggs.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 2.生产
                eggs.push(new Egg(id++));
                System.out.println(Thread.currentThread().getName() + " 生产了鸡蛋 :" + eggs.peek());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //3. 唤醒消费者线程
                eggs.notifyAll();//唤醒所有等待线程，但这些线程只会转入就绪状态，并不确定哪一个线程获取cpu资源
            }
        }
    }

}

class Coustomer implements Runnable {
    private LinkedList<Egg> eggs;

    public Coustomer(LinkedList<Egg> eggs) {
        this.eggs = eggs;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (eggs) {
                //1. 判断篮子是否为空
                while (eggs.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() + " 篮子空了 ");

                    try {
                        eggs.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //2. 消费产品--吃鸡蛋
                System.out.println("\t\t" + Thread.currentThread().getName() + " 消费了 " + eggs.pop());

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //唤醒等待线程
                eggs.notifyAll();
            }
        }
    }
}