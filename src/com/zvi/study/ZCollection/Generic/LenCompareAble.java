package com.zvi.study.ZCollection.Generic;

import java.util.Comparator;

public class LenCompareAble implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int num = new Integer(o1.length()).compareTo(new Integer(o2.length()));
		if (num == 0)
			return o1.compareTo(o2);
		return num;
	}

}
