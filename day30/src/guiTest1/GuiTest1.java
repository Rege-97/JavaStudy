package guiTest1;

import java.awt.*;

///<250124 GUI>

public class GuiTest1 {

	public static void main(String[] agrs) {

		/// Frame(String title) : 도화지 - 프레임이라는 클래스 생성
		Frame f = new Frame("나의 첫 GUI"); // frame 객체

		// 1) 도화지 크기 지정 - 300은 픽셀 수 , 픽셀 = 점
		f.setSize(300, 300);

		// 도화지 활성화 true
		f.setVisible(true);

		// 도화지 위에 내가 원하는 컴포넌트를 부착 = 내가 원하는 프로그램 생성

		// 2) 프로그램 중앙에서 출력
		f.setLocation(1000, 500);

		// 2-1) Toolkit 사용 (출력)
		Dimension dim = (Toolkit.getDefaultToolkit()).getScreenSize();
//			      int x = (int)dim.getWidth();
//			      int y = (int)dim.getHeight();

		// 중앙출력
		int x = (int) dim.getWidth() / 2 - 150;
		int y = (int) dim.getHeight() / 2 - 150;
		// /2만하면 화면 꼭지점에서 중앙출력됨, -150만큼 빼면 화면 가운데 출력
		f.setLocation(x, y);
		System.out.println("x=" + x + "/y=" + y); // 화면이 출력되는 모니터 해상도 크기

		/////////////////////////////////////////////////

		// 1) 배치 : FlowLayout (int aligr, int hgap(간격), int vhap(간격)

//			      FlowLayout fl = new FlowLayout(FlowLayout.LEFT,20,20);
//			      f.setLayout(fl);

		// 명세 역할 하는 얘가 배치관리자 클래스
		// 해당 배치의 기준이 left냐 rigt냐에 따라서 지정됨
		FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT, 35, 35);
		f.setLayout(f1);

		BorderLayout bl = new BorderLayout(20, 20);
		f.setLayout(bl);

		Button bt1 = new Button("bt1");
		Button bt2 = new Button("bt2");
		Button bt3 = new Button("bt3");
		Button bt4 = new Button("bt4");
		Button bt5 = new Button("bt5");

		f.add(bt1, BorderLayout.EAST);
		f.add(bt2, BorderLayout.NORTH);
		f.add(bt3, "Center");
		f.add(bt4, "West"); // ""인데도 대문자 틀리면 오류남
		f.add(bt5, "South");
		// 마지막에 bt5만 부탁된 것처럼 보이는데 5개 모두 부착된 것

		/////////////////////////////////////////////////
		f.setVisible(true);
	}
}