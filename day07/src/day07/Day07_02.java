package day07;

import java.io.*;

public class Day07_02 {

	public static void main(String[] args) throws IOException {
		// switch문 실습

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("국어 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학 : ");
		int mat = Integer.parseInt(br.readLine());

		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		int grade = (int)avg / 10;

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

		switch (grade) {
		case 10:
			System.out.println("등급 : A");
			break;
		case 9:
			System.out.println("등급 : A");
			break;
		case 8:
			System.out.println("등급 : B");
			break;
		case 7:
			System.out.println("등급 : C");
			break;
		case 6:
			System.out.println("등급 : D");
			break;
		default:
			System.out.println("등급 : F");

		}

	}

}
