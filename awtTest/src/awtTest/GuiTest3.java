package awtTest;

import java.awt.*;

public class GuiTest3 extends Frame {

	public GuiTest3() {
		super("실습1");

		BorderLayout b1 = new BorderLayout(10, 10);
		this.setLayout(b1);

		Panel p_center = new Panel();
		
		GridLayout g1=new GridLayout(2,2,10,10);
		p_center.setLayout(g1);

		Button bt1 = new Button("bt1");
		Button bt2 = new Button("bt2");
		Button bt3 = new Button("bt3");
		Button bt4 = new Button("bt4");

		p_center.add(bt1);
		p_center.add(bt2);
		p_center.add(bt3);
		p_center.add(bt4);

		p_center.setBackground(Color.pink);
		this.add(p_center,"Center");
		
		Panel p_south=new Panel();
		BorderLayout b2=new BorderLayout(10,10);
		p_south.setLayout(b2);
		p_south.setBackground(Color.blue);
		
		Button bt5 = new Button("bt5");
		Button bt6 = new Button("bt6");
		p_south.add(bt5,"North");
		p_south.add(bt6,"South");
		
		this.add(p_south,"South");
		
		
	}
	
	@Override
	public Insets insets() {
		Insets i=new Insets(20,20,20,20);
		return i;
	}

	public static void main(String[] args) {
		GuiTest3 gt3 = new GuiTest3();

		gt3.setSize(300, 300);
		gt3.setVisible(true);
	}

}
