package ��������λ��;

public class MurderDTO {
	   // �����͸� ǥ���ϱ� ���� ����� ������ VO Ŭ���� DTO(Data Transfer Object)
	   // VO Ŭ���� Value Object
	   
	   private String id, pw, nick;
	   
	   public MurderDTO(String id, String pw, String nick) {
	      this.id = id;
	      this.pw = pw;
	      this.nick = nick;
	   }

	public String getId() {
	      return id;
	   }
	   public void setId(String id) {
	      this.id = id;
	   }

	   public String getPw() {
	      return pw;
	   }

	   public void setPw(String pw) {
	      this.pw = pw;
	   }

	   public String getNick() {
	      return nick;
	   }

	   public void setNick(String nick) {
	      this.nick = nick;
	   }

	   @Override
	   public String toString() {
	      return "MemberDTO [id=" + id + ", pw=" + pw + ", nick=" + nick + "]";
	   }


	   
	   
	   
	   
	}
