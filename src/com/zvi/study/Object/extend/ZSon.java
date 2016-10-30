package com.zvi.study.Object.extend;

public class ZSon extends ZFather {
	public int num2 = 2;
	public String name ="zv";
	void show(){
		System.out.println(super.name);
	}
	ZSon(){
		//如果有其他父类的构造函数还可以显示调用
		//虚拟机自己加的
		//必须放在第一行
		//super();
		System.out.println("son run");
	}
}
