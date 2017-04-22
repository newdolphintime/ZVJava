package com.zvi.study.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Zv on 2017/04/22.
 */
public class ThreadLock {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        MyTask2 task = new MyTask2(lock);
        Thread t1 = new Thread(task, "售票点1");
        Thread t2 = new Thread(task, "售票点2");

        t1.start();
        t2.start();
    }

}
/**
 * Lock
 */
class MyTask2 implements Runnable {
    private int nums = 20;

    private Lock lock;

    public MyTask2(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        while (true) {

            lock.lock(); //替换了synchronized(this)
            if (nums > 0) {
                System.out.println(Thread.currentThread().getName() + " 卖出第 " + (nums--) + "张票");
            } else {
                lock.unlock(); //线程执行完成后，必须解锁
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.unlock();
        }
    }
}