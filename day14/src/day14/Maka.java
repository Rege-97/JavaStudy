package day14;

public class Maka {

	// 변수 선언영역 - 멤버 변수
	String color;	// 전역 변수 - 어디서든 사용 가능(자바에서는 없는 개념)
	
	// 생성자 선언영역 - 멤버 변수의 초기화
	public Maka() {
		color="검정";
	}
	

	// 메서드 기능 선언영역 - 멤버 메서드
	public void makaWrite() {
		System.out.println(color + "색상의 마커로 글을 씁니다.");
	}

}
