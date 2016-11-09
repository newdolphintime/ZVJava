package com.zvi.study.ZCollection;

import javax.management.RuntimeErrorException;

public class Student implements Comparable {
	public String name;
	public int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		//return 1;
		// TODO Auto-generated method stub
		if (!(o instanceof Student)) {
			throw new RuntimeException("不是Studen对象");
		}
		Student t = (Student) o;
		System.out.println(this.name + "compare to" + t.name);
		if (this.age - t.age > 0)

			return 1;

		if (this.age - t.age == 0) {
			return this.name.compareTo(t.name);
		}
		return -1;
	}
}
