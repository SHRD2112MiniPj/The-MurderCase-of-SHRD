package murderCase_of_SMHRD;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {

	MP3Player mp3 = new MP3Player();

	public void stopMusic() {

		mp3.stop();
	}

	public void playRain() {
		mp3.play("C://music/비오는날 천둥.mp3"); // 늘릴거
	}

	public void playScream() {
		mp3.play("C://music/남-비명2.mp3");
	}

	public void playButten() {
		mp3.play("C://music/버튼소리.mp3"); // 컴퓨터 키는 소리(예비)
	}

	public void playWalk() {
		mp3.play("C://music/구두발자국-아스팔트.mp3"); // 자를거

	}

	public void Playopen() {
		mp3.play("C://music/책상 서랍 여는 소리.mp3");
	}

	public void Playpursuing() {
		mp3.play("C://music/추궁할때 브금.mp3");
	}

	public void Goodending() {
		mp3.play("C://music/[코난] 명탐정 코난 - 메인 테마 브금.mp3");
	}

	public void Badending() {
		mp3.play("C://music/실패 엔딩 효과음.mp3");
	}
///////////////////////////////	//////////////////////////////////////////////////////추가본////////////////////////////////////////////////////////
	public void Reasoning() {
		mp3.play("C://music/추리.mp3");
	}

	public void cabinetopen() {
		mp3.play("C://music/캐비닛 열고 닫는 소리(수정.mp3)"); // 캐비넷 여는 소리
	}

	public void draweropen() {
		mp3.play("C://music/서랍 열고 닫는 소리(수정).mp3");
	}

}
