package tech.mrbcy.javaconcurrentlearn.e01_8;

public class ThreadC extends Thread{
	
	private RepastService service;

	public ThreadC(RepastService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.get();
	}
	
	

}
