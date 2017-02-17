package tech.mrbcy.javaconcurrentlearn.e01_3;

import java.util.concurrent.Semaphore;

public class Service {
	private Semaphore semaphore = new Semaphore(1);
	
	public void testMethod(){
		try {
			semaphore.acquire();
			Thread.sleep(1000);
			System.out.println("��Լ���� " + semaphore.getQueueLength() + " ���߳��ڵȴ�");
			System.out.println("�Ƿ����߳��ڵȴ��ź�����" + semaphore.hasQueuedThreads());
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			semaphore.release();
		}
	}
}
