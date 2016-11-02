package com.zvi.study.Object.Thread.multiThread.ThreadSignal.CP;

public class CPDemo {
	public static void main(String[] args) {
		Resource rs=new Resource();
		Consumer c=new Consumer(rs);
		Producer p=new Producer(rs);
		Thread t1 =new Thread(p); 
		Thread t2 =new Thread(p); 
		Thread t3 =new Thread(c); 
		Thread t4 =new Thread(c);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
