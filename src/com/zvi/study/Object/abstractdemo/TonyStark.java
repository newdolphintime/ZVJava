package com.zvi.study.Object.abstractdemo;

public class TonyStark {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        IronManMark2 i2=new IronManMark2(2);
        i2.fly();
        i2.speak();
        IronManMrak3 i3 =new IronManMrak3(3);
        i3.fly();
        i3.speak();
        i3.jarvis(new Raligun());
        i3.jarvis(new Myraligun() {
			
			@Override
			public void shot() {
				
				// TODO Auto-generated method stub
				System.out.println("only my raligun can shot it !");
			}
		});
	}
	

}
