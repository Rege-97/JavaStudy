package day05;

import java.io.*;

public class Day05_04 {

	public static void main(String[] args) throws IOException {
		// 단일 IF문

		System.out.print("첫번째 수 : ");
		int num1 = System.in.read() - 48;
		System.in.skip(2);

		System.out.print("두번째 수 : ");
		int num2 = System.in.read() - 48;

		if (num2 == 0) {
			System.out.println("자연수는 0으로 나눌 수 없습니다.");
			System.exit(0);	// 종료문
		}	

		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));			

	}

}
