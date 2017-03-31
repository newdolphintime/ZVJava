package com.zvi.study.ZCollection.Generic;

import java.util.Comparator;

public class PersonCompare implements Comparator<Person>{

	

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
