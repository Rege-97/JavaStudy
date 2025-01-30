package awtTest;

import java.awt.*;

public class GuiTest1 {

	public static void main(String[] args) {

		Frame f = new Frame("나의 첫 GUI");

		f.setSize(300, 300);

		f.setVisible(true);

		f.setLocation(1000, 500);

		Dimension dim = (Toolkit.getDefaultToolkit()).getScreenSize();
		int x = (int) dim.getWidth() / 2 - 150;
		int y = (int) dim.getHeight() / 2 - 150;
		f.setLocation(x, y);

		System.out.println("x = " + x + "/ y = " + y);

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
		f.add(bt4, "West");
		f.add(bt5, "South");
	}

}
