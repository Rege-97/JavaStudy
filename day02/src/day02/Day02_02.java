package day02;

public class Day02_02 {

	public static void main(String[] args) {
		// 변수 실습 (과목 총점 출력하기)

		// 정수형 타입 int로 국어, 영어, 수학에 해당하는 변수를 선언 후 초기화
		int kor = 90;
		int eng = 80;
		int math = 70;

		// 정수형 타입 int로 총점값을 저장할 result를 선언 후 세 과목의 변수를 더하여 저장
		int result = kor + eng + math;

		// 총점인 result 출력
		System.out.println("총점 : " + result + "점");

	}

}
