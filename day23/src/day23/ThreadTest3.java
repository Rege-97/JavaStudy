package day23;

import java.util.*;

public class ThreadTest3 {

	public static void main(String[] args) {

		while (true) {

			Calendar now = Calendar.getInstance();

			int h = now.get(Calendar.HOUR);
			int m = now.get(Calendar.MINUTE);
			int s = now.get(Calendar.SECOND);

			String str = "\r현재시간 : " + h + "시 " + m + "분 " + s + "초";
			System.out.print(str);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
