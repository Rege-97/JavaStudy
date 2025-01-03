package day17;

public class CarTest {

	public static void main(String[] args) {

		BaseCar car1 = new BaseCar();

		car1.carname = "연습카트";
		car1.maxspeed = 160;
		car1.getInfo();
		System.out.println("--------------------------");
		
		Gadian car2=new Gadian("가디언", 200, "황금아이템");
		car2.getInfo("=====루찌 자동차=====");

		System.out.println("--------------------------");
		
		Gadian car3=new Gadian("블랙샤크", 300, "황금아이템");
		car3.getInfo("=====루찌 자동차=====");
		
	}

}
