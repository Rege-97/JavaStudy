package day08;

import java.io.*;

public class Day08_01 {

	public static void main(String[] args) throws IOException {
		// for문 활용1

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 입력 : ");
		int user = Integer.parseInt(br.readLine());

		int sum = 0;

		for (int i = 1; i <= user; i++) {

			System.out.print(i);
			if (i % 2 == 0) {
				if (i != 10) {
					System.out.print(" + ");
					sum += i;
				}
			} else {
				System.out.print(" - ");
				sum -= i;
			}
		}

		System.out.println(" = " + sum);
	}
}
