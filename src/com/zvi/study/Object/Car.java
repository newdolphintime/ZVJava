package com.zvi.study.Object;

public class Car {
	private int num;
	private String name;
	//���캯��������ʽ�����ܼ�private����void
	{
		System.out.println("�������飺�Ǹ����ж����ʼ��");
	}
	Car(){
		System.out.println("���캯�����Ǹ���Ӧ�Ķ����ʼ��");
	}
	Car(String name){
		//this������Ķ����ĸ�������þ��Ǵ����ĸ�����
		//���캯��֮�����
		this();
		this.name=name;
		
	}
	public void show() {
		System.out.println(num + " " + name);
	}
	//��װ����˽�У�˽�н����Ƿ�װ��һ�ֱ�����ʽ��
	//��װ����˳���Ľ�׳��
	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}
}
