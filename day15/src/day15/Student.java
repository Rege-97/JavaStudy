package day15;

public class Student {

	String name;
	int kor;
	int eng;
	int mat;

	public Student() {
		name = "무명";
		kor = 0;
		eng = 0;
		mat = 0;
	}

	public void getInfo() {
		System.out.println(name + " " + kor + " " + eng + " " + mat + " ");
	}

}
