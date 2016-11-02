package com.zvi.study.Object.Thread.multiThread.ThreadSignal;

public class Output implements Runnable {
	private Person p;

	public Output(Person p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		int x = 0;
		while (true) {
			synchronized (p) {
				if (p.flag)
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				if (x == 0) {
					p.name = "mike";
					p.sex = "man";
				} else {
					p.name = "小美";
					p.sex = "女";
				}
				x = (x + 1) % 2;
				p.flag = true;
				p.notify();
			}
		}

	}

}
