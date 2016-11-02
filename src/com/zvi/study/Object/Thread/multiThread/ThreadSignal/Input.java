package com.zvi.study.Object.Thread.multiThread.ThreadSignal;

public class Input implements Runnable {
	private Person p;

	Input(Person p) {
		this.p = p;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			synchronized (p) {
				if (!p.flag)
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				System.out.println(p.name + "========" + p.sex);
				p.flag = false;
				p.notify();
			}
			

		}
	}

}
