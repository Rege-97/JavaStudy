package report;

public class SumNineNumber {

	public static void decide(int num[]) {
		// (1) 자리수의 합이 9인 정수 개수를 저장할 count 변수 선언 및 0으로 초기화
		int count = 0;

		// (2) 배열 num의 각 요소에 대해 반복 수행하는 for문
		for (int i = 0; i < num.length; i++) {
			// (3) 현재 분석할 정수를 temp에 대입
			int temp = num[i];
			// (4) 자릿수의 합을 저장할 sum 변수 선언 및 0으로 초기화
			int sum = 0;

			// (5) while문을 사용해 자릿수를 하나씩 분리하여 합을 구함
			while (true) {
				// (6) 현재 temp의 1의 자리 숫자를 lastDec에 저장
				int lastDec = temp % 10;
				// (7) 현재 자릿수 값을 합산
				sum += lastDec;
				// (8) temp 변수에 다음 자릿수로 이동
				temp = temp / 10;

				if (temp == 0) // temp가 0이 되면 모든 자릿수를 다 확인한 것이므로 반복 종료
					break;
			}

			// 자릿수의 합이 9라면 해당 정수를 출력하고 count 값을 증가시킴
			if (sum == 9) {
				System.out.print(num[i] + " ");
				count++;
			}
		}

		if (count == 0)
			System.out.println("없음");
		else
			System.out.println();
	}

	public static void main(String[] args) {
		int inputInt[] = { 8, 27, 13, 74, 1233, 99, 81, 900, 39, 351 };
		System.out.print("자릿수의 합이 9인 것은 ... ");
		decide(inputInt);
	}
}
