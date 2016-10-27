package com.zvi.study.Object;

public class ZAnonymousObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("en");
		c.setNum(2); 
		c.setName("baoshijie");
		c.show();
		remake(c);
		c.show();
	}

	public static void remake(Car c) {
		c.setNum(6); 
		c.setName("laosiji");
	}

}
