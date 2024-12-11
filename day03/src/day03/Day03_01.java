package day03;

public class Day03_01 {

	public static void main(String[] args) {
		// 연산자

		System.out.println("1. 대입연산자와 산술연산자");

		int i = 10;

		System.out.println("i = " + i);

		i = i + 1; // 자가연산

		System.out.println("i = " + i);

		i += 1; // 대입연산자 - i = i + 1과 같음

		System.out.println("i = " + i);

		i++; // 증가연산자

		System.out.println("i = " + i);

		i = i - 1; // 자가연산
		i -= 1; // 대입연산자 - i = i - 1과 같음
		i--; // 감소연산자

		System.out.println("i = " + i);

		// i=i*2; // 자가연산
		i *= 2; // 대입연산자 - i = i * 2와 같음

		System.out.println("i = " + i);

		// i=i/3; // 자가연산
		// i /= 3; // 대입연산자 - i = i / 3와 같음
		// i = i % 3; // 자가연산
		i %= 3; // 대입연산자 - i = i % 3

		System.out.println("i = " + i);

		System.out.println("2. 부정연산자");
		System.out.println("2_1. 비트 부정 연산자 ~");

		int num = 34;

		System.out.println("num = " + num);
		System.out.println("~num = " + ~num); // 2진수로 값을 변환 후 각 자리 값을 부정하여 연산

		System.out.println("2_2. 논리 부정 연산자");

		boolean bool = true;

		System.out.println("bool = " + bool);
		System.out.println("!bool = " + !bool); // 논리값을 부정

	}

}
