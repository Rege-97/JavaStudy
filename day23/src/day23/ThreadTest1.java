package day23;

class ThreadA extends Thread {

	@Override
	public void run() {

		Thread temp = Thread.currentThread();
		System.out.println("temp = " + temp);
		// this는 스레드일 수도 있고 아닐 수도 있음.
		System.out.println("this = " + this);

		System.out.println("##ThreadA의 시작##");

		for (int i = 1; i <= 10; i++) {
			System.out.println("##ThreadA의 값 : " + i + "##");
		}

		System.out.println("##ThreadA의 끝##");
	}

	
	
}

class ThreadB implements Runnable {

	@Override
	public void run() {
		Thread temp = Thread.currentThread();
		System.out.println("temp = " + temp);
		
		System.out.println("@@ThreadB의 시작@@");

		for (int i = 1; i <= 10; i++) {
			System.out.println("@@ThreadB의 값 : " + i + "@@");
		}

		System.out.println("@@ThreadB의 끝@@");

	}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		// 싱글 스레드

		ThreadA ta = new ThreadA();
//		ta.run();
		ThreadB tb = new ThreadB();
		Thread tc = new Thread(tb);
		ta.setPriority(Thread.MAX_PRIORITY); // 우선순위 최고
		tc.setPriority(Thread.MIN_PRIORITY); // 우선순위 최저
		
		tc.start();
		ta.start();
		ta.setName("firstThread");
		System.out.println("ta스레드의 이름 : "+ta.getName());
		
		int count = Thread.activeCount();
		System.out.println("현재 돌고있는 스레드 수 : " + count);
		Thread temp = Thread.currentThread();
		System.out.println("temp = " + temp);
		
//		Thread.yield();

		try {
			ta.join();
			tc.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		System.out.println("==main 시작==");

		for (int i = 1; i <= 10; i++) {
			System.out.println("==main의 값 : " + i + "==");
		}
		System.out.println("==main의 끝==");

	}

}
