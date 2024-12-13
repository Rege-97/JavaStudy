package day05;

import java.io.*;

public class Day05_05 {

	public static void main(String[] args) throws IOException {
		// IF~ELSE문

		System.out.print("첫번째 수 : ");
		int num1 = System.in.read() - 48;
		System.in.skip(2);

		System.out.print("두번째 수 : ");
		int num2 = System.in.read() - 48;

		if (num1 > num2) {
			System.out.println("num1의 변수가 크며 그 값은 : " + num1);
		} else {
			System.out.println("num2의 변수가 크며 그 값은 : " + num2);
		}

		System.out.println("프로그램 종료됨!");
	}

}

