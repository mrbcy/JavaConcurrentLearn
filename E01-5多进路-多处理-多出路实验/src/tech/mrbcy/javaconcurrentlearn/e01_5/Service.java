package tech.mrbcy.javaconcurrentlearn.e01_5;

import java.util.concurrent.Semaphore;

public class Service {
	private Semaphore semaphore = new Semaphore(3);
	
	public void testMethod(){
		try {
			semaphore.acquire();
			System.out.println("ThreadName=" + Thread.currentThread().getName() + " ׼��");
			System.out.println("begin hello " + System.currentTimeMillis());
			
			for(int i = 0; i < 5; i++){
				System.out.println("ThreadName=" + Thread.currentThread().getName() + " ��ӡ" + (i+1));
			}
			
			System.out.println("end hello " + System.currentTimeMillis());
			semaphore.release();
			System.out.println("ThreadName=" + Thread.currentThread().getName() + " ����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			
		}
	}
}
