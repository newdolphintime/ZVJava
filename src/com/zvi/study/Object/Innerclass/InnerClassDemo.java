package com.zvi.study.Object.Innerclass;

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Earth o=new Earth();
		o.method();
		Earth.Moon em=new Earth().new Moon();
		em.fuction();
	}
	
}
