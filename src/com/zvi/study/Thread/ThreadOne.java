package com.zvi.study.Thread;

/**
 * Created by Zv on 2017/04/16.
 * 线程实现的第一种方法
 * 继承Thread类实现RUN方法
 */
public class ThreadOne {
//    创建好了自己的线程类之后，就可以创建线程对象了，然后通过start()方法去启动线程。
//    注意，不是调用run()方法启动线程，run方法中只是定义需要执行的任务，如果调用run方法，
//    即相当于在主线程中执行run方法，跟普通的方法调用没有任何区别，此时并不会创建一个新的
//    线程来执行定义的任务。
    public static void main(String[] args) {
        //start()方法调用和run()方法调用的区别
        System.out.println("主线程ID:"+Thread.currentThread().getId());
        MyThread thread1 = new MyThread("thread1");
        thread1.start();
        MyThread thread2 = new MyThread("thread2");
        thread2.run();
//      输出结果：
//      主线程ID:1
//      name:thread2 子线程ID:1
//      name:thread1 子线程ID:11
    }
}
//从输出结果可以得出以下结论：
//1）thread1和thread2的线程ID不同，thread2和主线程ID相同，说明通过run方法调用并不会创建新的线程，
//        而是在主线程中直接运行run方法，跟普通的方法调用没有任何区别；
//2）虽然thread1的start方法调用在thread2的run方法前面调用，但是先输出的是thread2的run方法调用的相关信息，
//        说明新线程创建的过程不会阻塞主线程的后续执行。

class MyThread extends Thread{
    private String name;
    public MyThread(String name){ this.name = name; }
    @Override
    public void run() {
        System.out.println("name:"+name+" 子线程ID:"+Thread.currentThread().getId());
    }
}