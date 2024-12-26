package day13;

public class Day13_03 {

	public static int getMaxNum(int num1, int num2) {

		int max = num1 > num2 ? num1 : num2;

		return max;

	}

	public static void main(String[] args) {
		// 메서드 3 - Call by value
		
		int num1 = 10;
		int num2 = 20;

		int max = getMaxNum(num1, num2);
		// int max = num1 > num2 ? num1 : num2;

		System.out.println("큰 수 = " + max);

	}

}
