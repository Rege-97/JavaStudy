package day17;

public class BlackShark extends BaseCar {
	String item;

	public BlackShark(String name, int speed, String item) {
		this.carname = name;
		this.maxspeed = speed;
		this.item = item;
	}

	public void getInfo() {
		super.getInfo();
		System.out.println("아이템 : " + item);
	}

	public void getInfo(String title) {
		System.out.println(title);
		this.getInfo();
	}

}
