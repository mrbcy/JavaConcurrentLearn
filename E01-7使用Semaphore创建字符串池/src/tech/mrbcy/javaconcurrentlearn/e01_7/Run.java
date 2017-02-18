package tech.mrbcy.javaconcurrentlearn.e01_7;

public class Run {
	public static void main(String[] args) {
		ListPool listPool = new ListPool();

		
		MyThread[] threads = new MyThread[12];
		
		for(int i = 0; i < threads.length; i++){
			threads[i] = new MyThread(listPool);
			threads[i].start();
		}
	}
}
