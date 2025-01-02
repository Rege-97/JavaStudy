package day16;

public class DohyungArea {
	
	public DohyungArea() {
		
	}

	public void goArea(int a, int b) {
		int result = a * b;
		System.out.println("사각형의 넓이 : " + result);
	}

	public void goArea(int a, int b, int c) {
		int result = (a * b) / 2;
		System.out.println("삼각형의 넓이 : " + result);
	}

	public void goArea(double a) {
		double result = a * a * 3.14;
		System.out.println("원의 넓이 : " + result);
	}

}
