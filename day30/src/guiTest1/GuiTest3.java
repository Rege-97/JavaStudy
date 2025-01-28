package guiTest1;

import java.awt.*;

public class GuiTest3 extends Frame {
//�������� ��� ���� ��ӹް� ��

	public GuiTest3() {
		super("�ǽ�1");

		// �⺻���̾ƿ��� �������̾ƿ����� ����
		// ���۳�Ʈ ������ 10.10�� ��

		BorderLayout b1 = new BorderLayout(10, 10); //�¿찣�� 10. ���ϰ��� 10
		this.setLayout(b1);

		// �ߴ�

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

		// add(bt1,2,3,4)�� �ȹٲٸ� ������� !!

		this.add(p_center, "Center");
		p_center.setBackground(Color.pink);

		// ��� ������ ���� �ٱ��ϸ� �����ӿ� �־� �� -> THIS.ADD(P_CENTER)
		// �ϴ�
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
		// getInset�ϰ� ����

	}

	public static void main(String[] args) {

		GuiTest3 gt3 = new GuiTest3();
		gt3.setSize(300, 300); // gt3�� ������ �ִ� setvisible�� ����
		gt3.setVisible(true); // ���� ���̵ �����
		// ��ü ����鼭 ȭ�� �����ص� ���� �� ������

		// �׷��� ������ ȣ���� ��ü ����ϱ�
		// gui ��ҵ� ����?
	}

}
