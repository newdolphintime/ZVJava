package com.zvi.study.ZCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args)

	{
		methodBase();

	}

	private static void methodBase() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();

		al.add("world one ");

		al.add("world two");
		al.add("world three ");
		al.add("world four ");
		System.out.println("world three是否存在" + al.contains("world three "));
		System.out.println("集合是否为空" + al.isEmpty());
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		// al.clear();
		System.out.println(al);

		ArrayList al1 = new ArrayList();

		al1.add("world one 1");

		al1.add("world two");
		al1.add("world three 3");
		al1.add("world four 4");

		// 交集
		al.retainAll(al1);
		System.out.println(al);// al保留交集
		System.out.println(al1);
		//接口只能指向子类对象
		Iterator it = al1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
