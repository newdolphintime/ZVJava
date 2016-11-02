package com.zvi.study.Object.Thread.multiThread.ThreadSignal.CP;

public class Consumer implements Runnable{
	private Resource rs;
	public Consumer(Resource rs) {
		// TODO Auto-generated constructor stub
		this.rs=rs;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true){
			rs.out();}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
