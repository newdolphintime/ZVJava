package com.zvi.study.Object.abstractdemo;

public abstract class IronMan {
	private int version;
	IronMan(int version){
		this.version =version;
	}
	abstract void fly();

	void speak() {
		System.out.println("贾克斯人工智能"+version);
	}
	abstract void jarvis(Myraligun z);
}
