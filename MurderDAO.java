package ��������λ��;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MurderDAO {

	// DAO DataBase Access Object
	// db�� �����ϱ� ���� ��ü�� ���� �� �ִ� Ŭ����
	Scanner sc = new Scanner(System.in);
//	MurderDTO dto = new MurderDTO(null, null, null)
	private Connection conn; // �������� ���� �ϸ� null ������ �ڵ� �ʱ�ȭ = null �� �ʿ� ����.
	private PreparedStatement psmt; // �⺻ �ڷ����� 0�� ��. �ʵ�, ���������� ����
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

		// �α��� ���
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

		// ȸ������ ���

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

		// ������

		getConnection();

		try {

			sql = "select * from suspect";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			System.out.println("�������̸�\t" + "Ư¡\t\t\t\t" + "��ġ\t" + "����\t" + "����");

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

		// ī����
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

			System.out.println("���� �� : " + temp);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

	}

	//////////////////////////////////////////////////////////////////////////

	public int getClue(int clue_id, String id) {
		// ȹ���� ���Ÿ� getclue���̺� insert�ϱ�
		getConnection();
		try {
			sql = "insert into getclue values(?, ?)";
			psmt = conn.prepareStatement(sql); // conn�� psmt �� sql �� �� �ִ� ������ �Ѱ��ְ� Ȯ����
			psmt.setInt(1, clue_id);
			psmt.setString(2, id);

			temp = psmt.executeUpdate(); // ���̺��� ������ ����ɶ�

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return temp;
	}

	public int deleteClue(String member_id) {
		// ������ ���� �� �ش�id�� ȹ���� ���� ��� �����
		int temp2 = 0;
		getConnection();
		try {
			sql = "delete from getclue where id = ?"; // id �� �ش��ϴ� getclue �� ���� ����
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member_id);
			temp = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // � ��Ȳ�̾ ����~~�� ���İ��� ���� ������
			// ���� ���� ���� �������� �ݾƾ���.
			close();
		}
		return temp;
	}

	public int deleteCount(String member_id) {
		// ������ ���� �� member ���̺��� count�� �ʱ�ȭ�ϱ�
		int temp2 = 0;
		getConnection();
		try {
			sql = "update member set count = 0 where id = ?"; // id �� �ش��ϴ� getclue �� ���� ����
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member_id);
			temp2 = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // � ��Ȳ�̾ ����~~�� ���İ��� ���� ������
			// ���� ���� ���� �������� �ݾƾ���.
			close();
		}
		return temp2;
	}

	public void ranking() {
		// ��ŷ �ҷ�����
		getConnection();

		try {
			sql = "select * from (select * from rank order by count asc) where rownum <= 10";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			System.out.println("����" + "\t" + "ID" + "\t" + "NICK" + "\t" + "COUNT" + "\t" + "���Ű���");
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
		// �߰��� ������ ���� �ҷ�����
		getConnection();

		try {
			sql = "select g.member_id, c.room, c.clue from getclue g, clue c where g.clue_id = c.clue_id and member_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			System.out.println("================���Ÿ��================");
			System.out.printf("ID\tROOM\t\tCLUE\n");
			while (rs.next()) {
				String a = rs.getString("member_id");
				String b = rs.getString("room");
				String c = rs.getString("clue");
				System.out.printf("%s\t%s���� ȹ���� \t%s\n", a, b, c);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

}
