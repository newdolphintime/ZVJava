package com.zvi.study.Object;

public class ZStatic {
    //��̬��������������Ȩ���ڶ���һ��һ��������Ϊstatic��ô��������ͻ��Ϊ������
	//��̬���� ������ļ��ض����� �������ж��� �����ڶ���Ĵ��� ����ֱ�ӱ�����������
	//��Ա����������Ĵ��ڶ�����
	//ʵ���������Ŷ��󴴽�������
	static String version="100.0.90.80";//�ഴ���ͻ���� ��Ա����
	String pkgname;//������ڲŻ����  ʵ������
	public static void main(String[] args) {
		//System.out.println(pkgname);���ֵ���ʵ�������Ǵ�� ��ΪMAIN�����Ǿ�̬����
		//��̬����ֻ�ܵ��þ�̬�����Լ���̬�������Ǿ�̬��Ҫʹ�ö���㷽��������
		System.out.println(version);
		ZStatic z=new ZStatic();
		z.nomain(args);
		System.out.println(args);//[Ljava.lang.String;@6af62373��������������鿴
		System.out.println(args.length);//�����ƶϴ����� new String[0]
	}
	public void nomain(String[] args){
		//�Ǿ�̬����ʲô�����Ե���
		System.out.println(version);
		//main(args);�������ã�����ѭ��
	}

}
