package day14;

public class MakaTest {

	public static void main(String[] args) {
		// 추상화
		System.out.println("==프로그램의 시작==");

		Maka m1 = new Maka();
		m1.color="파랑";
		m1.makaWrite();
		
		Maka m2=new Maka();
		m2.color="노랑";
		m2.makaWrite();
		
		Maka m3=new Maka();
		m3.color="빨강";
		m3.makaWrite();
		
		Maka m4=new Maka();
		m4.makaWrite();
		
		System.out.println("==프로그램의 끝==");
	}

}
