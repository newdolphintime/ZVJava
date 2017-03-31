package com.zvi.study.ZCollection;





public class Student implements Comparable<Student> {
	private String name;
	private int age;
	public Student(String name, int age) {
		
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode()+age*34;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof Student)){
			throw new ClassCastException("类型不匹配");
		}
		Student s =(Student)obj;
		return this.name.equals(s.name)&&this.age==s.age;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int num =new Integer(this.age).compareTo(o.age);
		if(num==0){
			return this.name.compareTo(o.name);
		}
		return num;
		//return o.name.compareTo();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+age;
	}
}
