package com.zvi.study.Thread;

/**
 * Created by Zv on 2017/04/16.
 * 终止线程只有一种方法  吧run方法跑完
 * interrupt是在清除线程的冻结状态 让线程重新活起来把自己的事情完成
 */
public class InterruptThread {
    public static void main(String[] args) {
        MyinerruptThread myinerruptThread1 = new MyinerruptThread("Thread-0000");
        MyinerruptThread myinerruptThread2 = new MyinerruptThread("Thread-1111");
        myinerruptThread1.start();
        myinerruptThread2.start();
        int num = 0;
        while (true){
            if (num ++ == 100){
                myinerruptThread1.interrupt();



                myinerruptThread2.interrupt();


                break;
            }
            System.out.println(Thread.currentThread().getName()+" start");
        }
        System.out.println(Thread.currentThread().getName()+" over");

    }

}
class MyinerruptThread extends Thread{
    public MyinerruptThread(String name){
        super(name);
    }
    public boolean flag = true;
    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName()+" 开始跑！");
        while (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" wait()方法啦被intrupt一转头敲醒啦>_<！");
                changeFlag();
            }
            System.out.println(Thread.currentThread().getName()+" run");
        }
        System.out.println(Thread.currentThread().getName()+" run");
    }
    public void changeFlag(){
        flag = false ;
    }
}

