package day19;

import java.io.*;

// 사람들을 관리할 수 있는 People 클래스 생성
class People {
	String name; // 이름
	int age; // 나이
	String subject; // 교과, 전공

	public People() {

	}

	public void getInput() throws IOException {

	}

	public void getInfo() {
		System.out.println("정보가 없습니다.");
	}
}

// 선생님 객체를 만들 Teacher 클래스를 People로 상속 받은 후 생성
class Teacher extends People {
	public void Teacher() {

	}

	@Override
	public void getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println();
		System.out.println("====선생님 정보입력====");
		System.out.print("이름 : ");
		name = br.readLine();
		System.out.print("나이 : ");
		age = Integer.parseInt(br.readLine());
		System.out.print("교과 : ");
		subject = br.readLine();

	}

	@Override
	public void getInfo() {
		System.out.println();
		System.out.println(name + " 선생님");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("교과 : " + subject);
	}
}

// 학생 객체를 만들 Student 클래스를 People로 상속 받은 후 생성
class Student extends People {
	public void Student() {
	}

	@Override
	public void getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println();
		System.out.println("====학생 정보입력====");
		System.out.print("이름 : ");
		name = br.readLine();
		System.out.print("나이 : ");
		age = Integer.parseInt(br.readLine());
		System.out.print("전공 : ");
		subject = br.readLine();

	}

	@Override
	public void getInfo() {
		System.out.println();
		System.out.println(name + "학생");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전공 : " + subject);
	}
}

public class School {

	// 프로그램 시작 및 입력 메서드
	public static int start() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println();
		System.out.println("=======================");
		System.out.println("학사관리 프로그램 v1.0");
		System.out.println("-----------------------");
		System.out.println("1. 선생님 정보입력");
		System.out.println("2. 학생 정보입력");
		System.out.println("3. 선생님 정보보기");
		System.out.println("4. 학생 정보보기");
		System.out.println("5. 모든 정보보기");
		System.out.println("6. 종료");
		System.out.println("=======================");
		System.out.print("메뉴 > ");

		int user = Integer.parseInt(br.readLine());

		return user;
	}

	// 모든 정보를 출력할 때 선생님 - 학생순으로 정렬해주는 메서드
	public static void peopleSort(People[] arr) {
		People temp;

		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (arr[i] instanceof Student && arr[j] instanceof Teacher) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

	}

	// 입력받은 메뉴 실행 메서드
	public static void run(People[] arr, int user) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		switch (user) {
		case 1:
			if (arr[9] != null) { // arr[9]의 값이 null이 아니면 모든 객체가 생성됐으므로 저장 불가
				System.out.println();
				System.out.println("더이상 저장할 수 없습니다.");
			}
			for (int i = 0; i < 10; i++) {
				if (arr[i] == null) { // arr[i]의 값이 null이면 해당 자리에 순차적으로 객체 생성
					arr[i] = new Teacher();
					arr[i].getInput();
					break; // 한번이라도 객체가 생성되면 break 하여 생성 종료
				}
			}
			break;
		case 2:
			if (arr[9] != null) { // arr[9]의 값이 null이 아니면 모든 객체가 생성됐으므로 저장 불가
				System.out.println();
				System.out.println("더이상 저장할 수 없습니다.");
			}
			for (int i = 0; i < 10; i++) {
				if (arr[i] == null) { // arr[i]의 값이 null이면 해당 자리에 순차적으로 객체 생성
					arr[i] = new Student();
					arr[i].getInput();
					break; // 한번이라도 객체가 생성되면 break 하여 생성 종료
				}
			}
			break;
		case 3:
			System.out.println();
			System.out.println("등록된 선생님 정보 출력");
			for (int i = 0; i < 10; i++) {
				if (arr[i] instanceof Teacher) { // arr[i]의 객체가 Teacher이면 getInfo 순차적으로 실행
					arr[i].getInfo();
				}
			}
			break;
		case 4:
			System.out.println();
			System.out.println("등록된 학생 정보 출력");
			for (int i = 0; i < 10; i++) {
				if (arr[i] instanceof Student) { // arr[i]의 객체가 Student이면 getInfo 순차적으로 실행
					arr[i].getInfo();
				}
			}
			break;
		case 5:
			peopleSort(arr); // 모든 정보를 출력하기 전 정렬 메서드를 사용하여 선생님-학생 순으로 정렬
			System.out.println();
			System.out.println("모든 정보 출력");
			for (int i = 0; i < 10; i++) { // arr[i]의 데이터가 null이 아니라면 getInfo 순차적으로 실행
				if (arr[i] != null) {
					arr[i].getInfo();
				}
			}
			break;
		case 6:
			System.out.println(); // 입력값이 6이면 프로그램 종료 문구 출력
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println(); // 입력값이 다른 숫자이면 잘못 입력 출력
			System.out.println("잘못 입력하였습니다.");
		}
	}

	public static void main(String[] args) throws IOException {
		People arr[] = new People[10]; // 10명의 데이터를 저장할 People 타입의 배열 생성

		while (true) { // 무한 반복을 위해 조건을 true로 while문 작성

			int user = start(); // 시작 및 입력 메서드를 실행 후 user에 입력값 저장

			run(arr, user); // 데이터를 저장할 arr과 입력값인 user를 매개변수로 run 메서드 실행

			if (user == 6) { // run 메서드 실행 후 user의 값이 6이면 break로 반복 종료
				break;
			}
		}

	}

}
