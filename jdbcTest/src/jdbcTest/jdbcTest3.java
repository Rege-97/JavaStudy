package jdbcTest;

import java.sql.*;

public class jdbcTest3 {

	public static void main(String[] args) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pwd = "1234";

		Connection conn = DriverManager.getConnection(url, user, pwd);

		Statement st = conn.createStatement();

		String sql = "select * from student";
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			String name = rs.getString("name");
			int age =rs.getInt("age");
			String addr=rs.getString(3);
			String tel=rs.getString(4);
			
			System.out.println(name+"\t"+age+"\t"+addr+"\t"+tel+"\t");
		}
		
		rs.close();

		conn.close();
	}

}
