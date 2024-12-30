package day15;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		
		Car car1=new Car();
		
		car1.ownername="홍길동";
		car1.carname="스포티지";
		car1.carcolor="검정";
		car1.tire=4;
		car1.goCar();
		car1.backCar();
		car1.getInfo();
		
		System.out.println("---------------------------------");
		
		Car car2=new Car();
		
		car2.ownername="둘리";
		car2.carname="포터";
		car2.carcolor="노랑";
		car2.tire=8;
		car2.goCar();
		car2.backCar();
		car2.getInfo();

		System.out.println("---------------------------------");
		
		Car car3=new Car();
		
		car3.goCar();
		car3.backCar();
		car3.getInfo();
		
		System.out.println("프로그램의 끝");
	}

}
