package day07;

public class Day07_04 {

	public static void main(String[] args) {
		// for문 실습

		int sum = 0;

		for (int i = 0; i <= 50; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
				sum += i;
			}
		}

		System.out.println("0 ~ 50까지 5의 배수의 합 : " + sum);
		System.out.println("-----------------------------------");

		int sum2 = 0;

		for (int i = 0; i <= 50; i += 5) {
			System.out.println(i);
			sum2 += i;
		}

		System.out.println("0 ~ 50까지 5의 배수의 합 : " + sum2);

	}

}
