package day02;

public class Day02_01 {

	public static void main(String[] args) {
		// 자료형

		System.out.println("1.논리 자료형");

		boolean bool; // 논리형 변수 bool 선언
		bool = true; // 변수 bool 초기화

		System.out.println("bool = " + bool); // 변수 bool 출력

		boolean bool2 = false; // 논리형 변수 bool2 선언과 동시에 초기화
		System.out.println("bool2 = " + bool2); // 변수 bool2 출력

		System.out.println("2.정수 자료형");

		byte by1; // 정수 자료형 byte를 이용하여 변수 by1를 선언
		by1 = 127; // 변수 by1 초기화 (byte의 범위는 -128~127)

		by1++; // 증감연산자를 사용하여 간접 오버플로우 발생

		System.out.println("by1 = " + by1); // 변수 by1 출력 (간접 오버플로우로 인해 -128 출력)

		char ch = 'A' + 1; // 정수 자료형(문자) char을 이용하여 변수 ch 선언 (정수 자료형이기 때문에 정수연산 가능)

		System.out.println("ch = " + ch); // 변수 ch 출력 ('A'에 정수 1을 더하여 B출력)

		short sh = 1004; // 정수 자료형 short(거의 사용안함)를 이용하여 변수 sh 선언
		System.out.println("sh = " + sh); // 변수 sh 출력

		int in = 10004; // 정수 자료형 int(기본 정수형)를 이용하여 변수 in 선언
		System.out.println("in = " + in); // 변수 in 출력

		byte num1 = 3;
		byte num2 = 4;
		int result = num1 + num2; // num1과 num2를 더할 때 자료형을 따로 선언하지 않으면 기본형인 int로 저장함

		System.out.println("result = " + result);

		long lo = 1234L; // 정수 자료형 long을 이용하여 변수 lo 선언(뒤에 L을 붙이면 long타입으로 유지)
		System.out.println("lo = " + lo);

		System.out.println("3.실수 자료형");

		float fl = 3.141592f; // 실수 자료형 float을 이용하여 변수 fl 선언(접미어 f 사용하여 double과 구분)
		System.out.println("fl = " + fl);

		double dou = 3.141592; // 실수 자료형 double을 이용하여 변수 dou 선언(기본 자료형)
		System.out.println("dou = " + dou);
	}

}
