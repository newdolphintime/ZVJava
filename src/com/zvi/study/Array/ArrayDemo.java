package com.zvi.study.Array;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[2];
		int arr1[] = new int[2];
		int[] arr3 = new int[] { 3, 1, 6, 5, 4 };
		arr[0] = 1;
		System.out.println(arr[0]);// 1
		System.out.println(arr[1]);// 默认是0
		// System.out.println(arr[2]);//编译只检查语法问题，编译不报错，运行报错
		// java.lang.ArrayIndexOutOfBoundsException: 2 脚标越界
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr[" + i + "]" + "=" + arr3[i]);
		}
		printArrar(arr3);
		// 以下代码输出结果为[I@6af62373 [代表数组 I代表存的是INT类型数据 6af62373代表该数组存放数据的位置
		// 16进制的哈希值
		System.out.println(arr1);
	}

	// 将数组的元素打印出来并且用逗号分隔开,并且最后一行不可以有逗号
	public static void printArrar(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1)
				System.out.print(arr[i] + ",");
			else
				System.out.println(arr[i]);
		}
	}

}
