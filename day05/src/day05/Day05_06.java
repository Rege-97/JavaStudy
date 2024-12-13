package day05;

import java.io.*;

public class Day05_06 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("숫자를 입력하세요 : ");
		int num = System.in.read()-48;
		
		if(num%2==0) {
			System.out.println(num+"은 짝수입니다.");
		}else {
			System.out.println(num+"은 홀수입니다.");
		}
		System.out.println("프로그램 종료");

	}

}
