package com.zvi.study.Object.Thread.multiThread.DeadMultiThread;

public class DeadThraed implements Runnable{
	private Boolean flag;
	public DeadThraed(Boolean flag) {
		// TODO Auto-generated constructor stub
		this.flag=flag;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(flag){
			synchronized (MyObj.obja) {
				System.out.println("if obja");
				synchronized (MyObj.objb) {
					System.out.println("if objb");
				}
			}
		}
		else{
			synchronized (MyObj.objb) {
				System.out.println("else obja");
				synchronized (MyObj.obja) {
					System.out.println("else objb");
				}
			}
		}
		
	}

}
