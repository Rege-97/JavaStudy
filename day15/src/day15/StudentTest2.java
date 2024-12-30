package day15;

import java.io.*;

public class StudentTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("학생1 정보");
		Student s1 = new Student();
		System.out.print("이름 : ");
		s1.name = br.readLine();
		System.out.print("국어 : ");
		s1.kor = Integer.parseInt(br.readLine());
		System.out.print("영어 : ");
		s1.eng = Integer.parseInt(br.readLine());
		System.out.print("수학 : ");
		s1.mat = Integer.parseInt(br.readLine());
		System.out.println("=============================");

		System.out.println("학생2 정보");
		Student s2 = new Student();
		System.out.print("이름 : ");
		s2.name = br.readLine();
		System.out.print("국어 : ");
		s2.kor = Integer.parseInt(br.readLine());
		System.out.print("영어 : ");
		s2.eng = Integer.parseInt(br.readLine());
		System.out.print("수학 : ");
		s2.mat = Integer.parseInt(br.readLine());
		System.out.println("=============================");

		System.out.println("학생3 정보");
		Student s3 = new Student();
		System.out.print("이름 : ");
		s3.name = br.readLine();
		System.out.print("국어 : ");
		s3.kor = Integer.parseInt(br.readLine());
		System.out.print("영어 : ");
		s3.eng = Integer.parseInt(br.readLine());
		System.out.print("수학 : ");
		s3.mat = Integer.parseInt(br.readLine());
		System.out.println("=============================");
		
		s1.getInfo();
		s2.getInfo();
		s3.getInfo();
		
	}

}
