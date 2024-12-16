package day06;

import java.io.*;

public class Day06_04 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("년도 입력 : ");

		int year = Integer.parseInt(br.readLine());

		if (year % 4 == 0 || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		} else if (year % 100 == 0) {
			System.out.println(year + "년은 평년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");

		}

	}

}
