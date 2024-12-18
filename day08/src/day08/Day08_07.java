package day08;

import java.io.*;

public class Day08_07 {

	public static void main(String[] args) throws IOException {
		// while문 2

		while (true) {
			System.out.println("== 숫자 입력 확인 프로그램 ==");
			int user = 0;
			do {
				System.out.print("숫자 입력(0 : 종료) : ");
				user = System.in.read();
				System.in.skip(2);
			} while (!(48 <= user && user <= 57));

			if (user == '0') {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}

			System.out.println("입력한 숫자 : " + (char) user);
		}

	}

}
