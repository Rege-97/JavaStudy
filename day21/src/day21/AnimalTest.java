package day21;

import java.util.Scanner;

public class AnimalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("어떤 동물인가요? : ");
		String str = sc.nextLine();

		if (str.equals("강아지")) {
			System.out.println("강아지는 멍멍하고 울어요~");
		} else if (str.equals("고양이")) {
			System.out.println("고양이는 냐옹하고 울어요~");
		} else if (str.equals("오리")) {
			System.out.println("오리는 꽥꽥하고 울어요~");
		}

	}

}
