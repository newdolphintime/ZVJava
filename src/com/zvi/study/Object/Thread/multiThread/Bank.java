package com.zvi.study.Object.Thread.multiThread;

public class Bank {
	private int sum;
	Object o =new Object();
	//同步函数属于对象的，有隐式的this 同步函数使用的是this
	public synchronized void add(int x) {
		//注意不能用new Object来锁 这样锁是无效的
		//可以不使用以下方式 直接用关键字修饰方法就可以了
		//synchronized (o) {
			sum = sum + x;
			System.out.println("我的工资是"+sum);
		//}
		
	}
}
