package eventTest;

abstract class NoName {

	public NoName() {
		getInfo();
	}

	abstract public void getInfo();
}

public class NoNameClassTest {

	

	public static void main(String[] args) {
		
//		NoName nn = new NoName();
//		NoNameClassTest nnct=new NoNameClassTest();
		
		new NoName() {
			
			@Override
			public void getInfo() {
				System.out.println("이름없는 자식의 getInfo()");
				
			}
		};
		
	}

}
