package com.zvi.study.ZCollection;

import java.util.Iterator;
import java.util.TreeSet;
//Exception in thread "main" java.lang.ClassCastException: com.zvi.study.ZCollection.Student cannot be cast to java.lang.Comparable
//at java.util.TreeMap.put(TreeMap.java:542)
//at java.util.TreeSet.add(TreeSet.java:238)
//at com.zvi.study.ZCollection.TreesetDemo.main(TreesetDemo.java:10)
public class TreesetDemo {
	//这货是二叉树 就用对象的compareto方法   不用hash 和equa   这种也叫做元素的自然顺序
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyCompare());//有了这个神奇的海螺就不用Student里面的比较方法了
		ts.add(new Student("a1", 1));
		ts.add(new Student("a7", 7));
		ts.add(new Student("a2222", 2));
		
		ts.add(new Student("a888", 7));
		ts.add(new Student("a5", 7));//没进来
		Iterator it =ts.iterator();
		while(it.hasNext()){
			Student s =(Student)it.next();
			System.out.println(s.getName()+"____"+s.getAge());
		}
	}
}
