package tech.mrbcy.javaconcurrentlearn.e01_7;

public class MyThread extends Thread{
	private ListPool listPool;

	public MyThread(ListPool listPool) {
		super();
		this.listPool = listPool;
	}

	@Override
	public void run() {
		super.run();
		
		for(int i = 0; i < Integer.MAX_VALUE; i++){
			String getString = listPool.get();
			System.out.println(Thread.currentThread().getName() + " È¡µÃÖµ " 
					+ getString);
			listPool.put(getString);
		}
	}
	
	
}
