package day03;

public class Day03_03 {

	public static void main(String[] args) {

		System.out.println("3. 비트 시프트 연산자");

		/*
		 * 형식 값 << 자리이동횟수
		 * 
		 * 1.<< : 왼쪽으로 원하는 비트 수 만큼 이동하며 남은 공간은 0으로 채움
		 * 2.>> : 오른쪽으로 원하는 비트 수 만큼 이동하며 남은 공간은 부호화비트로 채움 
		 * 3.>>> : 오른쪽으로 원하는 비트 수 만큼 이동하며 남은 공간은 무조건 0으로 채움
		 */

		int num2 = 6;
		System.out.println("num2 = " + num2);
		System.out.println("num2 << 2 = " + (num2 << 2));
		System.out.println("num2 >> 2 = " + (num2 >> 2));
		System.out.println("num2 >>> 2 = " + (num2 >>> 2));

		int num3 = -6;
		System.out.println("num3 = " + num3);
		System.out.println("num3 << 2 = " + (num3 << 2));
		System.out.println("num3 >> 2 = " + (num3 >> 2));
		System.out.println("num3 >>> 2 = " + (num3 >>> 2));
		
		System.out.println("4. 관계 연산자");
		
		System.out.println("7 > 3 = " + (7 > 3));
		System.out.println("7 < 3 = " + (7 < 3));
		System.out.println("7 == 3 = " + (7 == 3));
		System.out.println("7 != 3 = " + (7 != 3));
		
		System.out.println("5. 비트 연산자");
		
		/* 1. & (and 연산자)
		 * 	대조되는 비트를 비교하여 둘 다 1이면 1을 반환, 하나라도 0이면 0을 반환
		 * 2. | (or 연산자)
		 * 	대조되는 비트를 비교하여 하나라도 1이면 1을 반환, 둘 다 0이면 0을 반환
		 * 3. ^ (XOR 연산자)
		 * 	대조되는 비트를 비교하여 같으면 0을 다르면 1을 반환
		 * */
		
		int a = 12;
		int b = 9;
		
		System.out.println("a = " + a + " / b = " + b);
		System.out.println("a & b = " + (a & b));
		System.out.println("a | b = " + (a | b));
		System.out.println("a ^ b = " + (a ^ b));
		
		/* 12	0000 1100
		 * 9	0000 1001
		 * 
		 * &	0000 1000	->	8
		 * |	0000 1101	->	13
		 * ^	0000 0101	->	5
		 * */
		
		System.out.println("6. 논리 연산자");
		
		System.out.println("true && true = " + (true && true));
		System.out.println("true && false = " + (true && false));
		System.out.println("false && true = " + (false && true));
		System.out.println("false && false = " + (false && false));
		
		System.out.println("true || true = " + (true || true));
		System.out.println("true || false = " + (true || false));
		System.out.println("false || true = " + (false || true));
		System.out.println("false || false = " + (false || false));
		
		System.out.println(7 > 5 && 3 > 6);	// true && false = false
		
//		// 논리연산자의 특징
		//  - 논리 연산자는 목적값을 취하는 연산자
//		
//		int i = 1;
//		int j = i++;
//		
//		if((i>++j)&&(i++==j)) {	// 앞의 식이 false가 나오므로 뒤의 식이 실행되지 않음
//			i+=j;
//		}
//		
//		System.out.println("i = " + i + " j = " + j);
		
		int i = 1;
		int j = (i++) + i;
		System.out.println("i = " + i + " / j = " + j);

		
		
		
	}

}
