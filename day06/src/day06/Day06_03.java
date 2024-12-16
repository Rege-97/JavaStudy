package day06;

import java.io.*;

public class Day06_03 {

	public static void main(String[] args) throws IOException {
		// IF문 실습 2

		System.out.print("문자 입력 : ");

		int user = System.in.read();

		if ('0' <= user && user <= '9') {
			System.out.println("입력한 " + (char) user + "은 숫자입니다.");
		} else if ((65 <= user && user <= 'Z')||('a' <= user && user <= 'z')) {
			System.out.println("입력한 " + (char) user + "은 영문자입니다.");
		} else {
			System.out.println("입력한 " + (char) user + "은 기타문자입니다.");
		}

	}

}
 