package com.zvi.study.ZCollection;

public class Person {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//set只有返回哈希相同才会调用equal方法
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person))
			return false;
		Person p = (Person) obj;
		System.out.println(this.name+this.age+"___"+p.name+p.age);
		return this.name.equals(p.name) && this.age == p.age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println(this.name+".....hashcode");
		return 120;
	}
}
