package com.zvi.study.Object.Thread;

public class ThraedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("my first");//?
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 20; i++) {
					System.out.println("awsome my brother!");
				}
			}
		}).start();
		for (int i = 0; i < 100; i++) {
			System.out.println("MAIN RUN");
		}
//		NOMAINThread n=new NOMAINThread();
//		Thread t2 =new Thread(n);
//		t2.start();
		
	}

}
