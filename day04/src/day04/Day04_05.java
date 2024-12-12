package day04;

import java.io.*; // 입력을 위해 java.io의 패키지를 전부 가져옴

public class Day04_05 {

	public static void main(String[] args) throws IOException {
		// 자바의 기본 입력2
		// 예외상황을 JVM에게 넘겨주기 위해 throws IOException을 main에 추가

		System.out.print("첫번째 : ");
		int a = System.in.read();	// 입력을 받을 때 문자와 함께 엔터까지 개행으로 입력으로 인식하여 버퍼에 저장
		
//		System.in.read();	// 입력을 다시 받아서 버퍼에 있는 데이터를 초기화
//		System.in.read();

		System.in.skip(2);	// 입력을 받은 데이터를 버퍼에서 2바이트(엔터)만큼 스킵
		
		System.out.print("두번째 : ");
		int b = System.in.read();

		System.in.skip(2);

		System.out.print("세번째 : ");
		int c = System.in.read();

		System.in.skip(2);
		
		System.out.println("a = " + a + " / b = " + b + " / c = " + c);

	}

}
