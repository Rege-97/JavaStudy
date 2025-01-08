package day20;

public class ExcepTest1 {

	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		try {
			String str = null;
			System.out.println("str = " + str.toString());
		} catch (NullPointerException e) {
			System.out.println("실행할 객체가 존재하지 않습니다.");
			e.printStackTrace();
		}
		System.out.println("프로그램의 끝");
	}

}
