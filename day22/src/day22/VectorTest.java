package day22;

import java.util.*;

public class VectorTest {

	public static void main(String[] args) {

		Vector v = new Vector(3, 4); // 초기공간 3을 만들고 부족하면 4개씩 증가

		System.out.println("v의 저장 공간 : " + v.capacity());
		System.out.println("v에 저장된 데이터 수 : " + v.size());

		for (int i = 1; i <= 9; i++) {
//			v.add(new Integer(i)); 
			v.add(i); // autoboxing
		}

		System.out.println("v의 저장 공간 : " + v.capacity());
		System.out.println("v에 저장된 데이터 수 : " + v.size());
		System.out.println(v.toString());
		v.add(new Double(10.1));
		v.add(20.2);
		v.add("Hello~");
		System.out.println("v의 저장 공간 : " + v.capacity());
		System.out.println("v에 저장된 데이터 수 : " + v.size());
		System.out.println(v.toString());
		System.out.println("3번 인덱스의 데이터 : " + v.get(3));

		int in = (Integer) v.get(7); // unboxing
		System.out.println("in = " + in);

		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}

		System.out.println("-----------------------------------");

		Vector<String> v2 = new Vector<String>();

		v2.add("java");
		v2.add("jsp");
		v2.add("oracle");
		v2.add("spring");

		for (int i = 0; i < v2.size(); i++) {
			String temp = v2.get(i);
			System.out.println(temp);
		}

		System.out.println("-----------------------------------");

		ArrayList<Double> arr = new ArrayList<Double>();
		arr.add(10.1);
		arr.add(20.2);
		arr.add(30.3);

		for (int i = 0; i < arr.size(); i++) {
			double temp = arr.get(i);
			System.out.println(temp);
		}

	}

}
