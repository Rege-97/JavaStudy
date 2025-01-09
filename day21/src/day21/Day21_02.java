package day21;

import java.util.Scanner;

public class Day21_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문장 입력 : ");
		String str = sc.nextLine();
		System.out.println("문장 출력");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
