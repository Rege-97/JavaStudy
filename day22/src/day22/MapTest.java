package day22;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("apple", "사과");
		map.put("plate", "접시");
		map.put("one", "하나");
		map.put("two", "둘");

		System.out.println("apple이 무슨 뜻이야? " + map.get("apple"));
		System.out.println("one은 무슨 뜻이야? " + map.get("one"));

		map.put("apple", "아이폰");
		System.out.println("apple이 뭔데? " + map.get("apple"));

		Iterator<String> keys = map.keySet().iterator();

		while (keys.hasNext()) {

			String key = keys.next();
			System.out.println(map.get(key));
			
		}

	}

}
