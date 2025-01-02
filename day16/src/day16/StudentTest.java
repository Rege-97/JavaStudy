package day16;

import java.io.*;

public class StudentTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("학생 1 정보");

		Student st1 = new Student();
		System.out.print("이름 : ");
		st1.setName(br.readLine());
		System.out.print("국어 : ");
		st1.setKor(Integer.parseInt(br.readLine()));
		System.out.print("영어 : ");
		st1.setEng(Integer.parseInt(br.readLine()));
		System.out.print("수학 : ");
		st1.setMat(Integer.parseInt(br.readLine()));
		System.out.println("===================================");
		System.out.println("학생 2 정보");
		
		Student st2 = new Student();
		System.out.print("이름 : ");
		st2.setName(br.readLine());
		System.out.print("국어 : ");
		st2.setKor(Integer.parseInt(br.readLine()));
		System.out.print("영어 : ");
		st2.setEng(Integer.parseInt(br.readLine()));
		System.out.print("수학 : ");
		st2.setMat(Integer.parseInt(br.readLine()));
		System.out.println("===================================");
		st1.getInfo();
		st2.getInfo();
		
		
		

	}

}
