package com.zvi.study.Thread;

import java.util.LinkedList;

/**
 * Created by Zv on 2017/04/22.
 */
public class CoustomerProdcucerDemo2 {
    public static void main(String[] args) {
        Resource re =new Resource();
        Product pro = new Product(re);
        Customer cus = new Customer(re);
        Thread thread1 = new Thread(pro);
        Thread thread2 = new Thread(pro);
        Thread thread3 = new Thread(cus);
        Thread thread4 = new Thread(cus);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
class Product implements Runnable{
    private Resource re;
    public Product(Resource re){
        this.re = re;
    }
    @Override
    public void run() {
        while (true){
            re.set("商品");
        }
    }
}
class Customer implements Runnable{
    private Resource re;
    public Customer(Resource re){
        this.re = re;
    }
    @Override
    public void run() {
        while (true) {
            re.out();
        }
    }
}
class Resource {
    private int count = 1;
    private boolean flag = false;
    private String name;

    public synchronized void set(String name){
        while(flag)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        this.name = name +"_____"+count++;
        System.out.println(Thread.currentThread().getName()+"生产者————————"+this.name);
        flag = true;
        this.notifyAll();
    }
    public synchronized  void out (){
        while(!flag)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println(Thread.currentThread().getName()+"消费者——————————————"+this.name);
        flag = false;
        this.notifyAll();
    }
}