package day03;

import java.text.DecimalFormat;

public class Day03_02 {

	public static void main(String[] args) {

		// 연산자 실습

		// 각 과목의 변수를 선언 후 점수 저장
		int kor = 90;
		int eng = 85;
		int mat = 75;

		int sum = kor + eng + mat; // 세 과목의 합을 구하여 sum에 저장

		// avg를 double 타입으로 선언 후 sum을 과목의 수인 3.0으로 나누어 평균값을 avg에 저장
		// double 타입으로 형변환을 위해 3.0을 사용
		double avg = sum / 3.0;

		System.out.println("총점 : " + sum + "점"); // 총점 출력
		System.out.println("평균 : " + avg + "점"); // 평균 출력

		DecimalFormat df = new DecimalFormat();
		df.applyLocalizedPattern("#.00");

		System.out.println("평균 : " + df.format(avg) + "점");

	}

}
