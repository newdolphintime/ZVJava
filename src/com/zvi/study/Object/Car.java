package com.zvi.study.Object;

public class Car {
	private int num;
	private String name;
	//构造函数固有形式，不能加private或者void
	{
		System.out.println("构造代码块：是给所有对象初始化");
	}
	Car(){
		System.out.println("构造函数：是给对应的对象初始化");
	}
	Car(String name){
		//this代表本类的对象，哪个对象调用就是代表哪个对象。
		//构造函数之间调用
		this();
		this.name=name;
		
	}
	public void show() {
		System.out.println(num + " " + name);
	}
	//封装不是私有，私有仅仅是封装的一种表现形式。
	//封装提高了程序的健壮性
	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}
}
