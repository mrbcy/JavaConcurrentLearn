package tech.mrbcy.javaconcurrentlearn.e01_1;

public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		
		TestThread a = new TestThread(service);
		a.setName("A");
		
		TestThread b = new TestThread(service);
		b.setName("B");
		
		TestThread c = new TestThread(service);
		c.setName("C");
		
		a.start();
		b.start();
		c.start();
	}
}
