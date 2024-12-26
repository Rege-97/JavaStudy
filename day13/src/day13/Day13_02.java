package day13;

public class Day13_02 {

	public static void valueTest(int num1, int num2) {

		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("num1 = " + num1 + " / num2 = " + num2);

	}

	public static void main(String[] args) {
		// 메서드 2 - Call by value

		int num1 = 10;
		int num2 = 20;

		System.out.println("num1 = " + num1 + " / num2 = " + num2);

		valueTest(num1, num2);
		
		System.out.println("num1 = " + num1 + " / num2 = " + num2);
	}

}
