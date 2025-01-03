package day17;

class Super {

	int a = 10;
	double b = 20.0;

	public void test1() {
		System.out.println("test1()메서드 입니다.");
	}

}

class Sub extends Super {
	int a = 100;
	int c = 30;

	public void test2() {
		System.out.println("test2메서드 입니다.");
	}

	public void test1() {
		System.out.println("재정의한 test1 입니다.");
		System.out.println("c = " + c);
	}
}

public class InheriTest {

	public static void main(String[] args) {

		Super sp = new Sub();
		System.out.println("sp.a = " + sp.a);
		System.out.println("sp.b = " + sp.b);
		
		sp.test1();
		
		Super arr[]=new Super[3];
		arr[0]=new Sub();
		arr[1]=new Super();
		arr[2]=new Sub();
		
		for(int i =0;i<arr.length;i++) {
			arr[i].test1();

		}
		
		
//		System.out.println("sp.c = " + sp.c);

//		Sub sb2 = new Sub();
//		sb2.test2();
//		sb2.test1();
//		System.out.println("sb2.c = " + sb2.c);
//		System.out.println("sb2.b = " + sb2.b);
//		System.out.println("sb2.a = " + sb2.a);

//		Sub sb = new Sub();
//		System.out.println("sb.a = " + sb.a);
//		System.out.println("sb.c = " + sb.c);
//		sb.test2();
//		Sub arr[] = new Sub[3];
//
//		arr[0] = new Sub();
//		arr[1] = new Sub();
//		arr[2] = new Sub();
//		arr[0].test2();

//		Super sp = new Super();
//		System.out.println("sp.a = " + sp.a);
//		System.out.println("sp.b = " + sp.b);
//		sp.test1();
//
//		Super arr[] = new Super[3];
//		arr[0] = new Super();
//		arr[1] = new Super();
//		arr[2] = new Super();
//
//		arr[1].test1();

	}

}
