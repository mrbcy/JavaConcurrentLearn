package tech.mrbcy.javaconcurrentlearn.e01_3;

public class TestThread extends Thread{
	private Service service;

	public TestThread(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		
		service.testMethod();
	}
	
	
}
