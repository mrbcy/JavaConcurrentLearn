package tech.mrbcy.javaconcurrentlearn.e01_4;

import java.util.concurrent.Semaphore;

public class Service {
	private boolean isFair = false;
	private Semaphore semaphore = new Semaphore(1, isFair);
	
	public void testMethod(){
		try {
			semaphore.acquire();
			System.out.println("ThreadName=" + Thread.currentThread().getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			semaphore.release();
		}
	}
}
