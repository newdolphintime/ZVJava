package com.zvi.study.Object.abstractdemo;

public class IronManMark2 extends IronMan{

	IronManMark2(int version) {
		super(version);
		
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("飞行速度5马赫");
	}

}
