package day23;

class Bank {
	private int money;

	// 입금
	synchronized public void bSave(String name, int money) {

		this.money = this.money + money;
		System.out.println(name + "가 " + money + "원을 입금하여 " + this.money + "원 잔액이 남았습니다.");

	}

	// 출금
	synchronized public void bLoad(String name, int money) {
		if (this.money < money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		this.money = this.money - money;
		System.out.println(name + "가 " + money + "원을 출금하여 " + this.money + "원 잔액이 남았습니다.");
	}
}

class Parent extends Thread {

	String name;
	Bank bank;

	public Parent(String name, Bank bank) {
		this.name = name;
		this.bank = bank;
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			int savemoney = (int) (Math.random() * 5 + 1) * 100;
			int loadmoney = (int) (Math.random() * 5 + 1) * 100;

			bank.bSave(name, savemoney);
			bank.bLoad(name, loadmoney);

		}

	}
}

public class ThreadTest5 {

	public static void main(String[] args) {

		Bank b = new Bank();

		Parent papa = new Parent("아빠", b);
		Parent mama = new Parent("엄마", b);

		papa.start();
		mama.start();
	}

}
