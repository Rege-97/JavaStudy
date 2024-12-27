package day14;

public class CarTest {

	public static void main(String[] args) {
		Car no1 = new Car();
		no1.driver = "김채현";
		no1.name = "아반떼";
		no1.color = "빨강";
		no1.wheel = 4;
		
		no1.go();
		no1.back();
		no1.getInfo();

	}

}
