package com.zvi.study.Object.Thread.multiThread.ThreadSignal.CPLock;

public class Producer implements Runnable{
	private Resource rs;
	public Producer(Resource rs) {
		// TODO Auto-generated constructor stub
		this.rs=rs;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true){
			rs.set("+商品+");}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
