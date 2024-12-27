package day13;

import java.io.*;

public class Day13_07 {

	public static int aaa(int num1, int num2, int user) {
		int result = 0;

		if (user == '+') {
			result = num1 + num2;
		} else if (user == '-') {
			result = num1 - num2;
		} else if (user == '*') {
			result = num1 * num2;
		} else if (user == '/') {
			result = num1 / num2;
		}

		return result;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫번째 수 : ");
		int num1 = Integer.parseInt(br.readLine());

		System.out.print("두번째 수 : ");
		int num2 = Integer.parseInt(br.readLine());

		System.out.print("연산자(+,-,*,/) : ");
		int user = System.in.read();

		int result = aaa(num1, num2, user); 

		System.out.println(num1+" "+((char)user)+" "+num2+ " = " + result);

	}

}
