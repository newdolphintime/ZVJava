package com.zvi.study.ZCollection.Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> al =new TreeSet<String>(new LenCompareAble());
		al.add("aaaaa");
		al.add("aaaa");
		al.add("aaa");
		al.add("aa");
		al.add("a");
		Iterator<String> it =al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
