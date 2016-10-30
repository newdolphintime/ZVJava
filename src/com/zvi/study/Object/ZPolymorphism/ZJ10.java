package com.zvi.study.Object.ZPolymorphism;

public class ZJ10 extends Zfighter {
	public void fastfly() {
		System.out.println("China");
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("飞行突破声速");
	}

}
