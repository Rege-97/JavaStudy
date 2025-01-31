package eventTest;

class LocalTest {
	String str = "$$$";

	public void test1() {
		String str2 = "!!!";
		System.out.println("str = " + str);
		System.out.println("str2 = " + str2);

		class Local {
			String str3 = "^^^";

			public void test2() {
				System.out.println("str3 = " + str3);
			}
		}
		Local lo=new Local();
		lo.test2();
	}
	public void test3() {
//		Local lo2 = new Local();
	}
}

public class LocalClassTest {

	public static void main(String[] args) {

		LocalTest lt = new LocalTest();
		System.out.println("lt.str = " + lt.str);
		lt.test1();

	}

}
