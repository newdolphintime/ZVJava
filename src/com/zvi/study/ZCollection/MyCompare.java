package com.zvi.study.ZCollection;

import java.util.Comparator;

public class MyCompare implements Comparator{
//比较器
	
	public int compare(Object o1,Object o2) {
		// TODO Auto-generated method stub
		Student t1=(Student)o1;
		Student t2=(Student)o2;
		return t1.getName().compareTo(t2.getName());
	}
   
}
