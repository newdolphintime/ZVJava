package com.zvi.study.Object.ZPolymorphism;

public class ZJ20 extends Zfighter {
	int num=20;
	void gonefly() {
		System.out.println("China");
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("隐身飞行！");
	}

}
