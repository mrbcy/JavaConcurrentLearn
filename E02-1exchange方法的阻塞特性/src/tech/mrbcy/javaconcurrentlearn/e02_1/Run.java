package tech.mrbcy.javaconcurrentlearn.e02_1;

import java.util.concurrent.Exchanger;

public class Run {
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<String>();
		
		ThreadA a = new ThreadA(exchanger);
		a.start();
		System.out.println("main end!");
	}
}
