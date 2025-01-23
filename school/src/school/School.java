package school;

import java.sql.*;
import java.util.*;

public class School {

	static String sql = "";
	static int count = 0;

	static String tnum = "A Class";
	static String tname = "";

	static int snum = 0;
	static String sname = "";
	static int sage = 0;
	static String saddr = "";
	static String stel = "";

	static int skor = 0;
	static int smat = 0;
	static int seng = 0;
	static int savg = 0;

	public static int isLoginMenu(int user_m3, Scanner sc) throws Exception {
		System.out.println();
		System.out.println("===================================================");
		System.out.println("             학사 관리 프로그램 v2.0");
		System.out.println("===================================================");
		System.out.println();
		System.out.println("1. 로그인");
		System.out.println("2. 계정 생성");
		System.out.println("3. 프로그램 종료");
		System.out.println();
		System.out.print("메뉴 입력 > ");
		user_m3 = sc.nextInt();
		sc.nextLine();

		return user_m3;
	}

	public static boolean signIn(Connection conn, Scanner sc, boolean isLogin) throws Exception {

		System.out.println();
		System.out.println("== 로그인 ==");
		System.out.println();
		System.out.print("ID : ");
		String id = sc.nextLine();
		System.out.print("PW : ");
		String pw = sc.nextLine();

		sql = "select * from sign";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			String id_c = rs.getString("id");
			String pw_c = rs.getString("pw");

			if (id_c.equals(id) && pw_c.equals(pw)) {

				isLogin = true;
				System.out.println();
				System.out.println("로그인 되었습니다.");
				break;
			}
		}

		if (!isLogin) {
			System.out.println("ID와 PW가 틀렸습니다.");
		}

		rs.close();
		ps.close();

