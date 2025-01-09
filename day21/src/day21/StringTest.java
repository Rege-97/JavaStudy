package day21;

public class StringTest {

	public static void main(String[] args) {

		String str = "java";
		String str2 = "java";
		String str3 = new String("java");

		System.out.println("str = " + str);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);

		if (str == str2) {
			System.out.println("str==str2 : 같다");
		} else {
			System.out.println("str==str2 : 같지 않다.");
		}

		String res = str == str3 ? "같다" : "같지 않다";
		System.out.println("str==str3 : " + res);

		String res2 = str.equals(str2) ? "같다" : "같지 않다";
		String res3 = str.equals(str3) ? "같다" : "같지 않다";
		System.out.println("str==str2 : " + res2);
		System.out.println("str==str3 : " + res3);

	}

}
