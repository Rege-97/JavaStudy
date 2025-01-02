package day16;

public class Cat {

	String name;
	int age;
	String type;

	public Cat() {
		name = "나비";
		age = 1;
		type = "코리안숏";
	}

	public Cat(String name) {
		this();
		this.name = name;
	}

	public Cat(String name, int age) {
		this(name);
		this.age = age;
	}

	public Cat(String name, int age, String type) {
		this(name, age);
		this.type = type;
	}

	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("품종 : " + type);
	}
}
