package day17;

class Ball {
	String name;

	public void hitBall() {
		System.out.println("공을 던집니다.");
	}
}

// 야구공
class BaseBall extends Ball {
	public BaseBall() {
		name = "야구공";
	}

	public void hitBall() {
		System.out.println(name + "을 빠따로 날립니다.");
	}
	
}

// 농구공
class BasketBall extends Ball {
	public BasketBall() {
		name = "농구공";
	}

	public void hitBall() {
		System.out.println(name + "을 손으로 던집니다.");
	}
	
}

// 축구공
class FootBall extends Ball {
	public FootBall() {
		name = "축구공";
	}

	public void hitBall() {
		System.out.println(name + "을 발로 찹니다.");
	}
	
}

public class BallTest {

	public static void main(String[] args) {
		Ball balls[]=new Ball[3];
		balls[0]=new BasketBall();
		balls[1]=new BaseBall();
		balls[2]=new FootBall();
		
		for(int i=0;i<balls.length;i++) {
			balls[i].hitBall();
		}

	}

}
