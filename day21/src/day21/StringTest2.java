package day21;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println("str = " + str);

		str.concat("java");
		System.out.println("str = " + str.concat("java"));
		str.substring(2, 4);
		System.out.println("str = " + str.substring(2, 4));
		
		StringBuffer sb=new StringBuffer("Hello Java~~");
		System.out.println("sb = "+sb.toString());
		System.out.println("sb = "+sb);
		sb.append("jsp~~!!");
		System.out.println("sb = "+sb);
		
		sb.insert(6, "html~~!");
		System.out.println("sb = "+sb);
		sb.delete(13, 19);
		System.out.println("sb = "+sb);
		
		
	}

}
