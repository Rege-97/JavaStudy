package day23;

import java.time.Month;
import java.util.*;

public class CalendarTest {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);

		System.err.println(year + "년 " + month + 1 + "월 " + date + "일");

	}

}
