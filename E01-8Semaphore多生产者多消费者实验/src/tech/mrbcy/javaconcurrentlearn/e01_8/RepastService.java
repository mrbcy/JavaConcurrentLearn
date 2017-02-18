package tech.mrbcy.javaconcurrentlearn.e01_8;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


public class RepastService {
	volatile private Semaphore setSemaphore = new Semaphore(10); // 生产者
	volatile private Semaphore getSemaphore = new Semaphore(20); // 消费者
	volatile private ReentrantLock lock = new ReentrantLock();
	volatile private Condition setCondition = lock.newCondition();
	volatile private Condition getCondition = lock.newCondition();
	// 暂存产品，只能有4个
	volatile private Object[] produceShelf = new Object[4];
	
	private boolean isEmpty() {
		boolean isEmpty = true;
		for(int i = 0; i < produceShelf.length; i++){
			if(produceShelf[i] != null){
				isEmpty = false;
				break;
			}
		}
		
		return isEmpty;
	}
	
	private boolean isFull() {
		boolean isFull = true;
		for(int i = 0; i < produceShelf.length; i++){
			if(produceShelf[i] == null){
				isFull = false;
				break;
			}
		}
		return isFull;
	}
	
	public void set() {
		try {
			setSemaphore.acquire();
			lock.lock();
			
			while(isFull()){
				setCondition.await();
			}
			
			for(int i = 0; i < produceShelf.length; i++){
				if(produceShelf[i] == null){
					produceShelf[i] = "数据";
					System.out.println(Thread.currentThread().getName() 
							+ " 生产了 " + produceShelf[i]);
					break;
				}
			}
			
			getCondition.signalAll();
			lock.unlock();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			setSemaphore.release();
		}
		
	}
	
	public void get() {
		try {
			getSemaphore.acquire();
			lock.lock();
			while (isEmpty()){
				getCondition.await();
			}
			
			for(int i = 0; i < produceShelf.length; i++){
				if(produceShelf[i] != null){
					System.out.println(Thread.currentThread().getName() 
							+ " 消费了 " + produceShelf[i]);
					produceShelf[i] = null;
					break;
				}
			}
			
			setCondition.signalAll();
			lock.unlock();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getSemaphore.release();
		}
	}
}
