package com.zvi.study.Object.ZPolymorphism;

public class ZAirport {
	public static void main(String[] args) {
		// 多态
		/*
		 * 一般存在覆盖使用多态才有便利性 不然看下面J10的使用，还得强转才可以使用 这就说出了多态的弊端
		 * 即使多态提高了程序的拓展性，但是只能使用父类的引用访问父类的成员
		 */
		Zfighter j10 = new ZJ10();//类型提升向上转型
		j10.fly();
		((ZJ10) j10).fastfly();//强制转换类型
		Zfighter j20 = new ZJ20();
		j20.fly();
		System.out.println(j20.num);//多态中注意成员变量引用父类的，静态变量和方法也是调用父类的
		
	}

}
