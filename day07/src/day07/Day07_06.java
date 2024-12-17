package day07;

import java.io.*;

public class Day07_06 {

	public static void main(String[] args) throws IOException {
		// for문 실습3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 입력 : ");
		int num = Integer.parseInt(br.readLine());
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("입력한 " + num + "은 소수입니다.");
		} else {
			System.out.println("입력한 " + num + "은 소수가 아닙니다.");
		}

//		for (int i = 2; i < num; i++) {
//			if(num%i==0) {
//				System.out.println("입력한"+num+"은 소수가 아닙니다.");
//				System.exit(0);
//			}
//		}
//		System.out.println("입력한 "+num+"은 소수입니다.");

	}

}
