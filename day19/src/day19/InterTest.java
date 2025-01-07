package day19;

class Human {
	String name;
	int power;

	public void getInfo() {
		System.out.println("나는 사람입니다.");
	}
}

class Fly {
	int speed;

	public void flying() {
		System.out.println("나는 난다~");
	}
}

abstract class AbsFly{
	abstract public void flying();
}

interface InterFly{
	int SPEED=90;
	
	public void flying();
	
}

class Bug {
	String name;
	String type;

	public void getInfo() {
		System.out.println("나는 벌레입니다.");
	}
}

class SuperMan extends Human implements InterFly{
	String nick;

	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("힘수치 : " + power);
		System.out.println("정체 : " + nick);
		flying();
	}
	
	@Override
	public void flying() {
		System.out.println("슈퍼맨이 난다~");
	}

}

class ButterFly extends Bug implements InterFly{
	@Override
	public void getInfo() {
		System.out.println("이름 : "+name);
		System.out.println("타입 : "+type);
		flying();
	}
	
	@Override
	public void flying() {
		System.out.println("나비가 난다~");
	}
}

public class InterTest {

	public static void main(String[] args) {
		
		SuperMan sm=new SuperMan();
		
		sm.name="클락 켄트";
		sm.power=30;
		sm.nick="슈퍼맨";
		sm.getInfo();
		
		System.out.println("---------------------");
		
		ButterFly bf=new ButterFly();
		bf.name = "나비";
		bf.type="호랑나비과";
		bf.getInfo();
		
		InterFly arr[]=new InterFly[2];
		arr[0]=sm;
		arr[1]=bf;

	}

}
