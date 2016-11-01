package com.zvi.study.Object.Thread.multiThread.DeadMultiThread;

public class DeadThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//死锁实例
		Thread t1 =new Thread(new DeadThraed(true));
		Thread t2 =new Thread(new DeadThraed(false));
		t1.start();
		t2.start();
	}

}
