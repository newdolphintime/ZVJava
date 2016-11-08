package com.zvi.study.ZCollection;

import java.util.HashSet;
import java.util.Iterator;

/*set 元素不可以重複
 *    元素是无序的
 * */
/*HASH如何让包子数据的一致性的呢？
 * 要有hashcode和equal来共同工作
 * 如果hashcode相同才会调用equal方法
 * */
public class SetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Person("j1", 1));

		hs.add(new Person("j2", 2));
		hs.add(new Person("j3", 3));

	}

	private void methodBase() {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		System.out.println(hs.add("java01"));
		System.out.println(hs.add("java01"));// 出现重复的元素的时候 添加失败就为假
		hs.add("java02");
		hs.add("java02");
		hs.add("java03");
		hs.add("java03");

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
