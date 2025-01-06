package day18;

// pm - 도형의 넓이
abstract class Dohyung {
	String name;

	public void getInfo() {
		System.out.println("도형 넓이 프로그램 v1.0");
	}

	abstract public void area(int i, int j);
}

// 홍길동 - 사각형
class Rect extends Dohyung {
	public Rect() {
		name = "사각형";
	}

	@Override
	public void area(int i, int j) {
		int result = i * j;
		System.out.println(name + "의 넓이 : " + result);
	}
}

// 둘리 - 삼각형
class Triangle extends Dohyung {
	public Triangle() {
		name = "삼각형";
	}

	@Override
	public void area(int i, int j) {
		int result = (i * j) / 2;
		System.out.println(name + "의 넓이 : " + result);
	}
}

// 도우너 - 원
abstract class Circle extends Dohyung {
	abstract public void area(int i);
}

// 도우너의 부사수 - 원
class Circle2 extends Circle {
	public Circle2() {
		name = "원";
	}

	@Override
	public void area(int i) {
		double result = i * i * Math.PI;
		System.out.println(name + "의 넓이 : " + result);
	}

	@Override
	public void area(int i, int j) {

	}
}

public class DohyungTest {
	public void goArea(int i, int j) {
		System.out.println("가로 = " + i + " / 세로 = " + j + "인 각가도형의 넓이");

		Rect r = new Rect();
		r.area(i, j);

		Triangle t = new Triangle();
		t.area(i, j);

		Circle2 c = new Circle2();
		c.area(i);

//		Dohyung d=new Dohyung();
		Dohyung d2 = new Rect();
		d2.area(5, 5);
		d2.getInfo();

		Dohyung d3 = new Triangle();
		d3.area(5, 5);

		Dohyung d4 = new Circle2();
		Circle d5 = (Circle) d4;
		d5.area(5);

		System.out.println("------------------------------");

		Dohyung arr[] = new Dohyung[3];
		arr[0] = new Triangle();
		arr[1] = new Circle2();
		arr[2] = new Rect();

		for (int z = 0; z < arr.length; z++) {
			if (arr[z] instanceof Circle2) {
//				Circle2 temp=(Circle2)arr[z];
//				temp.area(6);
				
				((Circle2) arr[z]).area(6);
			} else {
				arr[z].area(6, 5);
			}
		}

	}

	public static void main(String[] args) {
		DohyungTest dt = new DohyungTest();
		dt.goArea(10, 20);
	}

}
