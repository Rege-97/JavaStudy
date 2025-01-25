package guiTest1;

import java.awt.*;

///<250124 GUI>

public class GuiTest1 {

	public static void main(String[] agrs) {

		/// Frame(String title) : ��ȭ��
		Frame f = new Frame("���� ù GUI"); // frame ��ü

		// 1) ����������
		f.setSize(300, 300);

		f.setVisible(true);

		// 2) �߾ӿ��� ���
		f.setLocation(1000, 500);

		// 2-1) Toolkit ��� (���)
		Dimension dim = (Toolkit.getDefaultToolkit()).getScreenSize();
//      int x = (int)dim.getWidth();
//      int y = (int)dim.getHeight();

		// �߾����
		int x = (int) dim.getWidth() / 2 - 150;
		int y = (int) dim.getHeight() / 2 - 150;
		// /2���ϸ� ȭ�� ���������� �߾���µ�, -150��ŭ ���� ȭ�� ��� ���
		f.setLocation(x, y);
		System.out.println("x=" + x + "/y=" + y); // ȭ���� ��µǴ� ����� �ػ� ũ��

		/////////////////////////////////////////////////

		// 1) ��ġ : FlowLayout (int aligr, int hgap(����), int vhap(����)

//      FlowLayout fl = new FlowLayout(FlowLayout.LEFT,20,20);
//      f.setLayout(fl);

		  //�� ���� �ϴ� �갡 ��ġ������ Ŭ����
	     //�ش� ��ġ�� ������ left�� rigt�Ŀ� ���� ������dsd
	      FlowLayout f1=new FlowLayout(FlowLayout.RIGHT, 35, 35);
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
		f.add(bt4, "West"); // ""�ε��� �빮�� Ʋ���� ������
		f.add(bt5, "South");
		// �������� bt5�� ��Ź�� ��ó�� ���̴µ� 5�� ��� ������ ��

		/////////////////////////////////////////////////
		f.setVisible(true);
	}
}