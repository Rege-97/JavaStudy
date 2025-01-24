package guiTest1;
import java.awt.*;

public class GuiTest2 extends Frame {
//내껄로 바꾸려면 상속받으면 됨
	//
	public GuiTest2() {
		super("나의 두번째!"); 
	
	
	
	//GridLayout(int rows, int cols, int hgap, int vgap)
	GridLayout g1=new GridLayout(2,3,20,20); //이건 주문표
	this.setLayout(g1);
	
	Button bt1=new Button("bt1");
	Button bt2=new Button("bt2");
	Button bt3=new Button("bt3");
	Button bt4=new Button("bt4");
	Button bt5=new Button("bt5");
	
	this.add(bt1);
	this.add(bt2);
	this.add(bt3);
	this.add(bt4);
	this.add(bt5);
	
	Panel p=new Panel();
	p.setBackground(Color.yellow); //노란색 패널이 부탁된 상태 또다른 물건들을 나에게 부탁도 가능함
	this.add(p); 
	
	BorderLayout b1=new BorderLayout(

			
			
			
			
			
			
			
			); //패널이 어떤 컴포넌트를 지정해주는 건지....
	p.setLayout(b1);
	
	Button bt6=new Button("bt6");
	Button bt7=new Button("bt7");
	p.add(bt6,"North"); //add=부착할거야
	p.add(bt7,"South"); //나 사우스에 부착할게
}
	
	@Override
	public Insets getInsets() {
		Insets i=new Insets(45,20,20,20);
		return i;
	}
	
	public static void main(String[] args)  {
	//도화지 먼저 만듦
		
		GuiTest2 gt2=new GuiTest2();
		gt2.setSize(300,300); //프레임 상속받은 거 확인가능함
		gt2.setVisible(true);
		


	}

}
