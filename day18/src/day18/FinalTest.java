package day18;

// class + final : 상속 금지
// method + final : 재정의(오버라이드) 금지
// var + final : 상수

class Super {
	final int A = 10;

	public void test1() {
		System.out.println("test1메서드 입니다.");
	}
}

class Sub extends Super {
	int b = 20;

	public void test2() {
		System.out.println("test2메서드 입니다.");
	}

	public void test1() {
		System.out.println("a = " + A);
		// a = 30;
		System.out.println("a = " + A);
	}
}

public class FinalTest {

	public static void main(String[] args) {

		Super sp = new Super();
		System.out.println("sp.a = " + sp.A);
		sp.test1();
		Sub sb = new Sub();
		System.out.println("sb.b = " + sb.b);
		sb.test2();
		sb.test1();

	}

}
