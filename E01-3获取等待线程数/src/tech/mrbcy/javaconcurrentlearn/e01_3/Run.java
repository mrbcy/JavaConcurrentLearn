package tech.mrbcy.javaconcurrentlearn.e01_3;

public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		
		TestThread firstThread = new TestThread(service);
		firstThread.start();
		
		TestThread[] threads = new TestThread[4];
		
		for(int i = 0; i < 4; i++){
			threads[i] = new TestThread(service);
			threads[i].start();
		}
	}
}
