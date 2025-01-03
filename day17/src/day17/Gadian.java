package day17;

public class Gadian extends BaseCar {

	String item;

	public Gadian(String name, int speed, String item) {
		
		this.carname = name;
		this.maxspeed = speed;
		this.item = item;
		
	}
	
	public void getInfo() {		// 오버라이딩
		super.getInfo();
//		System.out.println("카트 이름 : "+carname);
//		System.out.println("최고 속도 : "+maxspeed);
		System.out.println("아이템 : "+item);
	}
	public void getInfo(String title) {	
		System.out.println(title);
		this.getInfo();
	}
}
