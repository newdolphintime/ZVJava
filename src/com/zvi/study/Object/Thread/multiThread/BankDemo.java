package com.zvi.study.Object.Thread.multiThread;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cus c =new Cus();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		
		
		t1.start();
		t2.start();
		
		
		
	}

}
