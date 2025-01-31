package eventTest;

import java.awt.*;
import java.awt.event.*;

public class EventTest4 extends Frame {

	Button bt1, bt2;

	public EventTest4() {
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);

		bt1 = new Button("테스트 1");
		bt2 = new Button("테스트 2");
		
		this.add(bt1);
		this.add(bt2);
		
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명 방식으로 처리한 결과");
				
			}
		});
		
		bt2.addActionListener(e->{System.out.println("람다식으로 처리한 결과");});
	}

	public static void main(String[] args) {
		EventTest4 et4 = new EventTest4();
		et4.setSize(300, 300);
		et4.setVisible(true);

	}

}
