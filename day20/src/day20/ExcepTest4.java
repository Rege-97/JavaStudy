package day20;

public class ExcepTest4 {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("data1 = " + data1);
			System.out.println("data2 = " + data2);

			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);

			System.out.println(data1 + " / " + data2 + " = " + (num1 / num2));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("프로그램 실행 시 값을 넣어주셔야 해요.");
		} catch (NumberFormatException e) {
			System.out.println("숫자만을 입력하셔야 해요.");
		} catch(ArithmeticException e) {
			System.out.println("0으로는 나눌수 없어요.");
		} catch(Exception e) {
			System.out.println("고객센터 연락 바람~");
		}
	}

}
