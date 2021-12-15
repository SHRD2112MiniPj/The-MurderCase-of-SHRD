package 스인재살인사건;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MurderDAO {

	// DAO DataBase Access Object
	// db에 접근하기 위한 객체를 만들 수 있는 클래스
	Scanner sc = new Scanner(System.in);
//	MurderDTO dto = new MurderDTO(null, null, null)
	private Connection conn; // 변수들은 선언만 하면 null 값으로 자동 초기화 = null 할 필요 없음.
	private PreparedStatement psmt; // 기본 자료형은 0이 들어감. 필드, 전역변수일 때만
	private ResultSet rs;
	String sql = "";
	int temp = 0;
	String nick = null;
	String id;

	private void getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_5_1209";
			String db_pw = "smhrd5";

			try {
				conn = DriverManager.getConnection(db_url, db_id, db_pw);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void close() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String login(String id, String pw) {

		// 로그인 기능
		getConnection();
		String nick = null;

		try {
			sql = "select * from member where member_id = ? and password = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();
			if (rs.next()) {
				nick = rs.getString("nickname");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return nick;
	}

	public int join(String id, String pw, String nick) {

		// 회원가입 기능

		int cnt = 0;
		getConnection();
		try {
			sql = "insert into member values(? , ? , ?, 0)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);

			cnt = psmt.executeUpdate();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			close();
		}

		return cnt;

	}

	public void showOpening() {

		// 오프닝

		getConnection();

		try {

			sql = "select * from suspect";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			System.out.println("용의자이름\t" + "특징\t\t\t\t" + "위치\t" + "직업\t" + "나이");

			while (rs.next()) {
				String a = rs.getString("name");
				String b = rs.getString("feature");
				String c = rs.getString("room");
				String d = rs.getString("job");
				int e = rs.getInt("age");
				System.out.printf("%s\t%s\t\t\t%s\t%s\t%d\n", a, b, c, d, e);
			}
			System.out.println();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public void showCount(String id) {

		// 카운터
		int temp = 0;
		getConnection();

		try {

			sql = "select count from member where member_id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();
			if (rs.next()) {
				temp = rs.getInt("count");
			}

			System.out.println("진행 턴 : " + temp);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

	}

	//////////////////////////////////////////////////////////////////////////

	public int getClue(int clue_id, String id) {
		// 획득한 증거를 getclue테이블에 insert하기
		getConnection();
		try {
			sql = "insert into getclue values(?, ?)";
			psmt = conn.prepareStatement(sql); // conn이 psmt 에 sql 쓸 수 있는 권한을 넘겨주고 확인함
			psmt.setInt(1, clue_id);
			psmt.setString(2, id);

			temp = psmt.executeUpdate(); // 테이블의 내용이 변경될때

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return temp;
	}

	public int deleteClue(String member_id) {
		// 엔딩을 봤을 때 해당id가 획득한 증거 모두 지우기
		int temp2 = 0;
		getConnection();
		try {
			sql = "delete from getclue where id = ?"; // id 에 해당하는 getclue 를 전부 삭제
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member_id);
			temp = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 어떤 상황이어도 무조~~건 거쳐가는 구문 페이지
			// 먼저 열은 것을 마지막에 닫아야함.
			close();
		}
		return temp;
	}

	public int deleteCount(String member_id) {
		// 엔딩을 봤을 때 member 테이블에서 count값 초기화하기
		int temp2 = 0;
		getConnection();
		try {
			sql = "update member set count = 0 where id = ?"; // id 에 해당하는 getclue 를 전부 삭제
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member_id);
			temp2 = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 어떤 상황이어도 무조~~건 거쳐가는 구문 페이지
			// 먼저 열은 것을 마지막에 닫아야함.
			close();
		}
		return temp2;
	}

	public void ranking() {
		// 랭킹 불러오기
		getConnection();

		try {
			sql = "select * from (select * from rank order by count asc) where rownum <= 10";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			System.out.println("순위" + "\t" + "ID" + "\t" + "NICK" + "\t" + "COUNT" + "\t" + "증거개수");
			System.out.println("=======================================");
			int i = 1;
			while (rs.next()) {

				String a = rs.getString("member_id");
				String b = rs.getString("nickname");
				String c = rs.getString("count");
				String d = rs.getString("cluecount");
//				System.out.println(i + ". \t" + a + " \t" + b + " \t" + c + " \t" + d);
//				System.out.println();
				System.out.printf("%d.\t%2s\t%3s\t%3s\t%3s\n", i, a, b, c, d);
				i++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public void showClue(String id) {
		// 중간에 저장한 내용 불러오기
		getConnection();

		try {
			sql = "select g.member_id, c.room, c.clue from getclue g, clue c where g.clue_id = c.clue_id and member_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			System.out.println("================증거목록================");
			System.out.printf("ID\tROOM\t\tCLUE\n");
			while (rs.next()) {
				String a = rs.getString("member_id");
				String b = rs.getString("room");
				String c = rs.getString("clue");
				System.out.printf("%s\t%s에서 획득한 \t%s\n", a, b, c);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

}
