package tech.mrbcy.javaconcurrentlearn.e02_2;

import java.util.concurrent.Exchanger;

public class ThreadB extends Thread{
	private Exchanger<String> exchanger;

	public ThreadB(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		super.run();
		
		try {
			System.out.println("���߳�B�еõ��߳�A�е�ֵ��" + exchanger.exchange("BBBBB"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
