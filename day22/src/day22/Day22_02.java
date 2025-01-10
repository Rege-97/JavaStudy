package day22;

import java.util.*;

public class Day22_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String srr[] = { "자바의 정석", "자바 첫걸음", "java 그까이꺼", "java참 쉬워요", "jsp기초", "jsp기초부터 중급까지", "자기소개서", "자우징장징징" };
		System.out.print("검색 키워드 입력 : ");
		String str = sc.nextLine();

		System.out.println("==출력결과==");
		for (int i = 0; i < srr.length; i++) {
//			if (srr[i].contains(str)) {
//				System.out.println(srr[i]);
//			}
			if(srr[i].startsWith(str)) {
				System.out.println(srr[i]);
			}
//			if(srr[i].indexOf(str)==0) {
//				System.out.println(srr[i]);
//			}
		}
	}

}
