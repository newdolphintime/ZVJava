package com.zvi.study.Object.abstractdemo;

public class IronManMrak3 extends IronMan implements Myraligun{

	IronManMrak3(int version) {
		super(version);
		
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("飞行速度10马赫");
	}

	@Override
	public void shot() {
		// TODO Auto-generated method stub
		System.out.println("only my railgun can shot it!");
	}

}
