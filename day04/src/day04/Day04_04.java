package day04;

import java.io.*; // 입력을 위해 java.io의 패키지를 전부 가져옴

public class Day04_04 {
	
	public static void main(String[] args) throws IOException {
		// 자바의 기본 입력1
		// 예외상황을 JVM에게 넘겨주기 위해 throws IOException을 main에 추가
		
		System.out.println("A");
		int a = System.in.read(); // 기본 입력문
		System.out.println("B");
		System.out.println("a = " + a);
		
		
	}

}
