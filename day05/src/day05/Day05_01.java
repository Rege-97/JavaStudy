package day05;

import java.io.*;

public class Day05_01 {

	public static void main(String[] args) throws IOException {
		// 문자열 입력 후 연산(파싱)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫번째 수 : ");
		String num1_s = br.readLine();
		int num1 = Integer.parseInt(num1_s);

		System.out.print("두번째 수 : ");
		String num2_s = br.readLine();
		int num2 = Integer.parseInt(num2_s);

		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

	}

}
