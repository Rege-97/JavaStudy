package day08;

public class Day08_06 {

	public static void main(String[] args) {
		// while문 1

		// while과 do~while 행위의 의한 반복문
		// for(초기식; 조건식; 증감식) -> while - 초기식과 증감식이 생략

		boolean sw = true;
		int count = 0;

		while (sw) {
			System.out.println("내 이름은 홍길동!");
			count++;
			if (count == 5) {
				sw = false;
			}
		}

		// 임의적인 초기식
		char temp = 'A';

		while (temp <= 90) {
			System.out.print(temp + " ");
			// 임의적인 증가식
			temp++;
		}
		
		System.out.println();

		int temp2 = 1;

		do {
			System.out.println("temp2 = " + temp2);
			temp2++;
		} while (temp2 <= 2);

	}

}
