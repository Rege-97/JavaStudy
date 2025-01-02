package day16;

public class CatTest {

	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.getInfo();
		
		System.out.println("--------------------------");
		Cat c2=new Cat("코코");
		c2.getInfo();
		
		System.out.println("--------------------------");
		Cat c3=new Cat("쿠쿠",10);
		c3.getInfo();
		
		System.out.println("--------------------------");
		Cat c4=new Cat("키키",10,"스핑크스");
		c4.getInfo();
		
		System.out.println("--------------------------");

	}

}
