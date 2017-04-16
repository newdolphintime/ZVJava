package com.zvi.study.Thread;

/**
 * Created by Zv on 2017/04/16.
 * 在很多情况下，主线程创建并启动了线程，如果子线程中药进行大量耗时运算，主线程往往将早于子线程结束之前结束。
 * 这时，如果主线程想等待子线程执行完成之后再结束，比如子线程处理一个数据，主线程要取得这个数据中的值，就要用到join()方法了。
 * 方法join()的作用是等待线程对象销毁。
 * 由上可以看出main主线程等待joined thread线程先执行完了才结束的。
 */
public class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new JoinThread("new thread").start();
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                JoinThread th = new JoinThread("joined thread");
                th.start();
                //th.join();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
