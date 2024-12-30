package day15;

public class TestA {
	static int count=0;
	
	public TestA() {
		count++;
	}
	
	public static void getInfo() {
		System.out.println("현재까지 만들어진 객체는 총 "+count+"개 입니다.");
	}
}
