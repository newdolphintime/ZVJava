package com.zvi.study.Object.abstractdemo;

public class IronManMrak3 extends IronMan {

	IronManMrak3(int version) {
		super(version);
		
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("飞行速度10马赫");
	}

	

	
	@Override
	void jarvis(Myraligun z) {
		// TODO Auto-generated method stub
		z.shot();
	}

}
