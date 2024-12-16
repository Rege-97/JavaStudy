package day06;

import java.io.*;

public class Day06_05 {

	public static void main(String[] args) throws IOException {
		// IF문 실습 4

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("국어 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학 : ");
		int mat = Integer.parseInt(br.readLine());

		int sum = kor + eng + mat;
		double avg = sum / 3;
		char grade = 'F';

		if (90 <= avg && avg <= 100) {
			grade = 'A';
		} else if (80 <= avg && avg <= 89) {
			grade = 'B';
		} else if (70 <= avg && avg <= 79) {
			grade = 'C';
		} else if (60 <= avg && avg <= 69) {
			grade = 'D';
		}

		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.println("등급 : " + grade);

	}

}
