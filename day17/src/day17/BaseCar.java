package day17;

public class BaseCar {

	String carname;
	int maxspeed;
	
	public BaseCar() {
		
	}

	public BaseCar(String name, int speed) {
		this.carname = name;
		this.maxspeed = speed; 
	}

	public void getInfo() {
		System.out.println("카트 이름 : " + carname);
		System.out.println("최고 속도 : " + maxspeed);
	}

}
