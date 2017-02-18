package tech.mrbcy.javaconcurrentlearn.e01_8;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		RepastService service = new RepastService();
		
		ThreadP[] threadPs = new ThreadP[60];
		ThreadC[] threadCs = new ThreadC[60];
		
		for(int i = 0; i < 60; i++){
			threadPs[i] = new ThreadP(service);
			threadCs[i] = new ThreadC(service);
		}
		
		Thread.sleep(2000);
		
		for(int i = 0; i < 60; i++){
			threadPs[i].start();
			threadCs[i].start();
		}
	}
}
