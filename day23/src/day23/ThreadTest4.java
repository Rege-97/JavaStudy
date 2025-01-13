package day23;

class ThreadD extends Thread {
	@Override
	public void run() {
		System.out.println("##ThreadD의 시작##");

		for (int i = 1; i <= 50; i++) {
			System.out.println("##ThreadD의 값 : " + i + "##");
		}

		System.out.println("##ThreadD의 끝##");
	}
}

public class ThreadTest4 {

	public static void main(String[] args) {

		ThreadD td = new ThreadD();
		td.setDaemon(true);
		td.start();

		System.out.println("너 데몬스레드야? " + td.isDaemon());

		System.out.println("==main의 시작==");

		for (int i = 1; i <= 10; i++) {
			System.out.println("==main의 값 : " + i + "==");
		}

		System.out.println("==main의 끝==");
	}

}
