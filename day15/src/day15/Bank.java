package day15;

public class Bank {

	String name;
	String acount;
	int money;
	static double iyul = 0.07;

	public Bank() {
		name = "무명";
		acount = "0000-0000-000";
		money = 50000;
//		iyul = 0.07;
	}

	public void inMoney(int inmoney) {
		System.out.println();
		money += inmoney;

		System.out.println(inmoney + "원이 입금되었습니다.");
		System.out.println("잔액은 " + money + "원 입니다.");

	}

	public void outMoney(int money) {
		System.out.println();
		if (this.money - money >= 0) {
			this.money -= money;

			System.out.println(money + "원이 출금되었습니다.");
			System.out.println("잔액은 " + this.money + "원 입니다.");

		} else {
			System.out.println(money + "원을 출금하기엔 " + (money - this.money) + "원 만큼 잔액이 부족합니다.");
			System.out.println("현재 잔액 : " + this.money + "원");
		}

	}

	public void getInfo() {
		System.out.println();
		System.out.println("예금주 : " + name);
		System.out.println("계좌번호 : " + acount);
		System.out.println("이자율 : " + iyul);
		System.out.println("잔액(이자포함) : " + (int) (money * (1 + iyul)) + "원");
	}

}
