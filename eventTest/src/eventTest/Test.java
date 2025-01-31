package eventTest;


@FunctionalInterface
interface InterTest {
	public int getSumNum(int i, int j);
}

public class Test {

	public static void main(String[] args) {

		InterTest it = new InterTest() {

			@Override
			public int getSumNum(int i, int j) {
				return i + j;
			}
		};

		System.out.println("it.gsm() = " + it.getSumNum(3, 7));

		//////////////////////////////////////////////////////////

		InterTest it2 = (i, j) -> i + j;	//	람다
		
		System.out.println(it2.getSumNum(4, 7));
	}
}
