package report;

public class SyntaxErrorExample {

	public static void main(String[] args) {
		int number = 5;						// 세미콜론(;) 표시
		String message = "Hello, Java! ";
		
		for (int i = 0; i < number; i++) {	// for문 () 괄호 명시
			System.out.println(message);	// 변수명 수정
		}
		
		printNumber(number);				// 아래에 메서드 선언
		
		int result = sum(10, 20);
		System.out.println("Result: " + result); // 세미콜론(;) 표시

	}

	public static int sum(int a, int b) {
		return a + b;
	}

	// Number를 매개변수로 받아 출력하는 메서드
	public static void printNumber(int number) {
		System.out.println("Number: " + number);
	}

}
