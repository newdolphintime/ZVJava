package com.zvi.study.Array;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[2];
		int arr1[] = new int[2];
		int[] arr3 = new int[] { 3, 1, 6, 5, 4 };
		arr[0] = 1;
		System.out.println(arr[0]);// 1
		System.out.println(arr[1]);// Ĭ����0
		// System.out.println(arr[2]);//����ֻ����﷨���⣬���벻�������б���
		// java.lang.ArrayIndexOutOfBoundsException: 2 �ű�Խ��
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr[" + i + "]" + "=" + arr3[i]);
		}
		printArrar(arr3);
		// ���´���������Ϊ[I@6af62373 [�������� I��������INT�������� 6af62373��������������ݵ�λ��
		// 16���ƵĹ�ϣֵ
		System.out.println(arr1);
	}

	// �������Ԫ�ش�ӡ���������ö��ŷָ���,�������һ�в������ж���
	public static void printArrar(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1)
				System.out.print(arr[i] + ",");
			else
				System.out.println(arr[i]);
		}
	}

}
