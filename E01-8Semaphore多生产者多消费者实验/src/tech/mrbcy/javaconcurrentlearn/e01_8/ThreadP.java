package tech.mrbcy.javaconcurrentlearn.e01_8;

public class ThreadP extends Thread{
	
	private RepastService service;

	public ThreadP(RepastService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.set();
	}
	
	

}
