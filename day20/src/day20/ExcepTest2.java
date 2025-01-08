package day20;

public class ExcepTest2 {

	public static void main(String[] args) {
		System.out.println("프로그램의 시작");

		try {
			String fruit[] = { "사과", "배", "포도", "딸기" };

			for (int i = 0; i <= fruit.length; i++) {
				System.out.println(fruit[i]);
			}
		} catch (/*ArrayIndexOutOfBoundsException*/ Exception e) {
			System.out.println("잘못된 위치를 지정하였습니다.");
		}

		System.out.println("프로그램의 끝");

	}

}
