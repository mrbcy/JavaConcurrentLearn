package tech.mrbcy.javaconcurrentlearn.e01_6;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;


public class Service {
	private Semaphore semaphore = new Semaphore(3);
	private ReentrantLock lock = new ReentrantLock();
	
	public void testMethod(){
		try {
			semaphore.acquire();
			System.out.println("ThreadName=" + Thread.currentThread().getName() + " ׼��");
			lock.lock();
			System.out.println("begin hello " + System.currentTimeMillis());
			
			for(int i = 0; i < 5; i++){
				System.out.println("ThreadName=" + Thread.currentThread().getName() + " ��ӡ" + (i+1));
			}
			
			System.out.println("end hello " + System.currentTimeMillis());
			lock.unlock();
			semaphore.release();
			System.out.println("ThreadName=" + Thread.currentThread().getName() + " ����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			
		}
	}
}
