package tech.mrbcy.javaconcurrentlearn.e02_3;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

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
			System.out.println("在线程A中得到线程B中的值：" + exchanger.exchange("AAAAA", 5, TimeUnit.SECONDS));
			System.out.println("A end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	
}
