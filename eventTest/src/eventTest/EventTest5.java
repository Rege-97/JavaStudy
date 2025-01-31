package eventTest;

import java.awt.*;
import java.awt.event.*;

public class EventTest5 extends Frame implements ActionListener {

	MenuBar mbar;
	Menu m_file, m_color, m_etc;
	MenuItem mi_test1, mi_test2, mi_close, mi_yellow, mi_gray, mi_red, mi_blue;
	Label lb1;

	public EventTest5() {
		mbar = new MenuBar();
		this.setMenuBar(mbar);
		m_file = new Menu("파일");
		mbar.add(m_file);
		mi_test1 = new MenuItem("테스트1");
		mi_test2 = new MenuItem("테스트2");
		mi_close = new MenuItem("닫기");
		m_file.add(mi_test1);
		m_file.add(mi_test2);
		m_file.addSeparator();
		m_file.add(mi_close);

		m_color = new Menu("색상");
		m_etc = new Menu("이하색상");
		mbar.add(m_color);

		mi_yellow = new MenuItem("노랑");
		mi_gray = new MenuItem("회색");
		mi_red = new MenuItem("빨강");
		mi_blue = new MenuItem("파랑");

		m_color.add(mi_yellow);
		m_color.add(mi_gray);
		m_color.add(m_etc);
		m_etc.add(mi_red);
		m_etc.add(mi_blue);

		lb1 = new Label("글자색");
		this.add(lb1, "South");

		mi_test1.addActionListener(this);
		mi_test2.addActionListener(this);
		mi_close.addActionListener(this);
		mi_yellow.addActionListener(this);
		mi_gray.addActionListener(this);
		mi_red.addActionListener(this);
		mi_blue.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == mi_test1) {

		} else if (ob == mi_test2) {

		} else if (ob == mi_close) {
			System.exit(0);
		} else if (ob == mi_yellow) {
			this.setBackground(Color.yellow);
		} else if (ob == mi_gray) {
			this.setBackground(Color.gray);
		} else if (ob == mi_red) {
			lb1.setBackground(Color.blue);
			lb1.setForeground(Color.red);
		} else if (ob == mi_blue) {
			lb1.setBackground(Color.red);
			lb1.setForeground(Color.blue);
		}

	}

	public static void main(String[] args) {
		EventTest5 et5 = new EventTest5();
		et5.setSize(300, 300);
		et5.setVisible(true);

	}

}
