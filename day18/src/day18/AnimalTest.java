package day18;

import java.io.*;

abstract class Animal {
	String name;

	abstract public void getBaby(int i);

	abstract public void crySount();
}

class Dog extends Animal {
	public Dog() {
		name = "강아지";
	}

	@Override
	public void getBaby(int i) {

		System.out.println(name + "가 " + i + "마리 태어났어요.");
	}

	@Override
	public void crySount() {
		System.out.println(name + "은 멍멍 하고 울어요.");
	}
}

class Cat extends Animal {
	public Cat() {

		name = "고양이";

	}

	@Override
	public void getBaby(int i) {

		System.out.println(name + "가 " + i + "마리 태어났어요.");
	}

	@Override
	public void crySount() {
		System.out.println(name + "는 냥냥 하고 울어요.");
	}
}

class Duck extends Animal {
	public Duck() {
		name = "오리";

	}

	@Override
	public void getBaby(int i) {

		System.out.println(name + "가 " + i + "마리 태어났어요.");
	}

	@Override
	public void crySount() {
		System.out.println(name + "는 꽥꽥 하고 울어요.");
	}
}

public class AnimalTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("어떤 동물이 태어났나요? : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("몇마리 태어났나요? : ");
		int b = Integer.parseInt(br.readLine());

		Animal ani = null;
		switch (a) {
		case 1:
			ani = new Dog();
			break;
		case 2:
			ani = new Cat();
			break;
		case 3:
			ani = new Duck();
			break;
		}

		ani.getBaby(b);
		ani.crySount();

//		if (a == 1) {
//			Animal a1 = new Dog();
//			a1.getBaby(b);
//			a1.crySount();
//		} else if (a == 2) {
//			Animal a1 = new Cat();
//			a1.getBaby(b);
//			a1.crySount();
//		} else if (a == 3) {
//			Animal a1 = new Duck();
//			a1.getBaby(b);
//			a1.crySount();
//		}
		

	}

}
