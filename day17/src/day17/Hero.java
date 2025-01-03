package day17;

public class Hero extends Human {

	public Hero(String name, int power) {
		this.name = name;
		this.power = power;
	}
	
	public void getInfo() {
		System.out.println("내 이름은 "+this.name);
		super.getInfo();
		System.out.println("힘수치 : " + power);
	}

	public void getInfo(String name) {
		this.getInfo();
		System.out.println("하지만 비밀이 있지.");
		System.out.println("나는야~ 슈퍼파워 " + name + "~");
	}

}
