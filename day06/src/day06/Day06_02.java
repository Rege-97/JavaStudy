package day06;

import java.io.*;

public class Day06_02 {

	public static void main(String[] args) throws IOException {
		// IF문 실습 1

		System.out.print("문자 입력 : ");
		int user = System.in.read();

		if (user == 'f' || user == 'F') {
			System.out.println("Father");
		} else if (user == 'm' || user == 'M') {
			System.out.println("Mother");
		} else if (user == 'b' || user == 'B') {
			System.out.println("Brother");
		} else if (user == 's' || user == 'S') {
			System.out.println("Sister");
		} else {
			System.out.println("잘못 입력하였습니다.");
		}

	}

}
