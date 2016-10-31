package com.zvi.study.Object.Innerclass;
//内部类法访问规则
//内部类可以直接访问外部类的成员，包括私有
//之所以可以直接访问，是因为内部类持有了一个外部类的引用
//外部类要访问内部类，必须建立内部类对象
public class Earth {
	String  x = "In Earth !";

	void method() {
		final int x =1940;
		System.out.println("Earth run!");
		Moon m=new Moon();
		m.fuction();
		//不能被静态私有修饰符修饰 故这种内部类不能定义静态成员
		class Usa{
			void functions(){
				System.out.println("This is USA!" +Earth.this.x+x);
			}
		}
		new Usa().functions();
		new AirSpace() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Happy new year!");
			}
			public void run2() {
				// TODO Auto-generated method stub
				System.out.println("Happy new year!2");
			}
		}.run2();
	}
	//可以被私有静态修饰符修饰
	class Moon{
		String x="In Moon!";
		void fuction(){
			String x="In Inner Moon!";
			System.out.println("Moon run!"+x);
			System.out.println("Moon run!"+this.x);
			System.out.println("Moon run!"+Earth.this.x);
			
		}
		
	}
	
}
