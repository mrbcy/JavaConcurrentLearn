package tech.mrbcy.javaconcurrentlearn.e01_6;

public class Run {
	public static void main(String[] args) {
		Service service = new Service();

		
		TestThread[] threads = new TestThread[12];
		
		for(int i = 0; i < threads.length; i++){
			threads[i] = new TestThread(service);
			threads[i].start();
		}
	}
}
