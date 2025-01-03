package day17;

public class YongMathTest {

	public static void main(String[] args) {

		GetMax gm = new GetMax();
		System.out.println("3과 5 중 큰 수 : " + gm.getMaxNum(3, 5));
		System.out.println("6.1과 3.6 중 큰 수 : " + gm.getMaxNum(6.1, 3.6));
		gm.getInfo();

	}

}
