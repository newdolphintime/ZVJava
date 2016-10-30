package com.zvi.study.Object.extend;

public class ZSon extends ZFather {
	public int num2 = 2;
	public String name ="zv";
	void show(){
		System.out.println(super.name);
	}
	ZSon(){
		
		
		//super();
		System.out.println("son run");
	}
}
