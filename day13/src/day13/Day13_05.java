package day13;

import java.io.*;

public class Day13_05 {

	public static void multiplication(int num) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("단 입력 : ");
		int num = Integer.parseInt(br.readLine());
		
		multiplication(num);

	}

}
