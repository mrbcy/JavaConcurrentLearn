package tech.mrbcy.javaconcurrentlearn.e01_3;

import java.util.concurrent.Semaphore;

public class Service {
	private Semaphore semaphore = new Semaphore(1);
	
	public void testMethod(){
		try {
			semaphore.acquire();
			Thread.sleep(1000);
			System.out.println("大约还有 " + semaphore.getQueueLength() + " 个线程在等待");
			System.out.println("是否有线程在等待信号量？" + semaphore.hasQueuedThreads());
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			semaphore.release();
		}
	}
}
