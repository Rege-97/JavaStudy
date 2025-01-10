package day22;

import java.util.*;

public class Day22_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String keywords[] = { "바보", "똥개", "말미잘", "멍게", "해삼", "멍청이", "쪼다" };

		System.out.print("메세지 입력 : ");
		String str = sc.nextLine();

		for (int i = 0; i < keywords.length; i++) {
			String temp = "";
			for (int j = 0; j < keywords[i].length(); j++) {
				temp += "*";
			}
			str = str.replace(keywords[i], temp);
		}
		System.out.println("출력 메세지 : " + str);
	}

}
