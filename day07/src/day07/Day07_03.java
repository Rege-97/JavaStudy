package day07;

public class Day07_03 {

	public static void main(String[] args) {
		// for문(반복문)

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "번째 " + "내 이름은 홍길동 입니다.");

			sum += i; // sum = sum + i;
		}
		System.out.println("1 ~ 10까지의 합 : " + sum);
	}

}