		return isLogin;
	}

	public static void signUp(Connection conn, Scanner sc) throws Exception {
		sql = "insert into sign values(?,?)";
		PreparedStatement ps2 = conn.prepareStatement(sql);
		System.out.println();
		System.out.println("== 계정 생성 ==");
		System.out.println();
		System.out.print("ID : ");
		String id = sc.nextLine();
		System.out.print("PW : ");
		String pw = sc.nextLine();

		ps2.setString(1, id);
		ps2.setString(2, pw);

		count = ps2.executeUpdate();
		System.out.println();
		System.out.println(count + "개의 계정이 생성되었습니다.");

		ps2.close();

	}

	public static int printMenu(Scanner sc, int user_m) {

		System.out.println();
		System.out.println("===================================================");
		System.out.println("             학사 관리 프로그램 v2.0");
		System.out.println("===================================================");
		System.out.println();
		System.out.println("1. 반 정보 등록");
		System.out.println("2. 학생 정보 등록");
		System.out.println("3. 과목 점수 등록");
		System.out.println("4. 반별 석차 출력");
		System.out.println("5. 전체 석차 출력");
		System.out.println("6. 학생 검색");
		System.out.println("7. 반 정보 조회");
		System.out.println("8. 프로그램 초기화");
		System.out.println("9. 프로그램 종료");
		System.out.println();
		System.out.print("메뉴 입력 > ");

		user_m = sc.nextInt();
		sc.nextLine();

		return user_m;
	}

	public static void classInput(Connection conn, Scanner sc) throws Exception {
		sql = "insert into teacher values(?,?)";
		String search1 = "select * from teacher";

		System.out.println();
		System.out.println("== 반 정보 등록 ==");
		System.out.println();

		PreparedStatement ps1 = conn.prepareStatement(search1);

		ResultSet rs = ps1.executeQuery();

		while (rs.next()) {
			if (rs.getString("tnum").charAt(0) == tnum.charAt(0)) {
				tnum = ((char) (tnum.charAt(0) + 1)) + " Class";
			}
		}

		PreparedStatement ps2 = conn.prepareStatement(sql);

		System.out.println("다음 순번의 반은 " + tnum + " 입니다.");
		System.out.println();
		System.out.print("선생님 이름을 입력하세요 : ");
		tname = sc.nextLine();

		ps2.setString(1, tnum);
		ps2.setString(2, tname);

		count = ps2.executeUpdate();

		System.out.println();
		System.out.println(count + "건의 정보가 등록되었습니다.");
		rs.close();
		ps1.close();
		ps2.close();
	}

	public static void studentInfoInput(Scanner sc, Connection conn) throws Exception {
		System.out.println();
		System.out.print("학생 이름 : ");
		sname = sc.nextLine();
		System.out.print("학생 나이 : ");
		sage = sc.nextInt();
		sc.nextLine();
		System.out.print("학생 주소 : ");
		saddr = sc.nextLine();
		System.out.print("학생 전화번호 : ");
		stel = sc.nextLine();

		classInfo(conn);
		while (true) {
			System.out.println();
			System.out.print("반 이름(대문자 알파벳 1개) : ");
			String tnum_s = sc.nextLine();

			if (tnum_s.length() == 1) {
				tnum = tnum_s + " Class";
				break;
			} else {
				System.out.println();
				System.out.println("반 이름은 대문자 알파벳 한개 입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	public static void studentInput(Connection conn, Scanner sc) throws Exception {

		System.out.println();
		System.out.println("== 학생 정보 등록 ==");

		sql = "insert into student values(sq_student_snum.nextval,?,?,?,?,?)";
		PreparedStatement ps1 = conn.prepareStatement(sql);

		studentInfoInput(sc, conn);

		ps1.setString(1, sname);
		ps1.setInt(2, sage);
		ps1.setString(3, saddr);
		ps1.setString(4, stel);
		ps1.setString(5, tnum);

		count = ps1.executeUpdate();
		System.out.println();
		System.out.println(count + "건의 정보가 등록되었습니다.");

		sql = "select * from student "
				+ "where sname=? "
				+ "order by snum";

		PreparedStatement ps2 = conn.prepareStatement(sql);
		ps2.setString(1, sname);

		ResultSet rs = ps2.executeQuery();

		while (rs.next()) {
			snum = rs.getInt("snum");
		}

		sql = "insert into subject(snum) values(?)";
		PreparedStatement ps3 = conn.prepareStatement(sql);
		ps3.setInt(1, snum);

		count = ps3.executeUpdate();

		ps1.close();
		rs.close();
		ps2.close();
		ps3.close();

	}

	public static void subjectInput(Connection conn, Scanner sc) throws Exception {

		sql = "select * "
				+ "from student st,subject sb "
				+ "where st.snum = sb.snum and sb.savg=0 "
				+ "order by st.snum";
		PreparedStatement ps1 = conn.prepareStatement(sql);
		ResultSet rs = ps1.executeQuery();
		System.out.println();
		System.out.println("== 과목 점수 등록 ==");
		System.out.println();
		System.out.println("점수 입력이 필요한 학생 목록");
		System.out.println();
		System.out.println("학사번호\t|학생이름\t|나이\t|주소\t|전화번호\t|반번호");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------");

		while (rs.next()) {
			snum = rs.getInt("snum");
			sname = rs.getString("sname");
			sage = rs.getInt("sage");
			saddr = rs.getString("saddr");
			stel = rs.getString("stel");
			tnum = rs.getString("tnum");

			System.out.println(snum + "\t\t|" + sname + "\t\t|" + sage + "\t|" + saddr + "\t|" + stel + "\t|" + tnum);
		}

		System.out.println();
		System.out.print("점수를 입력할 학생의 학사번호 : ");
		snum = sc.nextInt();

		sql = "update subject set skor=?,smat=?,seng=?, savg=? where snum= ?";
		PreparedStatement ps2 = conn.prepareStatement(sql);
		System.out.print("국어 점수 : ");
		skor = sc.nextInt();
		sc.nextLine();
		System.out.print("수학 점수 : ");
		smat = sc.nextInt();
		sc.nextLine();
		System.out.print("영어 점수 : ");
		seng = sc.nextInt();
		sc.nextLine();

		savg = (skor + smat + seng) / 3;

		ps2.setInt(1, skor);
		ps2.setInt(2, smat);
		ps2.setInt(3, seng);
		ps2.setInt(4, savg);
		ps2.setInt(5, snum);

		count = ps2.executeUpdate();
		System.out.println();
		System.out.println(count + "건의 정보가 등록되었습니다.");
		ps2.close();

	}

	public static void printInfo(Connection conn, Scanner sc, ResultSet rs) throws Exception {
		int rank = 0;
		System.out.println();
		System.out.println("석차\t|학사번호\t|학생이름\t|나이\t|주소\t|전화번호\t|반번호\t\t|담임선생님\t|국어점수\t|수학점수\t|영어점수\t|평균");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------");
		while (rs.next()) {
			snum = rs.getInt("snum");
			sname = rs.getString("sname");
			sage = rs.getInt("sage");
			saddr = rs.getString("saddr");
			stel = rs.getString("stel");
			tnum = rs.getString("tnum");
			tname = rs.getString("tname");
			skor = rs.getInt("skor");
			smat = rs.getInt("smat");
			seng = rs.getInt("seng");
			savg = rs.getInt("savg");

			rank++;

			System.out.println(rank + "\t|" + snum + "\t\t|" + sname + "\t\t|" + sage + "\t|" + saddr + "\t|" + stel
					+ "\t|" + tnum + "\t|" + tname + "\t\t|" + skor + "\t\t|" + smat + "\t\t|" + seng + "\t\t|" + savg);

		}

	}

	public static void classRank(Connection conn, Scanner sc) throws Exception {
		System.out.println();
		System.out.println("== 반별 석차 출력 ==");

		classInfo(conn);
		while (true) {
			System.out.println();
			System.out.print("반 이름(대문자 알파벳 1개) : ");
			String tnum_s = sc.nextLine();

			if (tnum_s.length() == 1) {
				tnum = tnum_s + " Class";
				break;
			} else {
				System.out.println();
				System.out.println("반 이름은 대문자 알파벳 한개 입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}

		sql = "select * from student st,subject sb,teacher t "
				+ "where st.snum=sb.snum and st.tnum=t.tnum and st.tnum=? " + "order by savg desc";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, tnum);
		ResultSet rs = ps.executeQuery();

		printInfo(conn, sc, rs);

		rs.close();
		ps.close();

	}

	public static void allRank(Connection conn, Scanner sc) throws Exception {
		System.out.println();
		System.out.println("== 전교생 석차 출력 ==");

		sql = "select * from student st,subject sb,teacher t "
				+ "where st.snum=sb.snum and st.tnum=t.tnum "
				+ "order by savg desc";
		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		printInfo(conn, sc, rs);

		rs.close();
		ps.close();

	}

	public static void searchStudent(Connection conn, Scanner sc) throws Exception {
		System.out.println();
		System.out.println("== 학생 검색 ==");
		System.out.println();

		System.out.print("검색할 학사번호를 입력 : ");
		snum = sc.nextInt();
		sc.nextLine();

		sql = "select * from student st,subject sb,teacher t "
				+ "where st.snum=sb.snum and st.tnum=t.tnum and st.snum=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, snum);
		ResultSet rs = ps.executeQuery();

		printInfo(conn, sc, rs);
		rs.close();
		ps.close();

	}

	public static void studentUpdate(Connection conn, Scanner sc, int user_m2) throws Exception {
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		System.out.println("1. 학생 데이터 삭제");
		System.out.println("2. 학생 데이터 수정");
		System.out.println("3. 이전 메뉴");
		System.out.println();
		System.out.print("메뉴 입력 > ");
		user_m2 = sc.nextInt();
		sc.nextLine();

		switch (user_m2) {
		case 1:
			System.out.println();
			System.out.println("== 학생 삭제 ==");
			System.out.println();
			System.out.println("학생 데이터를 삭제합니다.");
			sql = "delete from subject where snum=?";
			PreparedStatement ps1 = conn.prepareStatement(sql);
			ps1.setInt(1, snum);
			ps1.executeUpdate();
			ps1.close();

			sql = "delete from student where snum=?";
			PreparedStatement ps2 = conn.prepareStatement(sql);
			ps2.setInt(1, snum);
			count = ps2.executeUpdate();
			System.out.println();
			System.out.println(count + "건의 정보가 삭제 되었습니다.");
			ps2.close();

			break;
		case 2:
			System.out.println();
			System.out.println("== 학생 정보 수정 ==");
			System.out.println();
			System.out.println(sname + " 학생의 데이터를 수정합니다.");
			System.out.println();

			studentInfoInput(sc, conn);

			sql = "update student set sname=?,sage=?,saddr=?,stel=?,tnum=? where snum=? ";

			PreparedStatement ps3 = conn.prepareStatement(sql);
			ps3.setString(1, sname);
			ps3.setInt(2, sage);
			ps3.setString(3, saddr);
			ps3.setString(4, stel);
			ps3.setString(5, tnum);
			ps3.setInt(6, snum);

			count = ps3.executeUpdate();
			System.out.println();
			System.out.println(count + "건의 정보가 변경되었습니다.");
			ps3.close();

			break;
		case 3:
			System.out.println();
			System.out.println("이전 메뉴로 돌아갑니다.");
			break;

		default:
			System.out.println("잘못 입력하였습니다.");
		}

	}

	public static void classInfo(Connection conn) throws Exception {
		sql = "select t.tnum,t.tname,count(*) "
				+ "from teacher t,student s " 
				+ "where t.tnum=s.tnum "
				+ "group by s.tnum,t.tnum,t.tname "
				+ "order by t.tnum";

		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		System.out.println();
		System.out.println("현재 반과 담임 정보");
		System.out.println();
		System.out.println("반번호\t|담임선생님\t|학생 수");
		System.out.println("--------------------------------------");
		while (rs.next()) {

			tnum = rs.getString("tnum");
			tname = rs.getString("tname");
			int count2 = rs.getInt("count(*)");

			System.out.println(tnum + "\t|" + tname + "\t\t|" + count2);

		}
		rs.close();
		ps.close();

	}

	public static void classUpdate(Connection conn, Scanner sc, int user_m2) throws Exception {
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		System.out.println("1. 담임선생님 변경");
		System.out.println("2. 이전 메뉴");
		System.out.println();
		System.out.print("메뉴 입력 > ");
		user_m2 = sc.nextInt();
		sc.nextLine();

		switch (user_m2) {

		case 1:
			System.out.println();
			System.out.println("== 담임선생님 변경 ==");
			while (true) {
				System.out.println();
				System.out.print("담임을 변경할 반 : ");
				String tnum_s = sc.nextLine();
				if (tnum_s.length() == 1) {
					tnum = tnum_s + " Class";
					break;
				} else {
					System.out.println("반 이름은 알파벳 한개 입니다.");
					System.out.println("다시 입력해주세요.");
				}
			}
			sql = "update teacher set tname=? where tnum=?";
			PreparedStatement ps = conn.prepareStatement(sql);

			System.out.println();
			System.out.print("변경할 담임 선생님 이름 : ");
			tname = sc.nextLine();

			ps.setString(1, tname);
			ps.setString(2, tnum);

			count = ps.executeUpdate();
			System.out.println();
			System.out.println(count + "건의 정보가 변경되었습니다.");

			ps.close();
			break;
		case 2:
			System.out.println();
			System.out.println("이전 메뉴로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하였습니다.");
		}

	}

	public static void delete(Connection conn, Scanner sc) throws Exception {
		System.out.println();
		System.out.println("== 데이터 초기화 ==");
		System.out.println();
		System.out.println("모든 정보가 초기화 됩니다.");
		System.out.print("정말 진행하시겠습니까?(Y/N) : ");

		String yn = sc.nextLine();

		if (yn.equals("Y") || yn.equals("y")) {
			sql = "delete from subject";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();

			sql = "delete from student";

			ps = conn.prepareStatement(sql);
			ps.executeUpdate();

			sql = "delete from teacher";

			ps = conn.prepareStatement(sql);
			ps.executeUpdate();

			sql = "drop sequence sq_student_snum";
			ps = conn.prepareStatement(sql);
			ps.execute();

			sql = "create sequence sq_student_snum";
			ps = conn.prepareStatement(sql);
			ps.execute();
			System.out.println();
			System.out.println("모든 정보가 초기화 되었습니다.");
			ps.close();
		} else if (yn.equals("N") || yn.equals("n")) {
			System.out.println();
			System.out.println("초기화를 취소합니다. 이전 메뉴로 돌아갑니다.");
		} else {
			System.out.println();
			System.out.println("잘못 입력하였습니다. 이전 메뉴로 돌아갑니다.");
		}

	}

	public static void main(String[] args) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pwd = "1234";

		Connection conn = DriverManager.getConnection(url, user, pwd);
		Scanner sc = new Scanner(System.in);

		int user_m = 0;
		int user_m2 = 0;
		int user_m3 = 0;

		boolean isLogin = false;

		while (!isLogin) {
			sc = new Scanner(System.in);
			try {
				user_m3 = isLoginMenu(user_m3, sc);

				switch (user_m3) {
				case 1:
					isLogin = signIn(conn, sc, isLogin);
					break;
				case 2:
					signUp(conn, sc);
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
				}
			} catch (SQLException e) {
				System.out.println();
				System.out.println("이미 있는 ID 이거나 " + "정보를 너무 길게 입력하였습니다.");
				System.out.println("메인메뉴로 돌아갑니다.");
			} catch (InputMismatchException e) {
				System.out.println();
				System.out.println("숫자만 입력해주세요.");
				System.out.println("메인메뉴로 돌아갑니다.");
			} catch (Exception e) {
				System.out.println();
				System.out.println("알수없는 오류 발생");
				System.out.println("메인메뉴로 돌아갑니다.");
			}
		}

		while (true) {
			try {
				sc = new Scanner(System.in);

				user_m = printMenu(sc, user_m2);

				switch (user_m) {
				case 1:
					classInput(conn, sc);
					break;
				case 2:
					studentInput(conn, sc);
					break;
				case 3:
					subjectInput(conn, sc);
					break;
				case 4:
					classRank(conn, sc);
					break;
				case 5:
					allRank(conn, sc);
					break;
				case 6:
					searchStudent(conn, sc);
					studentUpdate(conn, sc, user_m2);
					break;
				case 7:
					System.out.println();
					System.out.println("== 반 정보 조회 ==");
					classInfo(conn);
					classUpdate(conn, sc, user_m2);
					break;
				case 8:
					delete(conn, sc);
					break;
				case 9:
					System.out.println();
					System.out.println("프로그램을 종료합니다.");
					conn.close();
					System.exit(0);
					break;
				default:
					System.out.println();
					System.out.println("잘못 입력하였습니다.");
				}

			} catch (SQLIntegrityConstraintViolationException e) {
				System.out.println();
				System.out.println("반이름을 잘못 입력하였습니다.");
				System.out.println("메인메뉴로 돌아갑니다.");
			} catch (SQLException e) {
				System.out.println();
				System.out.println("정보를 너무 길게 입력하였습니다.");
				System.out.println("메인메뉴로 돌아갑니다.");
			} catch (InputMismatchException e) {
				System.out.println();
				System.out.println("숫자만 입력해주세요.");
				System.out.println("메인메뉴로 돌아갑니다.");
			} catch (Exception e) {
				System.out.println();
				System.out.println("알수없는 오류 발생");
				System.out.println("메인메뉴로 돌아갑니다.");
			}
		}

	}

}
