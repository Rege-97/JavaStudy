package day16;

public class UserNumber {

	int num;

	public UserNumber(int num) {
		this.num = num;
	}

	public void printMultiplyNumber(int num1) {
		int result = num * num1;
		System.out.println(result);
	}

	public void printMultiplyNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] * num + " ");
		}
	}

}
