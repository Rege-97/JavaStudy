package eventTest;

import java.awt.*;
import java.awt.event.*;

public class EventTest2 extends Frame implements ActionListener {

	Label lb_first, lb_second, lb_result;
	TextField tf_first, tf_second, tf_result;
	Button bt_result, bt_reset;

	public EventTest2() {
		GridLayout gl = new GridLayout(4, 2, 10, 10);
		this.setLayout(gl);

		lb_first = new Label("첫번째 수 : ");
		lb_second = new Label("두번째 수 : ");
		lb_result = new Label("결과 값 : ");

		tf_first = new TextField();
		tf_second = new TextField();
		tf_result = new TextField();
		tf_result.setEditable(false);

		bt_result = new Button("계산하기");
		bt_reset = new Button("초기화");

		this.add(lb_first);
		this.add(tf_first);
		this.add(lb_second);
		this.add(tf_second);
		this.add(lb_result);
		this.add(tf_result);
		this.add(bt_result);
		this.add(bt_reset);

		bt_result.addActionListener(this);
		bt_reset.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();

		if (obj == bt_result) {
			String sum = Integer.parseInt(tf_first.getText()) + Integer.parseInt(tf_second.getText()) + "";
			tf_result.setText(sum);
		} else if (obj == bt_reset) {
			tf_first.setText("");
			tf_second.setText("");
			tf_result.setText("");
		}

	}

	public static void main(String[] args) {
		EventTest2 et2 = new EventTest2();
		et2.setSize(300, 300);
		et2.setVisible(true);

	}

}
