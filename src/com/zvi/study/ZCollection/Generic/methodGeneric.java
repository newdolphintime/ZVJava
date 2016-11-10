package com.zvi.study.ZCollection.Generic;

public class methodGeneric<T> {
	public void print(T t) {
		// TODO Auto-generated method stub
		System.out.println("print" + t);
	}

	public <Q> void show(Q q) {
		System.out.println("print" + q);
	}

	public static <W> void printl(W w) {
		System.out.println("static" + w);
	}
}
