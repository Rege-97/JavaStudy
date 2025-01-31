package eventTest;

import java.awt.*;
import java.awt.event.*;

public class EventTest1 extends Frame implements ActionListener {

	Button bt_red, bt_blue, bt_green;

	public EventTest1() {
		super("이벤트 테스트");

		bt_red = new Button("Red");
		bt_blue = new Button("Blue");
		bt_green = new Button("Green");

		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);

		this.add(bt_red);
		this.add(bt_blue);
		this.add(bt_green);

		bt_red.addActionListener(this);
		bt_blue.addActionListener(this);
		bt_green.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String str = e.getActionCommand();
		System.out.println("클릭 테스트! = " + str);

		Object obj = e.getSource();

//		if (str.equals("Red")) {
//			this.setBackground(Color.red);
//		} else if (str.equals("Blue")) {
//			this.setBackground(Color.blue);
//		} else if (str.equals("Green")) {
//			this.setBackground(Color.green);
//		}

		if (obj == bt_red) {
			this.setBackground(Color.red);
			FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
			this.setLayout(fl);
		} else if (obj == bt_blue) {
			this.setBackground(Color.blue);
			FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
			this.setLayout(fl);
		} else if (obj == bt_green) {
			this.setBackground(Color.green);
			FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);
			this.setLayout(fl);
		}
		
		this.validate();

	}

	@Override
	public Insets insets() {
		Insets i = new Insets(45, 20, 20, 20);
		return i;
	}

	public static void main(String[] args) {
		EventTest1 et1 = new EventTest1();
		et1.setSize(300, 300);
		et1.setVisible(true);

	}

}
