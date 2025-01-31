package eventTest;

import eventTest.Outter.Inner;

class Outter {

	String str = "###";

	public void test1() {

		String str2 = "$$$";
		System.out.println("str = " + str);
		System.out.println("str2 = " + str2);
	}

	class Inner {
		String str3 = "@@@";

		public void test2() {
			String str4 = "%%%";
			System.out.println("str3 = " + str3);
			System.out.println("str4 = " + str4);
			System.out.println("str = " + str);
		}
	}
	
	static class SInner{
		static public void test3() {
			String str5="&&&";
			System.out.println("str5 = "+str5);
		}
	}

}

public class InnerClassTest {

	public static void main(String[] args) {
		
//		Outter.SInner os=new Outter.SInner();
//		os.test3();
		
		Outter.SInner.test3();

//		Outter out = new Outter();
//		Outter.Inner oi = out.new Inner();
//		
//		System.out.println("oi.str3 = "+oi.str3);
//		oi.test2();

//		Outter out = new Outter();
//		System.out.println("out.str = " + out.str);
//		out.test1();

	}

}
