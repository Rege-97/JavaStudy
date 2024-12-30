package day15;

public class Car {

	// 변수선언영역(멤버변수)
	String ownername;
	String carname;
	String carcolor;
	int tire;

	public Car() {
		ownername = "무명";
		carname = "아반떼";
		carcolor = "하얀";
		tire = 4;

	}

	// 메서드선언영역(멤버메서드)
	public void goCar() {
		System.out.println(carcolor + "색상의 " + carname + "이 앞으로 갑니다.");
	}

	public void backCar() {
		System.out.println(carcolor + "색상의 " + carname + "이 뒤로 갑니다.");
	}

	public void getInfo() {
		System.out.println("차주 이름 : " + ownername);
		System.out.println("차 이름 : " + carname);
		System.out.println("차 색상 : " + carcolor);
		System.out.println("바퀴 수 : " + tire);
	}

}
