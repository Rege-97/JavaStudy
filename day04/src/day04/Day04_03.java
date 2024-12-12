package day04;

import java.lang.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Day04_03 {

	public static void main(String[] args) {
		// 자바의 기본 출력
		
		
		String name = "홍길동";
		int age = 20;

		System.out.println("이름 : " + name); // println - 개행 기능을 가진 출력 기능
		System.out.println("나이 : " + age + "세");

		System.out.print("이\t름 : " + name + "\n"); // print - 기본 출력 기능
		System.out.print("나\r이 : " + age + "세\n");

		// "\n" - 개행 기능을 가진 제어문자
		// "\r" - 출력 후 앞으로 커서 이동을 하는 제어문자
		// "\t" - 단락 기능을 가진 제어문자

		System.out.printf("이름 : %s\n", name); // printf - 서식출력이 가능한 출력문
		System.out.printf("나이 : %d세\n", age);
		System.out.printf("원주율 : %f\n", 3.141592);
		System.out.printf("원주율 : %.2f\n", 3.141592);
		
		System.out.format("이름 : %s\n", name);	// format - 자바의 서식출력이 가능한 출력문
		System.out.format("나이 : %d\n", age);
		System.out.format("원주율 : %.2f\n", 3.141592);

	}

}
