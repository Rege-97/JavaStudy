package day07;

import java.io.*;

public class Day07_05 {

	public static void main(String[] args) throws IOException {
		// for문 실습2
		
		System.out.print("단 입력 : ");
		
		int num = System.in.read() - 48;

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

	}

}
