package day21;

import java.util.Scanner;

public class Day21_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문장 입력 : ");
		String str1 = sc.nextLine();
		System.out.print("찾을 문자 : ");
		char ch = sc.next().charAt(0);
		int count = 0;

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(ch + "는 총 " + count + "개 입니다.");
		
	}

}
