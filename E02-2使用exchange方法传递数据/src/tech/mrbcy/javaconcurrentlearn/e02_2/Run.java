package tech.mrbcy.javaconcurrentlearn.e02_2;

import java.util.concurrent.Exchanger;

public class Run {
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<String>();
		
		ThreadA a = new ThreadA(exchanger);
		ThreadB b = new ThreadB(exchanger);
		a.start();
		b.start();
	}
}
