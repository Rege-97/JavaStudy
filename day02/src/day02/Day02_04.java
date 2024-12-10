package day02;

public class Day02_04 {

	public static void main(String[] args) {
		// 변수 실습 2 (이름 및 과목 총점 출력)

		// 국어, 영어, 수학 변수 선언 및 값 저장
		int kor = 90;
		int eng = 80;
		int mat = 70;
		
		// String을 사용하여 문자열인 "홍길동"을 변수 name을 선언 후 저장
		String name = "홍길동";

		// 총점을 저장할 sum을 선언 후 과목 점수를 더하여 저장
		int sum = kor + eng + mat;

		// 출력
		System.out.println("수험자 : " + name);
		System.out.println("총점 : " + sum + "점");

	}

}
