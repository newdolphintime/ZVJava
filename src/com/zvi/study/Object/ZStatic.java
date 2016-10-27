package com.zvi.study.Object;

public class ZStatic {
    //静态变量，属于所有权属于对象，一旦一个变量设为static那么这个变量就会变为共享区
	//静态变量 随着类的加载而加载 属于所有对象 优先于对象的存在 可以直接被类名所调用
	//成员变量随着类的存在而存在
	//实例变量随着对象创建而创建
	static String version="100.0.90.80";//类创建就会存在 成员变量
	String pkgname;//对象存在才会存在  实例变量
	public static void main(String[] args) {
		//System.out.println(pkgname);这种调用实例变量是错的 因为MAIN方法是静态方法
		//静态方法只能调用静态变量以及静态方法，非静态的要使用对象点方法来调用
		System.out.println(version);
		ZStatic z=new ZStatic();
		//上面的对象初始化做了那几件事情
		/*
		 * 1将ZStatic.class加载到内存中
		 * 2执行static代码块给类初始化
		 * 3在堆内存开辟空间，并且初始化
		 * 4在堆内存中建立对象特有属性，并且进行默认初始化
		 * 6对对象进行构造代码块初始化
		 * 7对对象进行构造函数初始化
		 * 8将内存地址复制给z
		 * */
		z.nomain(args);
		System.out.println(args);//[Ljava.lang.String;@6af62373主函数参数输出查看
		System.out.println(args.length);//可以推断穿的是 new String[0]
	}
	public void nomain(String[] args){
		//非静态方法什么都可以调用
		System.out.println(version);
		//main(args);谨慎调用，会死循环
	}

}
