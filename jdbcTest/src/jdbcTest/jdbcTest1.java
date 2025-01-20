package jdbcTest;

import java.sql.*;

public class jdbcTest1 {

	public static void main(String[] args) {
		
		System.out.println("DB 드라이버 메모리 로딩!");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB 드라이버 로딩 성공!");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String pwd="1234";
			
			Connection con=DriverManager.getConnection(url,user,pwd);
			System.out.println("DB 연동 성공!");
			//////////////비즈니스 영역/////////////////
			///
			///
			Statement st=con.createStatement();
			String sql="insert into student values('쌍용',40,'서울','02-1212-3434')";
		
			int count=st.executeUpdate(sql);
			System.out.println(count + "행이 입력되었습니다.");
			st.close();
			
			
			
			////////////////////////////////////////////
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
