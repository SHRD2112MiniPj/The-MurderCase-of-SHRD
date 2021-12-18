package murderCase_of_SMHRD;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 아스키 아트로 스인재 살인사건 제목과 BGM(스산하고 어두운)'
		MurderDAO dao = new MurderDAO();
		Delay time = new Delay();
		Scanner sc = new Scanner(System.in);
		Quiz quiz = new Quiz();
		Image image = new Image();
		MusicPlayer music = new MusicPlayer();
		int cnt = 0;

		// 여기부터 비바람 효과음 반복해서 회원가입 전까지??
		music.goodEnding();
		
		image.imageTitle();
		time.timeDelay(700);
		System.out.println("\n\n무슨일이 생길 것처럼 미스테리한 냄새가 나는 밤...\n");
		time.timeDelay(1200);
		System.out.println("광주 동부 경찰서에 살인사건에 대한 제보가 들어왔다!\n");
		time.timeDelay(700);
		System.out.println("당신은 살인 사건의 범인을 밝혀낼 담당 형사!\n");
		time.timeDelay(700);
		System.out.println("이때 경찰 동료가 당신의 이름을 부른다!!\n\n");
		time.timeDelay(1000);

		String choice = "";
		int temp = 0;
		String temp2 = "";
		String id = "";
		String pw = "";
		String nick = "";

		while (true) {
			System.out.println("오늘 멋지게 용의자를 밝혀낼 당신의 이름은??");
			System.out.println("[1] 회원가입 [2] 로그인");
			System.out.print("입력 >> ");
			choice = sc.next();

			if (choice.equals("1")) {
				System.out.println("회원 가입! 새로운 형사님 환영합니다!!");
				while (true) {
					System.out.print("당신의 아이디를 입력하세요 >> ");
					id = sc.next();

					boolean checkPbk = id.equals("pbk") || id.equals("PBK") || id.equals("Pbk")
							|| id.equals("hodoodaddy") || id.equals("HODOODADDY") || id.equals("Hodoodaddy")
							|| id.equals("박병관") || id.equals("병관쌤") || id.equals("호두아빠") || id.equals("병관샘")
							|| id.equals("병관");

					if (checkPbk) {
						System.out.println("사용할 수 없는 아이디입니다.\n");
					} else if (id.equals(dao.checkId(id))) {
						System.out.println("중복된 아이디 입니다. 다른 아이디를 입력해주세요");
					} else {
						break;
					}
				}

				System.out.print("비밀번호를 입력하세요 >> ");
				pw = sc.next();
				while (true) {
					System.out.print("당신의 닉네임을 입력하세요 >> ");
					nick = sc.next();

					boolean checkPbk = nick.equals("pbk") || nick.equals("PBK") || nick.equals("Pbk")
							|| nick.equals("hodoodaddy") || nick.equals("HODOODADDY") || nick.equals("Hodoodaddy")
							|| nick.equals("박병관") || nick.equals("병관쌤") || nick.equals("호두아빠") || nick.equals("병관샘")
							|| id.equals("병관");

					if (checkPbk) {
						System.out.println("사용할 수 없는 닉네임입니다.\n");
					} else {
						break;
					}
				}

				temp = dao.join(id, pw, nick);
				if (temp > 0) {
					System.out.println("회원가입 성공!");
					break;
				} else {
					System.out.println("회원가입 실패!");
				}

			} else if (choice.equals("2")) {
				System.out.println("형사님 환영합니다! 로그인을 해주세요!");
				System.out.print("아이디를 입력하세요 >> ");
				id = sc.next();
				System.out.print("비밀번호를 입력하세요 >> ");
				pw = sc.next();

				temp2 = dao.login(id, pw);
				if (temp2 != null) {
					System.out.println(temp2 + " 형사님 반갑습니다!\n");
					nick = temp2;
					break;
				} else {
					System.out.println("로그인 실패!\n");
				}

			} else {
				System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
			}
		}

		while (true) {
			System.out.println("\n[1]새로하기 [2]불러오기 [3]랭킹보기");
			System.out.print("입력 >> ");
			choice = sc.next();

			if (choice.equals("1")) {
				System.out.println("\n\n새로운 게임을 시작합니다.\n");
				dao.deleteClue(id);
				dao.deleteCount(id);
//				dao.getClue(1, id);
//				dao.getClue(2, id);
				break;
			} else if (choice.equals("2")) {
				if (dao.showCount(id) == 0) {
					System.out.println("저장된 정보가 없습니다. '[1]새로하기'를 선택하세요. \n");
				} else {
					System.out.println("이전 게임을 이어서 진행합니다.\n");
					cnt = dao.showCount(id);

					break;
				}

			} else if (choice.equals("3")) {
				System.out.println("랭킹을 확인합니다");
				dao.ranking();

			} else {
				System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
			}

		}

		if (music.isPlaying() == true) {
			music.stopMusic();
		}

		if (choice.equals("1")) {

			// opening
			music.playScream();
			image.imageIntro();
			System.out.println("비가 추적추적 내리는 어느날 밤...");
			time.timeDelay(700);
			System.out.println("상민은 지친 몸을 이끌고 옥상으로 올라갔다..");

			System.out.println("두둥!!!!!!!"); // BGM + 시체 아스키아트

			time.timeDelay(1200);
			music.playRain();

			System.out.println("스인재 학원의 스타 강사이자 촉망받던 인재였던 PBK");
			System.out.println("그는 싸늘한 주검으로 발견되었다!");
			time.timeDelay(700);
			System.out.println("당황한 상민은 피우려던 담배를 떨어뜨리고 시체 가까이 다가가는데...\n");

			while (true) {
				System.out.println("사체를 확인하시겠습니까?");
				System.out.println("[1] 다잉메세지 [2] 혈흔과 상처 [3] 선물상자 [4] 옷에 묻은 립스틱 [5] 다이아 반지 [6] 넘어가기\n"
						+ "[기본 정보는 간략히 증거보기를 통해 확인할 수 있습니다]");
				System.out.print("입력 >> ");
				choice = sc.next();
				System.out.println("");
				if (choice.equals("1")) {
					image.imageDie();
					System.out.println("상민은 시체 가까이 다가간다. PBK의 축 늘어진 손 끝에 어떤 메세지가 있다");
					System.out.println("죽기전에 범인에 대한 정보를 적으려다 만것 같다...\n");
					time.timeDelay(700);
					// 다잉메세지는 보여주기만 하고 테이블 저장 X
				} else if (choice.equals("2")) {
					System.out.println("피해자는 엎드린 채 죽어있다. 뒤통수를 살펴보니 큰 혹이 솟아있다. " + "누군가 뒤에서 그를 가격한 것일까?");
					time.timeDelay(700);
					System.out.println("그러나 그의 목 주변의 상처와 혈흔들 옷에 물든 핏자국을 보니 실제로는 " + "과다출혈이 원인일지도 모른다.\n");
					// 초기증거 혈흔과 목의 상처
				} else if (choice.equals("3")) {
					image.imageWatch();
					System.out.println(
							"피해자 시체 근처에 찌그러진 보랏빛 선물 상자가 널부러져 있다. 상민은 " + "겁에 질린채 열린 상자 안을 슬쩍 들여다 보니 반짝이는 새 시계가 보인다.");
					time.timeDelay(700);
					System.out.println("얼핏 보니 남자용 손목시계인 듯 싶다.\n");
					// 초기 증거 선물상자 속 새 시계
				} else if (choice.equals("4")) {
					image.imagelip();
					System.out.println("혈흔과 헷갈리지만 묘하게 다른 빛의 자국이 피해자의 등판에 묻어있다. 입술 모양의 " + "자국... 이것은 무엇일까?\n");
					time.timeDelay(700);
					// 초기 증거 립스틱 자국
				} else if (choice.equals("5")) {
					image.imageRing();
					System.out.println("피해자는 죽기전 어떤 여자와 마주친 것일까? 그의 바지춤 근처에 또 다른 물건이 보인다. "
							+ " 어둠속에서도 그 빛을 잃지 않은 꽤나 고가로 보이는 다이아반지를 발견한다. 상민은 흠칫 놀란다.\n");
					time.timeDelay(700);
					// 초기 증거 다이아 반지
				} else if (choice.equals("6")) {
					System.out.println("바로 게임을 실행합니다.\n");
					break; // skip
				}
			}

			System.out.println(".");
			time.timeDelay(500);
			System.out.println(".");
			time.timeDelay(500);
			System.out.println(".");
			time.timeDelay(500);
			System.out.println("상민은 놀란 가슴을 추스린채 옥상에서 빠져나와 계단에서 경찰서에 신고한다.\n");
			System.out.println(
					"당신은 용의자가 있는 장소를 선택하여 용의자를 추궁할 수 있습니다. \n" + "추궁을 통해 심적증거를 발견하거나 또 장소를 탐색하여 물적증거를 발견할 수 있습니다.\n\n");

		} ////////// 새로하기 오프닝 if문 종료 //
		time.timeDelay(500);

		if (music.isPlaying() == true) {
			music.stopMusic();
		}

		time.timeDelay(700);
		dao.showOpening();
		time.timeDelay(700);
		dao.showClue(id);
		System.out.println();
		System.out.println("===========================================");
		dao.showCount(id);
		System.out.println();

		while (true) {
			dao.save(cnt, id);
			System.out.println("당신은 복도에 도착했습니다.");
			System.out.println("[1] 탐색 [2] 범인지목 [3] 증거보기 [4] 저장 [5] 종료 ");
			System.out.print("입력 >> ");
			choice = sc.next();
			cnt++;
			System.out.println();

			if (choice.equals("1")) {
				// 탐색
				System.out.println("탐색할 장소를 선택하세요.");
				System.out.println("[1] 휴게실 [2] 원장실 [3] 경비실 [4] 강의실 [5] 교무실");
				System.out.print("탐색할 장소 입력 >> ");
				choice = sc.next();
				music.playWalk();
				System.out.println("\n\n");
				System.out.println();
				if (choice.equals("1")) {
					// 휴게실
					while (true) {
						System.out.println("\n휴게실에 박상민 학생이 있습니다.");
						System.out.println("무엇을 하시겠습니까?");
						System.out.println("[1] 용의자 추궁하기 [2] 증거 찾기 [3] 되돌아가기");
						System.out.print("입력 >> ");
						choice = sc.next();
						cnt++;
						System.out.println();
						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						if (choice.equals("1")) {
							// 범인과의 대화 - 기본정보
							music.playPushing();
							System.out.println(nick + " : " + "당신이 PBK 사체 최초발견자 입니까?");
							System.out.println("상민 :네... 10시 40분 넘어서 옥상에 갔더니 PBK선생님을...봤습니다....");
							time.timeDelay(700);
//									 범인과의 대화
//									 boolean true false 반환
//									 true(증거가 있을 때)

							System.out.println(nick + " : " + "옥상에는 왜 올라가셨나요?");
							System.out.println("상민 : PBK선생님 발표 자료를 준비하다가 바람좀 쐴겸 올라갔는데...\n");
							time.timeDelay(700);
							System.out.println(nick + " : " + "평소 피해자와의 관계가 어떻습니까?");
							System.out.println("상민 : 네? 지금 저를 의심하시나요? 저는 선생님을 도와 많은 프로젝트를 진행했습니다..\n");
							time.timeDelay(700);
							System.out.println("저에게 좋은 취업자리를 주시기로 약속해서 제가 무급으로 일하고 있는데 선생님을 죽이면\n");
							time.timeDelay(700);
							System.out.println("제게 무슨 이득이 있을까요?");
							time.timeDelay(700);
							System.out.println("작업과 과제가 많아 힘들긴 했지만.. 선생님은 저에게 꼭 필요한 분입니다!! 저는 결백해요!\n");

							if (dao.checkClue(15, id) == 15) {

							} else {
								dao.getClue(15, id);
							}

							// 추가 정보
							if (dao.checkClue(4, id) == 4 || dao.checkClue(10, id) == 10) {

								System.out.println(
										nick + " : " + "상민씨 추가로 나온 증거가 있습니다! " + "\n 결백하다는 말만으로는 상민씨의 말을 증명할 수가 없어요! ");
								System.out.println("상민 : 저는 8시 40분 부터 시체 발견 전까지 여기서 계속 작업중이었습니다! 결백합니다!\n");
								time.timeDelay(700);
								System.out.println(nick + " : 알리바이를 증언해주실 분이 있으십니까? ");
								System.out.println("상민 : 그, 그건... 아! 최근에 박나영원장님이랑 PBK선생님이 크게 다투는 것을 봤습니다! \n "
										+ "\t박나영 원장님이 범인일지도 모릅니다!");
								time.timeDelay(700);

								if (dao.checkClue(11, id) == 11) {

								} else {
									dao.getClue(11, id);
								}
							}

						} else if (choice.equals("2")) {
							// 증거찾기
							System.out.println("증거를 찾을 장소를 선택하세요");
							System.out.println("[1]정수기 뒤편 [2]쓰레기통 [3]휴식용 텐트 ");
							System.out.print("입력 >> ");
							choice = sc.next();
							cnt++;

							if (choice.equals("1")) {
								// 정수기
								System.out.println("정수기 뒤편을 살펴본다.");
								System.out.println("아무것도 없다.\n");

							} else if (choice.equals("2")) {
								// 쓰레기통-증거
								music.playGrope();
								System.out.println("휴게실 쓰레기통을 살펴본다.");
								cnt++;
								if (quiz.quizCafe()) {
									cnt++;

									if (dao.checkClue(4, id) == 4) {
										System.out.println("증거를 이미 획득했습니다.");
									} else {
										dao.getClue(4, id);
										System.out.println("증거를 획득!!");
										image.imageBlade();
									}

								} else {
									System.out.println("증거 획득 실패!!");
								}

							} else if (choice.equals("3")) {
								// 휴식용 텐트
								music.playGrope();
								System.out.println("텐트를 살펴보았다.");
								System.out.println("침구와 책 몇개가 보인다.\n");
								//
							} else {
								System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
							}

						} else if (choice.equals("3")) {
							System.out.println("복도로 나갑니다.\n\n");
							music.playWalk();
							break;
						} else {
							System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
						}

					}
				} else if (choice.equals("2")) {

					while (true) {
						// 원장실
						System.out.println("원장실에 박나영 원장이 있습니다.");
						System.out.println("무엇을 하시겠습니까?");
						System.out.println("[1] 용의자 추궁하기 [2] 증거 찾기 [3] 되돌아가기");
						System.out.print("입력 >> ");
						choice = sc.next();
						cnt++;

						if (music.isPlaying() == true) {
							music.stopMusic();
						}
						if (choice.equals("1")) {

//							 범인과의 대화
//							 boolean true false 반환
//							 true(증거가 있을 때)
							// 추가정보
							music.playPushing();
							System.out.println(nick + " : 원장님, 질문 몇개 해도 되겠습니까?(오... 온갖 명품에.. 매우 화려한 스타일이군..)");
							System.out.println("나영 : (앙칼지게) 지금 저를 의심하시는건가요? 좋아요. 뭐든지 물어보세요.\n");
							time.timeDelay(700);
							System.out.println(nick + " : 평소 피해자에 대해 어떻게 생각 하셨습니까?");
							System.out.println(
									"나영 : 좀 건방지긴 하지만 일은 잘했어요. 그래서 승진도 빨랐구요. \n" + "\t멍청하지 않다면 제가 죽였을 거라고 생각하진 않겠죠?!\n");
							time.timeDelay(700);

							if (dao.checkClue(16, id) == 16) {

							} else {
								dao.getClue(16, id);
							}

							// 추가 정보
							if (dao.checkClue(5, id) == 5 || dao.checkClue(8, id) == 8 || dao.checkClue(11, id) == 11) {

								System.out.println(nick + " : 지금까지 알아본 바로는 최근에 나영씨와 pbk 사이에 좀 큰 문제가 있었는데, 그것과는.. ");
								System.out.println(
										"나영 : 저는 계속 원장실에 있었어요! 중요한 프로젝트가 있어서 9시 15분에서 10시 20분까지 여기서 시청공무원과 회의중이었다구요!\n");
								time.timeDelay(700);
								System.out.println("나영 : 이건 시간 낭비야! 차라리 그 경비원이 더 의심이 가네요!\n"
										+ "\t휴... 여튼, 경비원 그 사람 PBK랑 수시로 같이 있는데다가, 빚도 있는 것 같던데?\n\t분명 뭔가 있었어요. 남들은 속아도 나는 보여요.\n");
								time.timeDelay(700);
								if (dao.checkClue(12, id) == 12) {

								} else {
									dao.getClue(12, id);
								}
							}

						} else if (choice.equals("2")) {
							// 증거찾기
							System.out.println("증거를 찾을 장소를 선택하세요");
							System.out.println("[1] 원장실 메인 컴퓨터  [2] 커다란 책장  [3] 책상 서랍 ");
							System.out.print("입력 >> ");
							choice = sc.next();
							cnt++;
							sc.nextLine();

							if (choice.equals("1")) {
								// 원장실 컴퓨터-증거
								cnt++;
								music.playButten();
								image.imageDesktop();
								System.out.println("원장실 메인컴퓨터에 접속합니다.");

								while (true) {
									System.out.println("\n[비밀번호 힌트]");

									if (quiz.quizKing()) {
										image.imagePayDoc();
										System.out.println("증거를 획득!!");
										if (dao.checkClue(5, id) == 5) {

										} else {
											dao.getClue(5, id);
										}
										break;
									} else {
										System.out.println("증거 획득 실패!!");
										break;
									}
								}

							} else if (choice.equals("2")) {
								// 책장
								System.out.println("커다란 책장을 살펴본다.");
								System.out.println("책들이 엄청 많다.");

							} else if (choice.equals("3")) {
								// 원장실 책상 서랍
								cnt++;
								music.playDrawerOpen();
								System.out.println("원장 책상의 서랍을 열어본다.");
								System.out.println("서랍이 자물쇠로 잠겨있고 옆에 힌트가 적힌 종이가 있다.");
								while (true) {
									System.out.println("\n[비밀번호 힌트]");

									if (quiz.quizKing2()) {
										image.imageDeposit();
										System.out.println("증거를 획득!!");
										// 송금내역 아스키아트 필요
										if (dao.checkClue(8, id) == 8) {

										} else {
											dao.getClue(8, id);
										}
										break;
									} else {

										System.out.println("증거 획득 실패!!");
										break;
									}
								}
							} else {
								System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
							}

						} else if (choice.equals("3")) {
							System.out.println("복도로 나갑니다.\n\n");
							music.playWalk();
							break;
						} else {
							System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
						}

					}
				} else if (choice.equals("3")) {

					while (true) {
						// 경비실
						System.out.println("\n경비실에 장현도 경비가 있습니다.");
						System.out.println("무엇을 하시겠습니까?");
						System.out.println("[1] 용의자 추궁하기 [2] 증거 찾기 [3] 되돌아가기");
						System.out.print("입력 >> ");
						choice = sc.next();
						cnt++;

						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						if (choice.equals("1")) {
							// 범인과의 대화 - 기본정보
							music.playPushing();
							System.out.println(nick + " : " + "장현도씨, 질문 몇개 해도 되겠습니까?(덩치가 크고... 생각보다 젊고 깔끔하군.)");
							System.out.println("현도 : (피곤한 표정) 무슨일이십니까..? 저도 힘들어요.. 제친구가 죽었다고요.\n");
							time.timeDelay(700);
//						 범인과의 대화
//						 boolean true false 반환
//						 true(증거가 있을 때)
							// 추가정보
							System.out.println(nick + " : " + "피해자와의 관계는 어떻습니까?");
							System.out.println("현도 : 저는 PBK와 초등학부터 친구입니다. 저는 절대 범인이 아니에요.\n");
							time.timeDelay(700);
							System.out.println(nick + " : " + "그렇군요, 9시 반부터 10시까지 무엇을 하셨죠?");
							System.out.println("현도 : 저는 건물 전체를 순찰중이었습니다. 1층부터 4층까지... 강의실에서는 서하라 선생님을 만났고, "
									+ "\n교무실에는 김지은 선생님이 있었습니다.\n");
							time.timeDelay(700);

							if (dao.checkClue(17, id) == 17) {

							} else {
								dao.getClue(17, id);
							}

							if (dao.checkClue(6, id) == 6 || dao.checkClue(12, id) == 12) {
								// 증거나 증언이 있을때 추가로 얻을 수 있는 심적증거
								// 추궁할때도 pushing 음악 줄건지?
								System.out.println("현도 : 저는 PBK의 도움을 많이 받았습니다. 절대 범인이 아닙니다.");
								System.out.println("저는 서하라 선생님이 의심됩니다. 그분 유명한 PBK의 라이벌이에요.\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "서하라 선생님과 PBK 사이가 좋지 않나요?");
								System.out.println("현도 : 네, 최근에도 둘 다 승진하려고 애썼는데, PBK만 된걸로 알고 있습니다. \n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "(일단 차분해 보이는 군... 하지만 다른 무언가는 없을까?)\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "혹시 옥상 문은 항상 잠겨있습니까? 열쇠 관리도 하시나요?");
								System.out.println("현도 : 필요할 때는 하지만.. 보관은 교무실에서 합니다.\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "PBK와 금전적인 거래가 있었나요?");
								System.out.println("현도 : ..... 제가 상황이 어려워 그 친구가 저를 도와준 것 뿐입니다. 전 고마워했구요.\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "어려운 상황에 도와줬다면 혹시 돈도 빌렸습니까? 그 금액이 얼마나 되는거죠?");
								System.out.println("현도 : (버럭 화를 내며)제가 그런것까지 대답 해야하나요? 더이상 질문 받지 않겠습니다.\n");

								if (dao.checkClue(13, id) == 13) {

								} else {
									dao.getClue(13, id);
								}
							}

						} else if (choice.equals("2")) {
							// 증거찾기
							System.out.println("\n증거를 찾을 장소를 선택하세요");
							System.out.println("[1]경비실 CCTV [2]경비실 책상 서랍 [3]장현도의 가방 ");
							System.out.print("입력 >> ");
							choice = sc.next();

							if (choice.equals("1")) {
								// 경비실 모니터
								System.out.println("\n경비실 CCTV를 살펴본다.");
								System.out.println("휴게실, 교무실, 강의실, 원장실에 한명씩 사람이 있다.");

							} else if (choice.equals("2")) {
								// 경비실 책상 서랍
								music.playOpen();
								System.out.println("경비실 책상 서랍을 열어본다.");
								System.out.println("영수증 쪼가리가 들어있다.");

							} else if (choice.equals("3")) {
								// 장현도의 가방
								cnt++;
								music.playGrope();
								System.out.println("장현도의 가방이 열려있다.");
								System.out.println("중요해보이는 서류가 보인다.");

								if (quiz.quizSecu()) {
									image.imageRent();
									System.out.println("증거를 획득!!");

									if (dao.checkClue(6, id) == 6) {

									} else {
										dao.getClue(6, id);
									}
								} else {
									System.out.println("증거 획득 실패!!");
								}
							} else {
								System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
							}

						} else if (choice.equals("3")) {
							System.out.println("복도로 나갑니다.\n\n");
							music.playWalk();
							break;

						} else {
							System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
						}

					}
				} else if (choice.equals("4")) {

					while (true) {
						// 강의실
						System.out.println("\n강의실에 서하라 선생님이 있습니다.");
						System.out.println("무엇을 하시겠습니까?");
						System.out.println("[1] 용의자 추궁하기 [2] 증거 찾기 [3] 되돌아가기");
						System.out.print("입력 >> ");
						choice = sc.next();
						cnt++;

						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						if (choice.equals("1")) {
							// 범인과의 대화
							music.playPushing();
							System.out.println(nick + " : " + "서하라씨, 질문 몇개 해도 되겠습니까?(불만이 많아보이는 군)");
							System.out.println("하라 : (짜증나는 표정) 혹시 PBK때문에 오셨나요?");
							time.timeDelay(700);
//							 범인과의 대화
//							 boolean true false 반환
//							 true(증거가 있을 때)
							// 추가정보
							System.out.println(nick + " : " + "피해자와의 관계는 어떻습니까?");
							System.out.println("하라 : 저는 PBK와 대학동창이에요. 솔직히 사이는 안좋았어요.\n");
							time.timeDelay(700);
							System.out.println(nick + " : " + "네, 들었습니다. 9시 반부터 10시까지 무엇을 하셨죠?");
							System.out.println("하라 : 아홉시 경부터 저는 계속 친구랑 통화중이었어요. 친구한테 물어보세요.\n");

							if (dao.checkClue(18, id) == 18) {

							} else {
								dao.getClue(18, id);
							}

							if (dao.checkClue(7, id) == 7 || dao.checkClue(13, id) == 13) {
								// 증거나 증언이 있을때 추가로 얻을 수 있는 심적증거
								System.out.println("저한테 질문할 시간에 차라리 김지은 선생님을 조사해보는게 어때요?");
								time.timeDelay(700);
								System.out.println(nick + " : " + "김지은 선생님? 그분은 왜 의심하시는 거죠?");
								System.out.println("하라 : 아까 말한 시간에 계속 PBK를 엄청 찾던데요. 평소에도 졸졸 쫓아다녀요."
										+ "\n\t제가 얼마전에 봤어요. 사실 PBK한테 스토커가 있었는데 분명히 그여자에요. 평소에도 집착이 심하다구요.\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "장현도씨와 마주치셨죠?");
								System.out.println("하라 : 네. 그 사람도 옥상 자주가요, 담배피러 자주가는 것 같던데...\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "옥상에는 안 가신건가요? 통화할때?");
								System.out.println("하라 : 절대 안가요. 거기가면 담배피는 사람들만 있어서.\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "혹시 하라 선생님은 흡연을 하시나요?");
								System.out.println("하라 : 아니요 전 담배 냄새도 싫어서 담배 근처도 안 가는 사람이에요."
										+ "학생들이랑 같은 공간에 있어야 하는데 안 좋은 냄새를 풍기면 안돼죠.");
								System.out.println("하라 : 아! 아까 장현도씨 물어보셔서 말씀드리는데, 그분 PBK랑 엄청 친해요. 아마 여기 일도...\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "혹시 얼마나 친한지 아시나요?");
								System.out.println("하라 : 그건 저도 모르죠 현도씨한테 물어보시죠?");

								if (dao.checkClue(14, id) == 14) {

								} else {
									dao.getClue(14, id);
								}
							}

						} else if (choice.equals("2")) {
							// 증거찾기
							System.out.println("\n증거를 찾을 장소를 선택하세요");
							System.out.println("[1] 강의실 컴퓨터 [2] 강의실 책상 밑  [3] 학생들 책상 위  ");
							System.out.print("입력 >> ");
							choice = sc.next();
							System.out.println();
							cnt++;
							if (choice.equals("1")) {
								// 강의실 컴퓨터
								music.playButten();
								System.out.println("강의실 컴퓨터에 접속해본다.");
								System.out.println("오늘자 강의 녹화파일이 있다.");

							} else if (choice.equals("2")) {
								// 강의실 책상 밑
								music.playGrope();
								System.out.println("강의실 책상 밑을 살펴본다.");
								cnt++;
								if (quiz.quizLec()) {
									System.out.println("증거를 획득!!");
									image.imageCiga();
									if (dao.checkClue(7, id) == 7) {

									} else {
										dao.getClue(7, id);
									}
								} else {
									System.out.println("증거 획득 실패!!");
								}

							} else if (choice.equals("3")) {
								// 학생들 책상 위
								System.out.println("학생들 책상 위를 살펴본다.");
								System.out.println("학생용 교재들이 쌓여있다.");

							} else {
								System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
							}

						} else if (choice.equals("3")) {
							System.out.println("복도로 나갑니다.\n\n");
							music.playWalk();
							break;

						} else {
							System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
						}

					}
				} else if (choice.equals("5")) {

					while (true) {
						// 교무실
						System.out.println("\n교무실에 김지은 선생님이 있습니다.");
						System.out.println("무엇을 하시겠습니까?");
						System.out.println("[1] 용의자 추궁하기 [2] 증거 찾기 [3] 되돌아가기");
						System.out.print("입력 >> ");
						cnt++;
						choice = sc.next();

						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						if (choice.equals("1")) {
							// 범인과의 대화
							music.playPushing();
							System.out.println(nick + " : " + "김지은씨, 질문 몇개 해도 되겠습니까?(화장이 진하네..)");
							System.out.println("지은 : (눈물을 흘리며..) 형사님 범인을 꼭 잡아주세요...너무 슬퍼요...흑흑\n");
							time.timeDelay(700);
//							 범인과의 대화
//							 boolean true false 반환
//							 true(증거가 있을 때)
							// 추가정보
							System.out.println(nick + " : " + "피해자와의 관계는 어떻습니까?");
							System.out.println("지은 : 저는 PBK 샘 너무 존경해요. 솔직하게 제가 정말 많이 좋아했어요....\n");
							time.timeDelay(700);
							System.out.println(nick + " : " + "9시 반부터 10시까지 무엇을 하셨죠?");
							System.out.println("지은 : 저 사실... 9시 20분에 PBK 선생님을 만나서... 선물을 줬어요! 그 때 까지는 살아계셨다구요!");
							System.out.println("저는... 상민학생이 의심가요.. 사실 PBK 때문에 너무 고생을 많이 했거든요..\n");//
							time.timeDelay(700);
							System.out.println(nick + " : " + "흠.. 그렇다면 피해자의 살아있는 마지막 순간의 목격자시군요.");
							System.out.println("지은 : 그렇게 말씀하시니 좀 위로가 되네요.. 제가 선생님의 마지막 순간을 보다니.. 조금 기뻐요..\n");
							time.timeDelay(700);
							System.out.println(nick + " : " + "(뭐지..싸이코인가?)... 흠 그리고 어딜 가셨죠? 그 이후에");
							System.out.println("지은 : 저 바로 교무실에 돌아와 계속 작업했어요. 제 컴퓨터 내역을 보셔도 좋아요!\n");

							if (dao.checkClue(19, id) == 19) {

							} else {
								dao.getClue(19, id);
							}

							if (dao.checkClue(3, id) == 3 || dao.checkClue(9, id) == 9 || dao.checkClue(14, id) == 14) {
								// 증거나 증언이 있을때 추가로 얻을 수 있는 심적증거
								System.out.println("지은 : 형사님 그런데 교무실에 왔을때 옥상 열쇠가 없어져 있었어요.\n");//
								time.timeDelay(700);
								System.out.println(nick + " : " + "옥상 열쇠는 지은씨가 관리하시는 건가요?");
								System.out.println(
										"지은 : 제가 관리하는건 아니고 당직 선생님 매일 관리 한답니다. 항상 옥상 열쇠는 보관함에 있었는데 보니깐 없었어요.\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "혹시 립스틱 컬러는 어떤 색을 사용 하시나요?");
								System.out.println("지은 : 주로 색상은 빨간색이요. 제가 빨간색이 잘 어울리거든요.\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "혹시 피해자 존경하는 마음 이상의 마음을 가지고 있나요?");
								System.out.println("지은 : 저의 순수한 사랑을 ... 이렇게 좀... 그렇네요...\n");

								if (dao.checkClue(10, id) == 10) {

								} else {
									dao.getClue(10, id);
								}
							}

						} else if (choice.equals("2")) {
							// 증거찾기
							System.out.println("\n증거를 찾을 장소를 선택하세요");
							System.out.println("[1]선생님들 책상  [2]열쇠함  [3]선생님 캐비넷 ");
							System.out.print("입력 >> ");
							choice = sc.next();
							cnt++;
							if (choice.equals("1")) {
								// 선생님들 책상
								music.playGrope();
								System.out.println("선생님들 책상을 살펴본다.");
								System.out.println("김지은 선생님 외에는 모두 퇴근한 것으로 보인다.");
								// QuizTeach2 머그잔
								cnt++;
								if (quiz.quizTeach1() == true) {
									image.imageMug();
									System.out.println("증거를 획득!!");
									if (dao.checkClue(9, id) == 9) {

									} else {
										dao.getClue(9, id);
									}
								} else {
									System.out.println("증거 획득 실패!!");
								}

							} else if (choice.equals("2")) {
								// 열쇠함
								cnt++;
								music.playCabinetOpen();
								System.out.println("열쇠함을 열어본다.");
								System.out.println("비어있는 곳이 있다.");
								// QuizTeach 없어진 열쇠
								if (quiz.quizTeach2()) {
									image.imageKey();
									System.out.println("증거를 획득!!");
									System.out.println("열쇠함의 옥상열쇠가 사라져 있다. 범인이 옥상열쇠를 가져갔을 것이다. \n"
											+ "옥상 열쇠는 보통...누가 관리하는 것일까? 범인이 아직 가지고 있을까?");
									if (dao.checkClue(3, id) == 3) {

									} else {
										dao.getClue(3, id);
									}
								} else {
									System.out.println("증거 획득 실패!!");
								}

							} else if (choice.equals("3")) {
								// 선생님 캐비넷
								music.playCabinetOpen();
								System.out.println("선생님들 캐비넷을 살펴본다.");
								System.out.println("전부 잠겨있다.");
							} else {
								System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
							}

						} else if (choice.equals("3")) {
							System.out.println("복도로 나갑니다.\n\n");
							music.playWalk();
							break;
						} else {
							System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
						}

					}
				}
			} else if (choice.equals("2")) {

				// 범인 지목
				music.playCatch();
				System.out.println("\n\n범인을 지목하시겠습니까? 기회는 한 번 뿐!!");
				System.out.println("[실패시 지금까지의 모든 정보가 초기화됩니다] ");
				System.out.print("진짜로 선택하시겠습니까? \n [1]예 [2]아니오 >> ");
				choice = sc.next();
				System.out.println();
				System.out.println();

				if (choice.equals("1")) {
					System.out.println("\n범인을 선택하세요");
					System.out.println("[1] 박상민 [2] 박나영 [3] 장현도 [4] 서하라 [5] 김지은");
					System.out.print("입력 >> ");
					int criminal = sc.nextInt();

					if (criminal == 3) {
						if (music.isPlaying() == true) {
							music.stopMusic();
						}
						music.goodEnding();
						System.out.println("범인 검거 성공!!");
						System.out.println("범인은 PBK의 친한 친구 경비원 장현도 입니다.\n");
						time.timeDelay(1000);
						System.out.println(
								"장현도는 PBK의 도움으로 경비원으로 취직했지만 거액의 빚으로 인해 " + "생활고에 시달리던 중, 결국 친구 PBK에게 거액의 돈을 빌린다.");
						time.timeDelay(1000);
						System.out.println("처음에는 PBK의 도움으로 매우 고마워 했으나, 점점 빌려준 돈과 "
								+ " 경제적인 상황의 차이로 자신을 하인 취급하고 무2시하는 PBK의 태도에 큰 분노를 느끼게 된다.");
						time.timeDelay(1000);
						System.out.println("그러던 어느날 PBK가 빌려준 돈을 갚으라고 강하게 요구하고 이에 "
								+ "장현도는 아직 갚을 돈 없다고 사정을 빌자 PBK는 거친욕설로 그를 맹비난한다.");
						time.timeDelay(1000);
						System.out.println("순간적인 분노로 인해 장현도는 그를 옥상 난간에 밀쳐 기절 시킨 뒤"
								+ "주머니속에서 비품실에서 꺼내 경비실에 두려던 커터칼을 꺼내 그의 경독맥을 절단하여 " + "사망에 이르게 한다.");
						time.timeDelay(1000);
						System.out.println("당황한 그는 커터칼을 휴게실 휴지통에 은폐하여 건물 청소시간에 버려지도록 하고 "
								+ "최대한 많은 사람이 용의자가 올라오도록 옥상이 잠기지 않도록 열쇠를 은폐한다.");
						dao.saveRanking(id, nick, cnt);
						time.timeDelay(5000);

						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						break;

					} else if (criminal == 1 || criminal == 2 || criminal == 4 || criminal == 5) {
						if (music.isPlaying() == true) {
							music.stopMusic();
						}
						
						music.badEnding();
						System.out.println("범인 검거에 실패하였습니다...\n [지금까지 저장된 모든 기록은 삭제되었습니다]");
						dao.deleteClue(id);
						dao.deleteCount(id);
						break;
					} else {
						System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
					}

				} else if (choice.equals("2")) {

					if (music.isPlaying() == true) {
						music.stopMusic();
					}

				} else {
					System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
				}

				///
			} else if (choice.equals("3")) {
				dao.showClue(id);
				System.out.println("\n=============================================\n");

			} else if (choice.equals("4")) {
				dao.save(cnt, id);
				System.out.println("저장되었습니다.");

			} else if (choice.equals("5")) {
				// 종료
				if (music.isPlaying() == true) {
					music.stopMusic();
				}

				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 번호를 입력하였습니다. 다시 선택해주세요");
			}

		}

	}

}