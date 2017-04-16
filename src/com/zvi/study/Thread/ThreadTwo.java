package com.zvi.study.Thread;

/**
 * Created by Zv on 2017/04/16.
 * 在Java中创建线程除了继承Thread类之外，还可以通过实现Runnable接口来实现类似的功能。实现Runnable接口必须重写其run方法。
 * 事实上，查看Thread类的实现源代码会发现Thread类是实现了Runnable接口的。
 * 在Java中，这2种方式都可以用来创建线程去执行子任务，具体选择哪一种方式要看自己的需求。直接继承Thread类的话，
 * 可能比实现Runnable接口看起来更加简洁，但是由于Java只允许单继承，
 * 所以如果自定义类需要继承其他类，则只能选择实现Runnable接口。
 */
public class ThreadTwo {
    public static void main(String[] args) {
        System.out.println("主线程ID："+Thread.currentThread().getId());
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
//Runnable的中文意思是“任务”，顾名思义，通过实现Runnable接口，我们定义了一个子任务，
//        然后将子任务交由Thread去执行。注意，这种方式必须将Runnable作为Thread类的参数，
//        然后通过Thread的start方法来创建一个新线程来执行该子任务。如果调用Runnable的run方法的话，
//        是不会创建新线程的，这根普通的方法调用没有任何区别。
class MyRunnable implements Runnable{
    public MyRunnable() { }
    @Override
    public void run() {
        System.out.println("子线程ID："+Thread.currentThread().getId());
    }
}
