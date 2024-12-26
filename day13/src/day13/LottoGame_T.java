package day13;

import java.io.*;

public class LottoGame_T {

	public static void main(String[] args) throws IOException {
		System.out.print("몇 게임의 로또번호를 생성하시겠습니까? : ");
		int user = System.in.read() - 48;
		int lotto[][] = new int[user][];
		
		for (int k = 0; k < user; k++) {
			int arr[] = new int[6];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * 45 + 1);
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						i--;
						break;
					}
				}
			}
			lotto[k] = arr;
		}
		
		for (int j = 0; j < lotto.length; j++) {
			int arr[] = lotto[j];
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			System.out.println();
		}
	}

}
