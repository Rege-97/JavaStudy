package day20;

import java.io.*;

public class ExcepTest5 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("몇개의 데이터를 입력하시겠습니까? : ");
			int num = Integer.parseInt(br.readLine());
			int arr[] = new int[num];
			for (int i = 0; i < arr.length; i++) {
				System.out.print(i + 1 + "번째 데이터 : ");
				arr[i] = Integer.parseInt(br.readLine());
			}
			System.out.println("몇번째 데이터를 확인하시겠습니까?");
			int user = Integer.parseInt(br.readLine());
			System.out.println("선택한 데이터 : " + arr[user - 1]);
			
		} catch (IOException e) {
			System.out.println("입출력관련 예외 발생!");
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하셔야 합니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("없는 범위를 지정하셨습니다.");
		} catch (NegativeArraySizeException e) {
			System.out.println("공간은 항상 양수를 입력하셔야 합니다.");
		} catch (Exception e) {
			System.out.println("고객센터 연락바람");
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
