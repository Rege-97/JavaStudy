package day15;

public class BankTest {

	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.name = "김채현";
		b1.acount = "1234-1234-123";

		b1.inMoney(500000);
		b1.outMoney(47500);
		b1.outMoney(1000000);
		b1.getInfo();

		System.out.println("----------------------");

		Bank b2 = new Bank();
		b2.name = "둘리";
		b2.acount = "1111-1111-111";

		b2.getInfo();

		System.out.println("----------------------");

		Bank b3 = new Bank();
		b3.name = "홍길동";
		b3.acount = "2222-2222-222";

		b3.getInfo();

		System.out.println("----------------------");
//		b1.iyul=0.1;
		Bank.iyul = 0.1;

		b1.getInfo();
		b2.getInfo();
		b3.getInfo();
		
		b2.setMoney(500);
		b2.getInfo();
	}

}
