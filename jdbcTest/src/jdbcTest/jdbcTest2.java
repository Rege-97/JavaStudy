package jdbcTest;

import java.sql.*;
import java.util.Scanner;

public class jdbcTest2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pwd="1234";
			
			
			Connection con=DriverManager.getConnection(url,user,pwd);
			
			Statement st=con.createStatement();
			Scanner sc= new Scanner(System.in);
			System.out.println("Sql 문장을 입력 [insert/update/delete문만]");
			System.out.print("=>");
			String sql=sc.nextLine();
			
			int count=st.executeUpdate(sql);
			System.out.println(count+"개의 행이 변경되었습니다.");
			st.close();
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
