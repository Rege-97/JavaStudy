package jdbcTest2;

import java.sql.*;
import java.util.Scanner;

public class jdbcTest4 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pwd = "1234";

		Connection conn = DriverManager.getConnection(url, user, pwd);
		System.out.println("검색할 이름을 입력하세요.");
		System.out.print("이름 : ");
		String username = sc.nextLine();
		System.out.println();

//		String sql = "select * from student"; 
		String sql = "select * from student where name=?";

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, username);

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			do {
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				System.out.println(username + "\t" + age + "\t" + addr + "\t" + tel + "\t");
			} while (rs.next());
		} else {
			System.out.println("검색된 학생이 없습니다.");

			System.out.print("새로 등록하겠습니까? (Y/N) :");
			String yn = sc.nextLine();

			if (yn.equals("Y") || yn.equals("y")) {
				sql = "insert into student values(?,?,?,?)";
				PreparedStatement ps2 = conn.prepareStatement(sql);
				System.out.println();
				System.out.println("==" + username + " 정보입력==");
				System.out.print("나이 : ");
				int age = sc.nextInt();
				sc.nextLine();

				System.out.print("주소 : ");
				String addr = sc.nextLine();

				System.out.print("전화번호 : ");
				String tel = sc.nextLine();

				ps2.setString(1, username);
				ps2.setInt(2, age);
				ps2.setString(3, addr);
				ps2.setString(4, tel);

				int count = ps2.executeUpdate();
				System.out.println(count + "건 등록완료 되었습니다.");

			}
		}

//		boolean bool = false;
//		
//		while (rs.next()) {
//			String name = rs.getString("name");
//			int age = rs.getInt("age");
//			String addr = rs.getString("addr");
//			String tel = rs.getString("tel");
//
//			if (name.equals(username)) {
//				System.out.println(name + "\t" + age + "\t" + addr + "\t" + tel + "\t");
//				bool = true;
//			}
//		}
//
//		
//		if (!bool) {
//			System.out.println("등록된 학생이 없습니다.");
//			System.out.print("새로 등록하겠습니까? (Y/N) :");
//			String yn=sc.nextLine();
//			
//			if(yn.equals("Y")||yn.equals("y")) {
//				sql="insert into student values(?,?,?,?)";
//				ps=conn.prepareStatement(sql);
//				System.out.println();
//				System.out.println("=="+username+" 정보입력==");
//				System.out.print("나이 : ");
//				int age = sc.nextInt();
//				sc.nextLine();
//				
//				System.out.print("주소 : ");
//				String addr=sc.nextLine();
//				
//				System.out.print("전화번호 : ");
//				String tel=sc.nextLine();
//				
//				ps.setString(1, username);
//				ps.setInt(2, age);
//				ps.setString(3, addr);
//				ps.setString(4, tel);
//				
//				int count=ps.executeUpdate();
//				System.out.println(count+"건 등록완료 되었습니다.");
//				
//			}
//		}

		rs.close();
		ps.close();
		conn.close();

	}

}
