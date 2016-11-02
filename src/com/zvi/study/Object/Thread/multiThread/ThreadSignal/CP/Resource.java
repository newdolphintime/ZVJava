package com.zvi.study.Object.Thread.multiThread.ThreadSignal.CP;

public class Resource {
	private String name ;
	private int count;
	private Boolean flag=false;
	public synchronized void set(String name) throws InterruptedException{
		
			while (flag)
				this.wait();
			this.name=name +"======"+count ++;
			System.out.println(Thread.currentThread().getName()+"生产了！"+this.name);
			flag=true;
			this.notifyAll();
		
	}
	public synchronized void out() throws InterruptedException{
		
			while (!flag)
				this.wait();
			System.out.println(Thread.currentThread().getName()+"消费了！！"+this.name);
			flag=false;
			this.notifyAll();
		
	}
}
