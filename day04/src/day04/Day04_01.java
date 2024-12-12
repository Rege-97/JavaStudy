package day04;

public class Day04_01 {

	public static void main(String[] args) {
		// 삼항연산자 - 큰 수 찾기

		int num1 = 7;
		int num2 = 5;

		int max = num1 > num2 ? num1 : num2; // num1과 num2를 비교하여 나온 값을 반환 후 max에 저장

		System.out.println("큰 수는? : " + max);	// max 출력

	}

}
