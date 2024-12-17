package day07;

import java.io.*;

public class Day07_01 {

	public static void main(String[] args) throws IOException {
		// switch문(조건문)

		System.out.println("==중국집 ARS 주문프로그램 v2.0==");
		System.out.println("1.짜장면  2.짬뽕  3.탕수육  4.팔보채");
		System.out.print("메뉴> ");
		int menu = System.in.read() - 48;

		switch (menu) {
		case 1:
			System.out.println("짜장면 시켰음 조리바람~");
			break;
		case 2:
			System.out.println("짬뽕 시켰음 조리바람~");
			break;
		case 3:
			System.out.println("탕수육 시켰음 조리바람~");
			break;
		case 4:
			System.out.println("팔보채 시켰음 조리바람~");
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}

	}

}
