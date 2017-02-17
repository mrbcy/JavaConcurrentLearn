package tech.mrbcy.javaconcurrentlearn.e01_4;

public class TestThread extends Thread{
	private Service service;

	public TestThread(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		System.out.println("ThreadName="+this.getName()+" ∆Ù∂Ø¡À!");
		service.testMethod();
	}
	
	
}
