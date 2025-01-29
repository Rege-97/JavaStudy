package guiTest1;

import java.awt.*;

public class GuiTest4 extends Frame {

	public GuiTest4() { // 보더가 기본

		super("실습2");

		// 상단
		Panel p_north = new Panel(); // 기본값이 프로레이아웃
		GridLayout gl = new GridLayout(2, 2, 10, 10); // (현재는)그래이 레이아웃은 주문표
		p_north.setLayout(gl); // 그레이 레이아웃 등록된 상태 !!

		Label lb_from = new Label("보내는 이");// from 보내는이 //lA
		Label lb_to = new Label("받는 이");
		TextField tf_from = new TextField(); // 객체 생성함
		TextField tf_to = new TextField();
		p_north.add(lb_from);
		p_north.add(tf_from); // 부착 제일 큰 베이스에서 상단에 부착하자
		p_north.add(lb_to);
		p_north.add(tf_to);

		this.add(p_north, BorderLayout.NORTH);

		// 중단
		Panel p_center = new Panel(new BorderLayout(5, 5));
		Label lb_msg = new Label("아래에 메세지를 입력하세요.", Label.CENTER); // 이걸 가운데로 지정하기 위해서는
		// 바라벨 alignment 위치를 지정할 때 사용하는 얘 어느 위치로 문자열 출력할지
		// 엔터치고 상속 뭐있는지 보면 이거 뜸

		Label lb_title = new Label("메세지");
		TextArea ta_content = new TextArea();
		p_center.add(lb_msg, "North");
		p_center.add(lb_title, "West");
		p_center.add(ta_content, "Center");

		Panel p_center_south = new Panel();
		Button bt_send = new Button("보내기");
		Button bt_cancel = new Button("취소");
		p_center_south.add(bt_send);
		p_center_south.add(bt_cancel);
		p_center.add(p_center_south, "South");

		// Panel p_north=new Panel(); 의 하단에
		this.add(p_center, "Center");

	}

	@Override
	public Insets getInsets() {
		Insets i = new Insets(45, 20, 20, 20); // 인섹트객체 지정
		return i; // 재정의한 인셉트 돌려줄 수 있도록

	}

	public static void main(String[] args) {

		GuiTest4 gt4 = new GuiTest4();
		gt4.setSize(450, 300); // gt3ㅏ 가지고 있는 setvisible을 통
		gt4.setVisible(true);
		// 배치는 상대배치라서 450으로 변경해도 됨

	}

}
