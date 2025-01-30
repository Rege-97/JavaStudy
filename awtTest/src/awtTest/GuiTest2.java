package awtTest;

import java.awt.*;

public class GuiTest2 extends Frame {

	public GuiTest2() {
		super("나의 두번째!");

		GridLayout g1 = new GridLayout(2, 3, 20, 20);
		this.setLayout(g1);

		Button bt1 = new Button("bt1");
		Button bt2 = new Button("bt2");
		Button bt3 = new Button("bt3");
		Button bt4 = new Button("bt4");
		Button bt5 = new Button("bt5");

		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);

		Panel p = new Panel();
		p.setBackground(Color.yellow);
		this.add(p);

		BorderLayout b1 = new BorderLayout();
		p.setLayout(b1);

		Button bt6 = new Button("bt6");
		Button bt7 = new Button("bt7");
		p.add(bt6, "North");
		p.add(bt7, "South");

	}

	@Override
	public Insets getInsets() {
		Insets i=new Insets(45,20,20,20);
		return i;
	}
	
	
	public static void main(String[] args) {
		GuiTest2 gt2 = new GuiTest2();
		gt2.setSize(300, 300);
		gt2.setVisible(true);

	}

}
