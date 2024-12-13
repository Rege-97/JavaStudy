package day05;

import java.io.*;

public class Day05_02 {

	public static void main(String[] args) throws IOException {
		// 문자열 입력 후 연산 실습(파싱)

		// 입력을 받기 위해 BufferedReader 객체인 br 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("국어 : ");
		int kor = Integer.parseInt(br.readLine()); // 입력받은 문자열을 int 타입으로 파싱 후 kor에 저장

		System.out.print("영어 : ");
		int eng = Integer.parseInt(br.readLine()); // 입력받은 문자열을 int 타입으로 파싱 후 eng에 저장

		System.out.print("수학 : ");
		int mat = Integer.parseInt(br.readLine()); // 입력받은 문자열을 int 타입으로 파싱 후 mat에 저장

		int sum = kor + eng + mat; // kor, eng, mat의 값을 더한 후 int 타입의 sum에 저장
		double avg = sum / 3.0; // sum을 double타입으로 평균을 내기 위해 3.0으로 나눠서 avg에 저장

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	} 

}
