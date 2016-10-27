package com.zvi.study.Array;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { -3, -8, -1, -4, -7 };
		int x = sortMax(arr);
		System.out.println(x);
		//sortSelect(arr);
		//sortPop(arr);
		//������ϵͳ���Դ�����(Ĭ������)
		//Arrays.sort(arr);
		printArr(arr);
	}

	// ��ӡ����
	public static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1)

				System.out.print(arr[i] + ",");
			else
				System.out.println(arr[i] + "]");
		}

	}

	// �ҳ����ֵ
	public static int sortMax(int[] arr) {
		int arrMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arrMax < arr[i])
				arrMax = arr[i];
		}
		return arrMax;
	}

	// ѡ�����򣨴�С����
	public static void sortSelect(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	// ð������
	// -i��Ŀ����Ϊ�˼���Ԫ��Ŀ��ıȽϣ�-1��Ŀ���Ǳ���Ǳ�Խ��
	public static void sortPop(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
