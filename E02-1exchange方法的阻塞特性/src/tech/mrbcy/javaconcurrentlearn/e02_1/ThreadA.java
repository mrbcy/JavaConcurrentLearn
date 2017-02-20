package tech.mrbcy.javaconcurrentlearn.e02_1;

import java.util.concurrent.Exchanger;

public class ThreadA extends Thread{
	private Exchanger<String> exchanger;

	public ThreadA(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		super.run();
		
		try {
			System.out.println("���߳�A�еõ��߳�B�е�ֵ��" + exchanger.exchange("AAAAA"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
