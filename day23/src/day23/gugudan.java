package day23;

class Six extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(6 + " * " + i + " = " + (6 * i));
		}

	}
}

class Nine implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(9 + " * " + i + " = " + (9 * i));
		}

	}
}

public class gugudan {

	public static void main(String[] args) {

		Six six = new Six();
		Nine nine = new Nine();
		Thread nine_t = new Thread(nine);
		six.start();
		nine_t.start();
		for (int i = 1; i <= 9; i++) {
			System.out.println(3 + " * " + i + " = " + (3 * i));
		}
	}

}
