package day05;

import java.io.*;

public class Day05_03 {

	public static void main(String[] args) throws IOException {
		// 입력값 파싱 실습 (원의 넓기 구하기)
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");
		double num = Double.parseDouble(br.readLine());	// 입력받은 문자열을 double 타입으로 파싱 후 num에 저장

		double circle = num * num * Math.PI;

		System.out.printf("원의 넓이 : %.2f", circle);

	}

}
