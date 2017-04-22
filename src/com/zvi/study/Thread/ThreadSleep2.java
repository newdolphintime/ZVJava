package com.zvi.study.Thread;

/**
 * Created by Zv on 2017/04/22.
 */
public class ThreadSleep2 {
    public static void main(String[] args) {
        SleepRunnable sleepRunnable =new SleepRunnable();
        WaitRunnable waitRunnable = new WaitRunnable();
//        Thread thread1 = new Thread(sleepRunnable, "线程1");
//        Thread thread2 = new Thread(sleepRunnable, "线程2");
        Thread thread1 = new Thread(waitRunnable, "线程1");
        Thread thread2 = new Thread(waitRunnable, "线程2");
        thread1.start();//不一定就是线程1先执行,只是让它处于就绪状态.
        thread2.start();
    }
}
class SleepRunnable implements Runnable {
    private Object object = new Object();

    @Override
    public void run() {
        synchronized (object) {
            while (true) {

                System.out.println(Thread.currentThread().getName() + "要睡觉了，但我不会放掉object的锁");
                try {
                    Thread.currentThread().sleep(50);//睡5秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
class WaitRunnable implements Runnable {
    private Object object = new Object();

    @Override
    public void run() {
        synchronized (object) {
            while (true) {
                System.out.println(Thread.currentThread().getName() + "将被等待阻塞");
                try {
                    object.wait(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(Thread.currentThread().getName() );
                }
            }
        }

    }
}