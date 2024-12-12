package day04;

import java.io.*;

public class Day04_06 {

	public static void main(String[] args) throws IOException {
		// 자바의 입력 실습

		System.out.print("첫번째 수 : ");
		int num1 = System.in.read() - 48;

		System.in.skip(2);

		System.out.print("두번째 수 : ");
		int num2 = System.in.read() - '0';

		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

//		int sum = num1 + num2;
//		
//		System.out.printf("%d + %d = %d", num1, num2, sum);

	}

}
