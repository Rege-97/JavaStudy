package day02;

public class Day02_05 {

	public static void main(String[] args) {
		// 형변환

		byte num1 = 3;
		byte num2 = 4;
		byte result = (byte) (num1 + num2); // 결과값을 byte로 형변환 하여 byte로 값을 저장

		System.out.println("result = " + result); // 출력

		char ch = 'A' + 1; // A의 아스키코드 값 65에서 +1 하여 66인 B 저장
		System.out.println("ch = " + (char) (ch + 1)); 
		// 문자에 정수 1을 더하여 int 데이터로 변환되어 67 출력 - char로 형변환해야 C가 출력 
		
	}

}
