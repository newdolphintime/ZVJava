package com.zvi.study.ZCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListDemo {
	/*
	 * LIST 特点 元素有序，可以重复  因为该集合有索引
	 *     ARRAYLIST 底层是数组 查询速度快 增删速度慢 线程不同步 效率高 默认长度是10 超过10 创建数组加50% 再把原来的 拷贝进去
	 *     LINKLIST 底层是链表 查询速度满 增删速度快
	 *     VECTOR 重复 老东西 线程同步
	 * */
	public static void main(String[] args)

	{
		//arrarymethodBase();
		arraymethodPro();
		linkmethodPro();
	}

	private static void arraymethodPro() {
		// TODO Auto-generated method stub
		ArrayList al =new ArrayList();
		al.add("java 1");
		al.add("java 2");
		al.add("java 3");
		al.add("java 4");
		
		ListIterator li =al.listIterator() ;
		
		while (li.hasNext()){
			Object obj=li.next();
			System.out.println(obj);
			if(obj.equals("java 3")){
				li.set("java 3-0");
			}
		}
		System.out.println(al);
	}

	private static void arraymethodBase() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		//添加元素
		al.add("world one ");

		al.add("world two");
		al.add("world three ");
		al.add("world four ");
		//按照位置添加
		al.add(1, "java2");
		System.out.println(al.get(1));
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
	 private  static void linkmethodPro(){
		 LinkedList li =new LinkedList();
		 li.addFirst("j1");
		 li.addFirst("j2");
		 li.addFirst("j3");
		 li.addFirst("j4");
		 System.out.println(li);
	 }

}
