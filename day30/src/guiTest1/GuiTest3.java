package guiTest1;

import java.awt.*;

public class GuiTest3 extends Frame {
//프레임의 모든 것을 상속받게 됨

	public GuiTest3() {
		super("실습1");

		// 기본레이아웃을 보더레이아웃으로 설정
		// 컴퍼넌트 간격을 10.10씩 줌

		BorderLayout b1 = new BorderLayout(10, 10); // 좌우간격 10. 상하간격 10
		this.setLayout(b1);

		// 중단

		Panel p_center = new Panel();
		GridLayout g1 = new GridLayout(2, 2, 10, 10);
		p_center.setLayout(g1);

		Button bt1 = new Button("bt1");
		Button bt2 = new Button("bt2");
		Button bt3 = new Button("bt3");
		Button bt4 = new Button("bt4");

		p_center.add(bt1);
		p_center.add(bt2);
		p_center.add(bt3);
		p_center.add(bt4);

		// add(bt1,2,3,4)를 안바꾸면 덮어씌워짐 !!

		this.add(p_center, "Center");
		p_center.setBackground(Color.pink);

		// 결과 적으로 만든 바구니를 프레임에 넣어줌 -> THIS.ADD(P_CENTER)
		// 하단
		Panel p_south = new Panel();
		BorderLayout b12 = new BorderLayout(10, 10);
		p_south.setLayout(b12);
		p_south.setBackground(Color.blue);
		Button bt5 = new Button("bt5");
		Button bt6 = new Button("bt6");
		p_south.add(bt5, "North");
		p_south.add(bt6, "South");
		this.add(p_south, "South");

	}

	@Override
	public Insets getInsets() {
		Insets i = new Insets(20, 20, 20, 20);
		return i;
		// getInset하고 엔터

	}

	public static void main(String[] args) {

		GuiTest3 gt3 = new GuiTest3();
		gt3.setSize(300, 300); // gt3ㅏ 가지고 있는 setvisible을 통해
		gt3.setVisible(true); // 눈에 보이도록함
		// 객체 만들면서 화면 구성해도 좋을 것 같긴함

		// 그래서 생성자 호출해 객체 만든니까
		// gui 멧소드 생성?
	}

}
