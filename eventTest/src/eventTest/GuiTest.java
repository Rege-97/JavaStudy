package eventTest;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

import javax.swing.JSeparator;
import javax.swing.plaf.SeparatorUI;

public class GuiTest extends Frame {
	MenuBar mbar;
	Menu m_file, m_quick, m_main, m_guest, m_emp, m_orderlist, m_menu, m_close;
	MenuItem mi_logout, mi_close, mi_allreset, mi_q_guestadd, mi_q_guestpoint, mi_q_menuadd;

	public GuiTest() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					System.exit(0);
				} catch (Exception e1) {
				}
			}
		});

		mbar = new MenuBar();
		m_file = new Menu("파일");
		mi_logout=new MenuItem("로그아웃");
		mi_allreset=new MenuItem("데이터 초기화");
		mi_close=new MenuItem("닫기");
		m_file.add(mi_logout);
		m_file.add(mi_allreset);
		m_file.addSeparator();
		m_file.add(mi_close);
		
		m_quick = new Menu("퀵 메뉴");
		mi_q_guestadd=new MenuItem("회원 등록");
		mi_q_guestpoint=new MenuItem("포인트 조회");
		mi_q_menuadd=new MenuItem("메뉴 추가");
		m_quick.add(mi_q_guestadd);
		m_quick.add(mi_q_guestpoint);
		m_quick.add(mi_q_menuadd);
		
		
		
		m_main = new Menu("메인");
		m_guest = new Menu("회원관리");
		m_emp = new Menu("직원관리");
		m_orderlist = new Menu("주문내역");
		m_menu = new Menu("메뉴관리");

		this.setMenuBar(mbar);
		mbar.add(m_file);
		
		mbar.add(m_quick);
		mbar.add(m_main);
		mbar.add(m_guest);
		mbar.add(m_emp);
		mbar.add(m_orderlist);
		mbar.add(m_menu);


		this.setLayout(new BorderLayout(10, 10));
		JSeparator js;

		Font f_title = new Font("Default Font", Font.BOLD, 15);
		Font f_subtitle = new Font("Default Font", Font.BOLD, 12);

		// 상단
		Panel p_north = new Panel(new BorderLayout(5, 5));
		this.add(p_north, "North");
		Label title = new Label("회원 관리", Label.CENTER);
		title.setFont(f_title);
		p_north.add(title, "North");

		js = new JSeparator();
		p_north.add(js, "Center");

		Panel p_north_south = new Panel(new FlowLayout());
		p_north.add(p_north_south, "South");
		Label lb_guest_search = new Label("회원 검색", Label.CENTER);
		lb_guest_search.setFont(f_subtitle);

		CheckboxGroup cb_guest_search_group = new CheckboxGroup();
		Checkbox cb_guest_search1 = new Checkbox("회원이름", cb_guest_search_group, true);
		Checkbox cb_guest_search2 = new Checkbox("전화번호", cb_guest_search_group, false);

		TextField tf_guest_search = new TextField();
		tf_guest_search.setPreferredSize(new Dimension(300, 20));
		Button bt_guest_search = new Button("검색");
		Button bt_all_search = new Button("전체조회");

		p_north_south.add(lb_guest_search);
		p_north_south.add(cb_guest_search1);
		p_north_south.add(cb_guest_search2);
		p_north_south.add(tf_guest_search);
		p_north_south.add(bt_guest_search);
		p_north_south.add(bt_all_search);

		// 중단
		Panel p_center = new Panel(new GridLayout(1, 2, 10, 10));
		this.add(p_center, "Center");

		Panel p_center_west = new Panel(new BorderLayout(10, 10));
		p_center.add(p_center_west);

		Label lb_search_result = new Label("조회 목록", Label.CENTER);
		lb_search_result.setFont(f_subtitle);
		List l_search = new List();
		l_search.add("1 - 김채현 - 010-0000-0000 - Bronze - 3000포인트");
		l_search.add("2 - 오진우 - 010-0000-0000 - Silver - 3000포인트");
		l_search.add("3 - 박주연 - 010-0000-0000 - Bronze - 3000포인트");
		l_search.add("4 - 박현진 - 010-0000-0000 - Gold - 3000포인트");
		l_search.add("5 - 김호찬 - 010-0000-0000 - Platinum - 3000포인트");
		ScrollPane sp_search_result = new ScrollPane();
		sp_search_result.add(l_search);
		p_center_west.add(lb_search_result, "North");
		p_center_west.add(sp_search_result, "Center");

		Panel p_center_east = new Panel(new BorderLayout(10, 10));
		p_center.add(p_center_east);
		Label lb_search_guest = new Label("선택 회원 정보", Label.CENTER);
		lb_search_guest.setFont(f_subtitle);
		p_center_east.add(lb_search_guest, "North");

		Panel p_center_east_center = new Panel(new GridLayout(9, 2, 5, 5));
		p_center_east.add(p_center_east_center, "Center");

		Label lb_search_no = new Label("회원 번호", Label.CENTER);
		TextField tf_search_no = new TextField();
		tf_search_no.setText("1");
		tf_search_no.setEditable(false);
		Label lb_search_name = new Label("회원 이름", Label.CENTER);
		TextField tf_search_name = new TextField();
		Label lb_search_tel = new Label("회원 전화번호", Label.CENTER);
		TextField tf_search_tel = new TextField();
		Label lb_search_rank = new Label("회원 등급", Label.CENTER);
		Choice c_search_rank = new Choice();
		c_search_rank.add("Bronze");
		c_search_rank.add("Silver");
		c_search_rank.add("Gold");
		c_search_rank.add("Platinum");
		Label lb_search_point = new Label("회원 포인트", Label.CENTER);
		TextField tf_search_point = new TextField();
		tf_search_point.setText("1000");

		Panel p_empty;

		p_center_east_center.add(lb_search_no);
		p_center_east_center.add(tf_search_no);
		p_center_east_center.add(lb_search_name);
		p_center_east_center.add(tf_search_name);
		p_center_east_center.add(lb_search_tel);
		p_center_east_center.add(tf_search_tel);
		p_center_east_center.add(lb_search_rank);
		p_center_east_center.add(c_search_rank);
		p_center_east_center.add(lb_search_point);
		p_center_east_center.add(tf_search_point);

		
		for(int i=0;i<6;i++) {
			p_empty = new Panel();
			p_center_east_center.add(p_empty);
		}

		Button bt_search_change = new Button("수정");
		Button bt_search_delete = new Button("삭제");
		p_center_east_center.add(bt_search_change);
		p_center_east_center.add(bt_search_delete);

		// 하단
		Panel p_south = new Panel(new BorderLayout(5, 5));
		this.add(p_south, "South");

		Panel p_south_north = new Panel(new BorderLayout(5, 5));
		p_south.add(p_south_north, "North");

		js = new JSeparator();
		Label lb_guest_add = new Label("회원 등록", Label.CENTER);
		lb_guest_add.setFont(f_subtitle);
		p_south_north.add(js, "North");
		p_south_north.add(lb_guest_add, "Center");

		Panel p_south_center = new Panel(new GridLayout(2, 5, 5, 5));
		p_south.add(p_south_center, "Center");

		Label lb_guest_no = new Label("회원 번호", Label.CENTER);
		TextField tf_guest_no = new TextField();
		tf_guest_no.setText("1");
		tf_guest_no.setEditable(false);
		Label lb_guest_name = new Label("회원 이름", Label.CENTER);
		TextField tf_guest_name = new TextField();
		Label lb_guest_tel = new Label("회원 전화번호", Label.CENTER);
		TextField tf_guest_tel = new TextField();
		Label lb_guest_rank = new Label("회원 등급", Label.CENTER);
		Choice c_guest_rank = new Choice();
		c_guest_rank.add("Bronze");
		c_guest_rank.add("Silver");
		c_guest_rank.add("Gold");
		c_guest_rank.add("Platinum");
		Label lb_guest_point = new Label("회원 포인트", Label.CENTER);
		TextField tf_guest_point = new TextField();
		tf_guest_point.setText("1000");

		p_south_center.add(lb_guest_no);
		p_south_center.add(lb_guest_name);
		p_south_center.add(lb_guest_tel);
		p_south_center.add(lb_guest_rank);
		p_south_center.add(lb_guest_point);
		p_south_center.add(tf_guest_no);
		p_south_center.add(tf_guest_name);
		p_south_center.add(tf_guest_tel);
		p_south_center.add(c_guest_rank);
		p_south_center.add(tf_guest_point);

		Panel p_south_south = new Panel(new FlowLayout());
		p_south.add(p_south_south, "South");

		Button bt_guest_add = new Button("회원 등록");
		Button bt_guest_reset = new Button("입력 초기화");
		p_south_south.add(bt_guest_add);
		p_south_south.add(bt_guest_reset);

	}

	@Override
	public Insets insets() {
		Insets i = new Insets(60, 20, 20, 20);
		return i;
	}

	public static void main(String[] args) {
		GuiTest gt = new GuiTest();
		gt.setSize(800, 600);
		gt.setVisible(true);

	}

}
