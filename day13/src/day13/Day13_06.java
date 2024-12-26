package day13;

import java.io.*;

public class Day13_06 {

	public static void hello(String name, int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println(name + "님 안녕하세요!");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 입력 : ");
		String name = br.readLine();
		System.out.print("인사 횟수 : ");
		int num = Integer.parseInt(br.readLine());

		hello(name, num);

	}

}
