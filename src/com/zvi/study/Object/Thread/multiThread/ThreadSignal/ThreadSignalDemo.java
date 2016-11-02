package com.zvi.study.Object.Thread.multiThread.ThreadSignal;

public class ThreadSignalDemo {
	public static void main(String[] args) {
		Person p=new Person();
		Thread t=new Thread(new Input(p));
		Thread t1=new Thread(new Output(p));
		t.start();
		t1.start();
	}
}
