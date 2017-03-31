package com.zvi.study.ZCollection.Generic;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
//泛型限定
public class GenericDemo2 {
	public static void main(String[] args) {
		TreeSet<Student> ts =new TreeSet<Student>(new PersonCompare());
		ts.add(new Student("aaa1",1));
		ts.add(new Student("aaa2",1));
		ts.add(new Student("aaa3",1));
		ts.add(new Student("aaa4",1));
		Iterator<Student> its= ts.iterator();
		while(its.hasNext()){
			System.out.println(its.next().getName());
		}
		TreeSet<Worker> tw =new TreeSet<Worker>(new PersonCompare());
		tw.add(new Worker("aaa01",1));
		tw.add(new Worker("aaa02",1));
		tw.add(new Worker("aaa03",1));
		tw.add(new Worker("aaa04",1));
		Iterator<Worker> itw= tw.iterator();
		while(itw.hasNext()){
			System.out.println(itw.next().getName());
		}
	}
}
