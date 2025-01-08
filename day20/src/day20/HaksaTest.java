package day20;

import java.io.*;

class Human {
	String name;
	int age;

	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("이름 : ");
		name = br.readLine();
		System.out.println("나이 : ");
		age = Integer.parseInt(br.readLine());
	}

	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);

	}
}

class Teacher extends Human {
	String txt;

	@Override
	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("==선생님 정보 입력==");
		super.setInfo(br);
		System.out.println("과목 : ");
		txt = br.readLine();

	}

	@Override
	public void getInfo() {
		System.out.println("==선생님 정보==");
		super.getInfo();
		System.out.println("과목 : " + txt);
	}
}

class Student extends Human {
	String major;

	@Override
	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("==학생 정보 입력==");
		super.setInfo(br);
		System.out.println("전공 : ");
		major = br.readLine();

	}

	@Override
	public void getInfo() {
		System.out.println("==학생 정보==");
		super.getInfo();
		System.out.println("전공 : " + major);
	}
}

public class HaksaTest {

	Human arr[];
	int count;

	public HaksaTest() {
		arr = new Human[10];
		count = 0;

	}

	public void printMenu() {
		System.out.println("========================");
		System.out.println("학사 관리 프로그램 v1.0");
		System.out.println("------------------------");
		System.out.println("1. 선생님 정보 입력");
		System.out.println("2. 학생 정보 입력");
		System.out.println("3. 선생님 정보 확인");
		System.out.println("4. 학생 정보 확인");
		System.out.println("5. 모든 정보 확인");
		System.out.println("6. 종료");
		System.out.println("========================");
	}

	public void setTeacherInfo(BufferedReader br) throws IOException {
		if (count >= 10) {
			System.out.println("더이상 입력하실 수 없습니다.");
			return;
		}
		arr[count] = new Teacher();
		arr[count].setInfo(br);
		count++;
	}

	public void setStudentInfo(BufferedReader br) throws IOException {
		if (count >= 10) {
			System.out.println("더이상 입력하실 수 없습니다.");
			return;
		}
		arr[count] = new Student();
		arr[count].setInfo(br);
		count++;
	}

	public void allInfoPrint() {
		for (int i = 0; i < count; i++) {
			arr[i].getInfo();
		}
	}

	public void printTeacherInfo() {
		for (int i = 0; i < count; i++) {
			if (arr[i] instanceof Teacher) {
				arr[i].getInfo();
			}
		}
	}

	public void printStudentInfo() {
		for (int i = 0; i < count; i++) {
			if (arr[i] instanceof Student) {
				arr[i].getInfo();
			}
		}
	}

	public static void main(String[] args) throws IOException {

		HaksaTest ht = new HaksaTest();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			ht.printMenu();
			System.out.println("메뉴 > ");
			int menu = Integer.parseInt(br.readLine());

			switch (menu) {
			case 1:
				ht.setTeacherInfo(br);
				break;
			case 2:
				ht.setStudentInfo(br);
				break;
			case 3:
				ht.printTeacherInfo();
				break;
			case 4:
				ht.printStudentInfo();
				break;
			case 5:
				ht.allInfoPrint();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}

	}

}
