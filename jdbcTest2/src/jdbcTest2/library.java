package jdbcTest2;

import java.sql.*;
import java.util.Scanner;

public class library {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pwd = "1234";

		Connection conn = DriverManager.getConnection(url, user, pwd);

		int bcode = 0;
		String bname = "";
		String writer = "";
		int price = 0;
		int pcode = 0;

		String pname = "";
		String ptel = "";
		String paddr = "";

		while (true) {
			System.out.println();
			System.out.println("=========================");
			System.out.println("도서관 서적 등록 프로그램");
			System.out.println("=========================");

			System.out.println("1. 서적 등록");
			System.out.println("2. 서적 삭제");
			System.out.println("3. 서적 조회");
			System.out.println("4. 출판사 등록");
			System.out.println("5. 출판사 조회");
			System.out.println("6. 프로그램 종료");
			System.out.println();
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				System.out.println();
				String sql1 = "insert into lib values(sq_lib_bcode.nextval,?,?,?,?)";
				PreparedStatement ps1 = conn.prepareStatement(sql1);
				System.out.print("책 제목 : ");
				bname = sc.nextLine();
				System.out.print("저자 : ");
				writer = sc.nextLine();
				System.out.print("책 가격 : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("출판사 코드 : ");
				pcode = sc.nextInt();
				sc.nextLine();

				ps1.setString(1, bname);
				ps1.setString(2, writer);
				ps1.setInt(3, price);
				ps1.setInt(4, pcode);

				int count1 = ps1.executeUpdate();
				System.out.println();
				System.out.println(count1 + "개의 책이 등록되었습니다.");
				ps1.close();
				break;
			case 2:
				System.out.println();
				System.out.print("삭제할 책의 식별코드를 입력하세요 : ");
				bcode = sc.nextInt();
				sc.nextLine();
				String sql2 = "delete from lib where bcode=?";
				PreparedStatement ps2 = conn.prepareStatement(sql2);
				ps2.setInt(1, bcode);

				int count2 = ps2.executeUpdate();
				System.out.println();
				System.out.println(count2 + "개의 책이 삭제되었습니다.");
				ps2.close();
				break;
			case 3:
				System.out.println();
				System.out.println("식별코드\t책 제목\t\t저자\t\t가격\t\t출판사코드");
				String sql3 = "select * from lib";
				PreparedStatement ps3 = conn.prepareStatement(sql3);
				ResultSet rs1 = ps3.executeQuery();

				while (rs1.next()) {
					bcode = rs1.getInt("bcode");
					bname = rs1.getString("bname");
					writer = rs1.getString("writer");
					price = rs1.getInt("price");
					pcode = rs1.getInt("pcode");

					System.out.println(bcode + "\t\t" + bname + "\t\t" + writer + "\t\t" + price + "\t\t" + pcode);
				}
				ps3.close();
				rs1.close();
				break;
			case 4:
				System.out.println();
				String sql4 = "insert into pub values(sq_pub_pcode.nextval*10,?,?,?)";
				PreparedStatement ps4 = conn.prepareStatement(sql4);
				System.out.print("출판사 이름 : ");
				pname = sc.nextLine();
				System.out.print("출판사 전화번호 : ");
				ptel = sc.nextLine();
				System.out.print("출판사 주소 : ");
				paddr = sc.nextLine();

				ps4.setString(1, pname);
				ps4.setString(2, ptel);
				ps4.setString(3, paddr);

				int count4 = ps4.executeUpdate();
				System.out.println();
				System.out.println(count4 + "개의 출판사가 등록되었습니다.");
				ps4.close();
				break;
			case 5:
				System.out.println();
				System.out.println("출판사코드\t출판사이름\t전화번호\t주소");
				String sql5 = "select * from pub";
				PreparedStatement ps5 = conn.prepareStatement(sql5);
				ResultSet rs2 = ps5.executeQuery();

				while (rs2.next()) {
					pcode = rs2.getInt("pcode");
					pname = rs2.getString("pname");
					ptel = rs2.getString("ptel");
					paddr = rs2.getString("paddr");

					System.out.println(pcode + "\t\t" + pname + "\t\t" + ptel + "\t\t" + paddr);
				}

				ps5.close();
				rs2.close();
				break;
			case 6:
				conn.close();
				System.exit(0);
				break;
			}

		}

	}

}
