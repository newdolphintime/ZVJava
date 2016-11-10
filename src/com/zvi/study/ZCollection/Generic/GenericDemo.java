package com.zvi.study.ZCollection.Generic;

public class GenericDemo {
	public static void main(String[] args) {
		Utils<Student> s = new Utils<Student>();
		s.setObject(new Student("enen",2));
		Student ss = s.getObject();
		ss.setAge(5);
		System.out.println(ss.getAge());
		methodGeneric m =new methodGeneric();
		m.show("heh");
		m.show(new Integer(5));
		m.print("hehe");
		methodGeneric.printl("hhaaaa");
		new inter<String>() {

			@Override
			public void show(String t) {
				// TODO Auto-generated method stub
				System.out.println("inter"+t);
			}
		}.show("nimabi");;
	}
}
