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
			System.out.println("在线程A中得到线程B中的值：" + exchanger.exchange("AAAAA"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
