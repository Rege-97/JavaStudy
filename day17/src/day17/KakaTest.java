package day17;

class Kaka {
	String name;

	public void openKaka() {
		System.out.println("까까를 뜯어서 먹습니다.");
	}
}

// 바나나킥
class Banana extends Kaka {
	public Banana() {
		name = "바나나킥";
	}

	public void openKaka() {
		System.out.println(name + "의 봉지를 뜯어서 먹습니다.");
	}
	
}

// 프링글스
class Prin extends Kaka {
	public Prin() {
		name = "프링글스";
	}

	public void openKaka() {
		System.out.println(name + "의 뚜껑을 뜯어서 먹습니다.");
	}
	
}

// 고래밥
class Sea extends Kaka {
	public Sea() {
		name = "고래밥";
	}

	public void openKaka() {
		System.out.println(name + "의 박스를 뜯어서 먹습니다.");
	}
	
}

public class KakaTest {

	public static void main(String[] args) {
		Kaka krr[]=new Kaka[3];
		krr[0]=new Prin();
		krr[1]=new Banana();
		krr[2]=new Sea();
		
		for(int i=0;i<krr.length;i++) {
			krr[i].openKaka();
		}

	}

}
