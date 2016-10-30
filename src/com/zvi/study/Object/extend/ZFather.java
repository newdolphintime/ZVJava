package com.zvi.study.Object.extend;

public class ZFather {
	//子类与父类重名的成员变量和方法子类会覆盖父类
	public  int num1 = 1;
	public String name ="zvfather";
	//构造函数重写
	ZFather(){
		System.out.println("fanther run");
	}
}
