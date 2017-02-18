package tech.mrbcy.javaconcurrentlearn.e01_5;

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
