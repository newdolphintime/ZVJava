package com.zvi.study.ZCollection.Generic;

public class Person {
	private String name;
	private int age;
	public Person(String name,int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name +""+age;
	}
}
