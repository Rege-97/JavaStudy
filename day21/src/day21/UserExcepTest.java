package day21;

import java.util.*;

class YongException extends Exception {
	public YongException() {
		super("용예외 : 미성년자 삐용삐용~ 예외~");
	}
}

public class UserExcepTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("몇살이에요? : ");
			int age = sc.nextInt();

			System.out.println("입력하신 나이는 " + age + "세 입니다.");

			if (age < 20) {
				// System.out.println("미성년자는 안되요~");
				throw new YongException();
			}

			System.out.println("성인 환영합니다~");

		} catch (YongException e) {
			System.out.println("미성년자는 안되요~");
			e.printStackTrace();
		} finally {
			System.out.println("공통 메세지 : 모두 즐거운 시간 가지세요~");
		}
	}

}
