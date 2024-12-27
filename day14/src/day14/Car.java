package day14;

public class Car {

	String driver;
	String name;
	String color;
	int wheel;

	public void go() {
		System.out.println(driver + "(이)가 탄 " + wheel + "개의 바퀴를 가진 " + color + "색 " + name + "차량이 " + "전진합니다.");
	}

	public void back() {
		System.out.println(driver + "(이)가 탄 " + wheel + "개의 바퀴를 가진 " + color + "색 " + name + "차량이 " + "후진합니다.");
	}

	public void getInfo() {
		System.out.println("driver : " + driver);
		System.out.println("name : " + name);
		System.out.println("color : " + color);
		System.out.println("wheel : " + wheel);
	}

}
