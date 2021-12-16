package murderCase_of_SMHRD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 아스키 아트로 스인재 살인사건 제목과 BGM(스산하고 어두운)'
		MurderDAO dao = new MurderDAO();
		Delay time = new Delay();
		Scanner sc = new Scanner(System.in);
		Quiz quiz = new Quiz();
		Image image = new Image();
		int cnt = 0;
		

		// 여기부터 비바람 효과음 반복해서 회원가입 전까지??
		System.out.println("무슨일이 생길 것 처럼 미스테리한 냄새가 나는 밤...");
		time.timeDelay(2);
		System.out.println("광주 동부 경찰서에 살인사건에 대한 제보가 들어왔다!");
		time.timeDelay(1);
		System.out.println("당신은 살인 사건의 범인을 밝혀낼 담당 형사!");
		time.timeDelay(1);
		System.out.println("이때 경찰 동료가 당신의 이름을 부른다!!\n");
		time.timeDelay(2);

		int choice = 0;
		int temp = 0;
		String temp2 = "";
		String id = "";
		String pw = "";
		String nick = "";

		while (true) {
			System.out.println("오늘 멋지게 용의자를 밝혀낼 당신의 이름은??");
			System.out.println("[1] 회원가입 [2] 로그인");
			System.out.print("입력 >> ");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("회원 가입! 새로운 형사님 환영합니다!!");
				while (true) {
					System.out.print("당신의 아이디를 입력하세요 >> ");
					id = sc.next();
					if (dao.checkId(id).equals(id)) {
						System.out.println("중복된 아이디 입니다. 다른 아이디를 입력해주세요");
					} else {
						break;
					}
				}

				System.out.print("비밀번호를 입력하세요 >> ");
				pw = sc.next();
				System.out.print("당신의 이름을 입력하세요 >> ");
				nick = sc.next();

				temp = dao.join(id, pw, nick);
				if (temp > 0) {
					System.out.println("회원가입 성공!");
					break;
				} else {
					System.out.println("회원가입 실패!");
				}

			} else if (choice == 2) {
				System.out.println("형사님 환영합니다! 로그인을 해주세요!");
				System.out.print("아이디를 입력하세요 >> ");
				id = sc.next();
				System.out.print("비밀번호를 입력하세요 >> ");
				pw = sc.next();

				temp2 = dao.login(id, pw);
				System.out.println(temp2 + " 형사님 반갑습니다!\n");
				break;
			}
		}

		while (true) {
			System.out.println("[1]새로하기 [2]불러오기 [3]랭킹보기");
			System.out.print("입력 >> ");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("\n\n새로운 게임을 시작합니다.\n");
				dao.deleteClue(id);
				dao.deleteCount(id);
				dao.getClue(1, id);
				dao.getClue(2, id);
				break;
			} else if (choice == 2) {
				if (dao.showCount(id) == 0) {
					System.out.println("저장된 정보가 없습니다. '[1]새로하기'를 선택하세요. \n");
				} else {
					System.out.println("이전 게임을 이어서 진행합니다.\n");

					break;
				}

			} else if (choice == 3) {
				System.out.println("랭킹을 확인합니다");
				dao.ranking();

			}

		}
		// opening
		System.out.println("비가 추적추적 내리는 어느날 밤...");
		time.timeDelay(1);
		System.out.println("상민은 지친 몸을 이끌고 옥상으로 올라갔다..");

		System.out.println("두둥!!!!!!!"); // BGM + 시체 아스키아트
		
		image.imageIntro();
		
		time.timeDelay(1);
		
		System.out.println("스인재 학원의 스타 강사이자 촉망받던 인재였던 PBK");
		System.out.println("그는 싸늘한 주검으로 발견되었다!");
		time.timeDelay(1);
		System.out.println("당황한 상민은 피우려던 담배를 떨어뜨리고 시체 가까이 다가가는데...\n");

		while (true) {
			System.out.println("사체를 확인하시겠습니까?");
			System.out.println("[1] 다잉메세지 [2] 혈흔과 상처 [3] 선물상자 [4] 옷에 묻은 립스틱 [5] 다이아 반지 [6] 넘어가기\n"
					+ "[기본 정보는 간략히 증거보기를 통해 확인할 수 있습니다]");
			System.out.print("입력 >> ");
			choice = sc.nextInt();
			System.out.println("\n");
			if (choice == 1) {
				System.out.println("상민은 시체 가까이 다가간다. PBK의 축 늘어진 손 끝에 어떤 메세지가 있다");
				image.imageDie();
				System.out.println("죽기전에 범인에 대한 정보를 적으려다 만것 같다...\n");
				time.timeDelay(1);
				// 다잉메세지는 보여주기만 하고 테이블 저장 X
			} else if (choice == 2) {
				System.out.println("피해자는 엎드린 채 죽어있다. 뒤통수를 살펴보니 큰 혹이 솟아있다. " + "누군가 뒤에서 그를 가격한 것일까?");
				System.out.println("그러나 그의 목 주변의 상처와 혈흔들 옷에 물든 핏자국을 보니 실제로는 " + "과다출혈이 원인일지도 모른다.\n");
				// 초기증거 혈흔과 목의 상처
			} else if (choice == 3) {
				System.out.println(
						"피해자 시체 근처에 찌그러진 보랏빛 선물 상자가 널부러져 있다. 상민은 " + "겁에 질린채 열린 상자 안을 슬쩍 들여다 보니 반짝이는 새 시계가 보인다.");
				image.imageWatch();
				time.timeDelay(1);
				System.out.println("얼핏 보니 남자용 손목시계인 듯 싶다.\n");
				// 초기 증거 선물상자 속 새 시계
			} else if (choice == 4) {
				System.out.println("혈흔과 헷갈리지만 묘하게 다른 빛의 자국이 피해자의 등판에 묻어있다. 입술 모양의 " + "자국... 이것은 무엇일까?\n");
				image.imagelip();
				time.timeDelay(1);
				// 초기 증거 립스틱 자국
			} else if (choice == 5) {
				System.out.println("피해자는 죽기전 어떤 여자와 마주친 것일까? 그의 바지춤 근처에 또 다른 물건이 보인다. "
						+ " 어둠속에서도 그 빛을 잃지 않은 꽤나 고가로 보이는 다이아반지를 발견한다. 상민은 흠칫 놀란다.\n");
				image.imageRing();
				time.timeDelay(1);
				// 초기 증거 다이아 반지
			} else if (choice == 6) {
				System.out.println("바로 게임을 실행합니다.\n");
				break; // skip
			}
		}
		System.out.println("상민은 놀란 가슴을 추스린채 옥상에서 빠져나와 계단에서 경찰서에 신고한다.\n");
		System.out.println(
				"당신은 용의자가 있는 장소를 선택하여 용의자를 추궁할 수 있습니다. \n" + "추궁을 통해 심적증거를 발견하거나 또 장소를 탐색하여 물적증거를 발견할 수 있습니다.\n");

		time.timeDelay(1);
		dao.showOpening();
		dao.showClue(id);
		System.out.println();
		System.out.println("===========================================");
		dao.showCount(id);
		System.out.println();

		while (true) {
			System.out.println("당신은 복도에 도착했습니다.");
			System.out.println("[1] 탐색 [2] 범인지목 [3] 증거보기 [4] 저장 [5] 종료 ");
			System.out.print("입력 >> ");
			choice = sc.nextInt();
			cnt++;

			if (choice == 1) {
				// 탐색
				System.out.println("탐색할 장소를 선택하세요.");
				System.out.println("[1] 휴게실 [2] 원장실 [3] 경비실 [4] 강의실 [5] 교무실");
				System.out.print("탐색할 장소 입력 >> ");
				choice = sc.nextInt();
				System.out.println("\n\n");
				if (choice == 1) {
					System.out.println(choice);
					// 휴게실
					while (true) {
						System.out.println("휴게실에 박상민 학생이 있습니다.");
						System.out.println("무엇을 하시겠습니까?");
						System.out.println("[1] 용의자 추궁하기 [2] 증거 찾기 [3] 되돌아가기");
						System.out.print("입력 >> ");
						choice = sc.nextInt();
						cnt++;
						if (choice == 1) {
							// 범인과의 대화 - 기본정보
							System.out.println(nick + " : 상민 학생에게 질문을 한다.");
							System.out.println(nick + " : " + "당신이 PBK 사체 최초발견자 입니까?");
							System.out.println("상민 :네... 10시 40분 넘어서 옥상에 갔더니 PBK선생님을...봤습니다....");
//									 범인과의 대화
//									 boolean true false 반환
//									 true(증거가 있을 때)
							// 추가정보
							System.out.println(nick + " : " + "옥상에는 왜 올라가셨나요?");
							System.out.println("상민 : PBK선생님 발표 자료를 준비하다가 바람좀 쐴겸 올라갔는데...\n");
							System.out.println(nick + " : " + "평소 피해자와의 관계가 어떻습니까?");
							System.out.println("상민 : 네? 지금 저를 의심하시나요? 저는 선생님을 도와 많은 프로젝트 진행을 했습니다..");
							System.out.println("저에게 좋은 취업자리를 주시기로 약속해서 제가 무급으로 일하고 있는데 선생님을 죽이면");
							System.out.println("제게 무슨 이득이 있을까요? 저는 그저 열심히 일해서 좋은 직장에 취직하고 싶을뿐... 평소");
							System.out.println("작업과 과제가 많아 힘들긴 했지만.. 선생님은 저에게 꼭 필요한 분입니다!! 저는 결백해요!\n");
							System.out.println(nick + " : " + "9시 30분부터 10시까지 어디에서 무엇을 했습니까?");
							System.out.println("상민 : 8시 40분 부터 시체 발견 전까지 저는 여기서 혼자 작업중이었습니다.. \n");
							System.out.println(nick + " : " + "(혼자서 작업했다... 증인은 따로 없군.)");
							System.out.println("상민 : 평소에 박나영원장님이랑 PBK선생님이 논쟁하는 것을 봤습니다... 한번 사람들에게 물어보세요 형사님.. ");
							System.out.println(nick + " : " + "(박나영 원장과도 이야기를 해야겠군..)");

						} else if (choice == 2) {
							System.out.println(choice);
							// 증거찾기
							System.out.println("증거를 찾을 장소를 선택하세요");
							System.out.println("[1]정수기 뒤편 [2]쓰레기통 [3]휴식용 텐트 ");
							System.out.print("입력 >> ");
							choice = sc.nextInt();
							cnt++;
							if (choice == 1) {
								// 정수기
								System.out.println("정수기 뒤편을 살펴본다.");
								System.out.println("아무것도 없다.");

							} else if (choice == 2) {
								// 쓰레기통-증거
								System.out.println("휴게실 쓰레기통을 살펴본다.");
								cnt++;
								if (quiz.quizCafe()) {
									cnt++;

									if (dao.checkClue(4, id) == 4) {
										System.out.println("증거를 이미 획득했습니다.");
									} else {
										dao.getClue(4, id);
										System.out.println("증거를 획득!!");
									}

								} else {
									System.out.println("증거 획득 실패!!");
								}

							} else if (choice == 3) {
								// 휴식용 텐트
								System.out.println("텐트를 살펴보았다.");
								System.out.println("침구와 책 몇개가 보인다.");
								//
							}
						} else if (choice == 3) {
							System.out.println("복도로 나갑니다.\n\n");
							break;
						}
					}
				} else if (choice == 2) {

					while (true) {
						// 원장실
						System.out.println("원장실에 박나영 원장이 있습니다.");
						System.out.println("무엇을 하시겠습니까?");
						System.out.println("[1] 용의자 추궁하기 [2] 증거 찾기 [3] 되돌아가기");
						System.out.print("입력 >> ");
						choice = sc.nextInt();
						cnt++;
						if (choice == 1) {

							System.out.println(nick + " : 박나영 원장에게 질문을 한다.");
							System.out.println(nick + " : 원장님, 질문 몇개 해도 되겠습니까?(오... 온갖 명품에.. 매우 화려한 스타일이군..");
							System.out.println("나영 : (앙칼지게) 지금 저를 의심하시는건가요? 좋아요. 뭐든지 물어보세요.");
//							 범인과의 대화
//							 boolean true false 반환
//							 true(증거가 있을 때)
							// 추가정보
							System.out.println(nick + " : 피해자는 어떤 사람입니까?");
							System.out.println("나영 : 좀 건방지긴 하지만 일은 잘했어요. 그래서 승진도 빨랐구요.\n");
							System.out.println(nick + " : 평소 피해자와의 관계가 어떻습니까?");
							System.out.println("나영 : 솔직하게 말하면 좀 재수가 없었죠. 직원 주제에 원장에게 협박이나하고.");
							System.out.println("하지만 그런일로 사람을 죽이진 않아요. 저는 가진게 많은 사람이라 굳이 그럴필요도 없고요. 해고하면 되니까요.");
							System.out.println(nick + " : 9시 30분부터 10시까지 어디에서 무엇을 했습니까?");
							System.out.println("나영 : 저는 계속 원장실에 있었어요. 중요한 프로젝트가 곧 있어서 시청공무원과 원장실에서 회의중이었어요.");
							System.out.println(nick + " : (알리바이가 있군...하지만 다른 트릭이 있을수도 있어!)");
							System.out.println("나영 : 저는 그 경비원이 의심가요. 이름은 모르겠는데, 그 사람 수상해.");
							System.out.println(nick + " : " + "경비원? 이 건물의 경비원이요?");
							System.out.println("나영 : 그 사람 PBK랑 친했어요. 근데 모르잖아? 등잔밑이 어두은거지. 사람은 몰라."
									+ "그리고 둘이 분명히 돈거래를 했어요. 경비 그사람... 빚이 꽤 많던데? 겉으로만 친하지 완전 주인과 개야. 남들은 속아도 나는 보여요.");
							System.out.println(nick + " : " + "두 사람 사이에 돈거래가 있었군...");

						} else if (choice == 2) {
							// 증거찾기
							System.out.println("증거를 찾을 장소를 선택하세요");
							System.out.println("[1] 원장실 메인 컴퓨터  [2] 커다란 책장  [3] 책상 서랍 ");
							System.out.print("입력 >> ");
							choice = sc.nextInt();
							cnt++;
							sc.nextLine();

							if (choice == 1) {
								// 원장실 컴퓨터-증거
								cnt++;
								System.out.println("원장실 메인컴퓨터에 접속합니다.");
								image.imageDesktop();
								System.out.println("비밀번호를 출력하는 코드를 작성하세요");
								System.out.println(">> (77*1)+(76*2)+(75*3)+...+(1*77)를 계산하는 코드를 작성하여 올바른 결과를 출력하시오");
								System.out.println("단, int sum = 0; 선언되어있음, sum과 for문을 사용하여 엔터없이 한줄로 출력문까지 작성하면 됩니다");
								String txt = sc.nextLine();

								int sum = 0;
								if (quiz.quizKing(txt, sum)) {
									System.out.println("증거를 획득!!");
									if (dao.checkClue(5, id) == 5) {

									} else {
										dao.getClue(5, id);
									}
								} else {
									System.out.println("증거 획득 실패!!");
								}
							} else if (choice == 2) {
								// 책장
								System.out.println("커다란 책장을 살펴본다.");
								System.out.println("책들이 엄청 많다.");

							} else if (choice == 3) {
								// 원장실 책상 서랍
								cnt++;
								System.out.println("원장 책상의 서랍을 열어본다.");
								System.out.println("서랍이 자물쇠로 잠겨있고 옆에 힌트가 적힌 종이가 있다.");
								System.out.println("비밀번호를 출력하는 코드를 작성하세요");
								System.out.println(">> 10!(팩토리얼) 값을 구하시오");
								System.out.println("단, int sum = 1; 선언되어있음, sum과 for문을 사용하여 엔터없이 한줄로 출력문까지 작성하면 됩니다.");
								String txt = sc.nextLine();

								int sum = 1;

								if (quiz.quizKing(txt, sum)) {
									System.out.println("증거를 획득!!");
									if (dao.checkClue(8, id) == 8) {
										continue;
									} else {
										dao.getClue(8, id);
									}
								} else {
									System.out.println("증거 획득 실패!!");
								}
							}
						} else if (choice == 3) {
							System.out.println("복도로 나갑니다.\n\n");
							break;
						}

					}
				} else if (choice == 3) {
					System.out.println(choice);

					while (true) {
						// 경비실
						System.out.println("경비실에 장현도 경비가 있습니다.");
						System.out.println("무엇을 하시겠습니까?");
						System.out.println("[1] 용의자 추궁하기 [2] 증거 찾기 [3] 되돌아가기");
						System.out.print("입력 >> ");
						choice = sc.nextInt();
						cnt++;
						if (choice == 1) {
							// 범인과의 대화 - 기본정보
							System.out.println(nick + " : 장현도 경비에게 질문을 한다.");
							System.out.println(nick + " : " + "장현도씨, 질문 몇개 해도 되겠습니까?(덩치가 크고... 생각보다 젊고 깔끔하군.)");
							System.out.println("현도 : (피곤한 표정) 무슨일이십니까..? 저도 힘들어요.. 제친구가 죽었다고요.");
//						 범인과의 대화
//						 boolean true false 반환
//						 true(증거가 있을 때)
							// 추가정보
							System.out.println(nick + " : " + "피해자와의 관계는 어떻습니까?");
							System.out.println("현도 : 저는 PBK와 초등학부터 친구입니다. 저는 절대 범인이 아니에요.");
							System.out.println(nick + " : " + "그렇군요, 9시 반부터 10시까지 무엇을 하셨죠?");
							System.out.println("현도 : 저는 건물 전체를 순찰중이었습니다. 1층부터 4층까지... 강의실에서는 서하라 선생님을 만났고, 교무실에는 김지은 선생님이 있었습니다.");
							System.out.println("저는 서하라 선생님이 의심됩니다. 그분 유명한 PBK의 라이벌이에요.");
							System.out.println(nick + " : " + "서하라 선생님과 PBK 사이가 좋지 않나요?");
							System.out.println("현도 : 네, 최근에도 둘 다 승진하려고 애썼는데, PBK만 된걸로 알고 있습니다. ");
							System.out.println(nick + " : " + "(일단 차분해 보이는 군... 하지만 다른 무언가는 없을까?)");
							System.out.println("현도 : 저는 PBK의 도움을 많이 받았습니다. 절대 범인이 아닙니다.");
							System.out.println(nick + " : " + "혹시 옥상 문은 항상 잠겨있습니까? 열쇠 관리도 하시나요?");
							System.out.println("현도 : 필요할 때는 하지만.. 보관은 교무실에서 합니다.");
							System.out.println(nick + " : " + "PBK와 금전적인 거래가 있었나요?");
							System.out.println("현도 : ..... 제가 상황이 어려워 그 친구가 저를 도와준 것 뿐입니다. 전 고마워했구요.");
						} else if (choice == 2) {
							// 증거찾기
							System.out.println("증거를 찾을 장소를 선택하세요");
							System.out.println("[1]경비실 모니터 [2]경비실 책상 서랍 [3]장현도의 가방 ");
							System.out.print("입력 >> ");
							choice = sc.nextInt();

							if (choice == 1) {
								// 경비실 모니터
								System.out.println("경비실 모니터를 살펴본다.");
								System.out.println("휴게실, 교뮤실, 강의실, 원장실에 한명씩 사람이 있다.");

							} else if (choice == 2) {
								// 경비실 책상 서랍
								System.out.println("경비실 책상 서랍을 열어본다.");
								System.out.println("영수증 쪼가리가 들어있다.");

							} else if (choice == 3) {
								// 장현도의 가방
								cnt++;
								System.out.println("장현도의 가방이 열려있다.");
								System.out.println("중요해보이는 서류가 보인다.");

								if (quiz.quizSecu()) {
									System.out.println("증거를 획득!!");
									if (dao.checkClue(6, id) == 6) {

									} else {
										dao.getClue(6, id);
									}
								} else {
									System.out.println("증거 획득 실패!!");
								}
							}

						} else if (choice == 3) {
							System.out.println("복도로 나갑니다.\n\n");
							break;

						}

					}
				} else if (choice == 4) {

					System.out.println(choice);
					while (true) {
						// 강의실
						System.out.println("강의실에 서하라 선생님이 있습니다.");
						System.out.println("무엇을 하시겠습니까?");
						System.out.println("[1] 용의자 추궁하기 [2] 증거 찾기 [3] 되돌아가기");
						System.out.print("입력 >> ");
						choice = sc.nextInt();
						cnt++;
						if (choice == 1) {
							// 범인과의 대화
							System.out.println(nick + "서하라 선생님에게 질문을 한다.");
							System.out.println(nick + " : " + "서하라씨, 질문 몇개 해도 되겠습니까?(불만이 많아보이는 군)");
							System.out.println("하라 : (짜증나는 표정) 혹시 PBK때문에 오셨나요?");
//							 범인과의 대화
//							 boolean true false 반환
//							 true(증거가 있을 때)
							// 추가정보
							System.out.println(nick + " : " + "피해자와의 관계는 어떻습니까?");
							System.out.println("하라 : 저는 PBK와 대학동창이에요. 솔직히 사이는 안좋았어요.");
							System.out.println(nick + " : " + "네, 들었습니다. 9시 반부터 10시까지 무엇을 하셨죠?");
							System.out.println("하라 : 아홉시 경부터 저는 계속 친구랑 통화중이었어요. 친구한테 물어보세요.");
							System.out.println("저한테 질문할 시간에 차라리 김지은 선생님을 조사해보는게 어때요?");
							System.out.println(nick + " : " + "김지은 선생님? 그분은 왜 의심하시는 거죠?");
							System.out.println("하라 : 아까 말한 시간에 계속 PBK를 엄청 찾던데요. 평소에도 졸졸 쫓아다녀요."
									+ "제가 얼마전에 봤어요. 사실 PBK한테 스토커가 있었는데 분명히 그여자에요. 평소에도 집착이 심하다구요.");
							System.out.println(nick + " : " + "장현도씨와 마주치셨죠?");
							System.out.println("하라 : 네. 그 사람도 옥상 자주가요, 담배피러 자주가는 것 같던데. 근데 그사람은 친해요. PBK랑..");
							System.out.println(nick + " : " + "옥상에는 안가신건가요? 통화할때?");
							System.out.println("하라 : 절대 안가요. 거기가면 담배피는 사람들만 있어서.");
						} else if (choice == 2) {
							// 증거찾기
							System.out.println("증거를 찾을 장소를 선택하세요");
							System.out.println("[1] 강의실 컴퓨터 [2] 강의실 책상 밑  [3] 학생들 책상 위  ");
							System.out.print("입력 >> ");
							choice = sc.nextInt();
							cnt++;
							if (choice == 1) {
								// 강의실 컴퓨터
								System.out.println("강의실 컴퓨터에 접속해본다.");
								System.out.println("오늘자 강의 녹화파일이 있다.");

							} else if (choice == 2) {
								// 강의실 책상 밑
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

							} else if (choice == 3) {
								// 학생들 책상 위
								System.out.println("학생들 책상 위를 살펴본다.");
								System.out.println("학생용 교재들이 쌓여있다.");

							}
						} else if (choice == 3) {
							System.out.println("복도로 나갑니다.\n\n");
							break;

						}
					}
				} else if (choice == 5) {
					System.out.println(choice);
					while (true) {
						// 교무실
						System.out.println("교무실에 김지은 선생님이 있습니다.");
						System.out.println("무엇을 하시겠습니까?");
						System.out.println("[1] 용의자 추궁하기 [2] 증거 찾기 [3] 되돌아가기");
						System.out.print("입력 >> ");
						cnt++;
						choice = sc.nextInt();
						if (choice == 1) {
							// 범인과의 대화
							System.out.println(nick + " : 김지은 선생님에게 질문을 한다.");
							System.out.println(nick + " : " + "김지은씨, 질문 몇개 해도 되겠습니까?(화장이 진하네..)");
							System.out.println("지은 : (눈물을 흘리며..) 형사님 범인을 꼭 잡아주세요...너무 슬퍼요...흑흑");
//							 범인과의 대화
//							 boolean true false 반환
//							 true(증거가 있을 때)
							// 추가정보
							System.out.println(nick + " : " + "피해자와의 관계는 어떻습니까?");
							System.out.println("지은 : 저는 PBK 샘 너무 존경해요. 솔직하게 제가 정말 많이 좋아했어요....");
							System.out.println(nick + " : " + "9시 반부터 10시까지 무엇을 하셨죠?");
							System.out.println("지은 : 저 사실... 9시 20분에 PBK 선생님을 만나서... 선물을 줬어요! 그 때 까지는 살아계셨다구요!");
							System.out.println("저는... 상민학생이 의심가요.. 사실 PBK 때문에 너무 고생을 많이 했거든요..");//
							System.out.println(nick + " : " + "흠.. 그렇다면 피해자의 살아있는 마지막 순간의 목격자시군요.");
							System.out.println("지은 : 그렇게 말씀하시니 좀 위로가 되네요.. 제가 선생님의 마지막 순간을 보다니.. 조금 기뻐요..");
							System.out.println(nick + " : " + "(뭐지..싸이코인가?)... 흠 그리고 어딜 가셨죠? 그 이후에");
							System.out.println("지은 : 저 바로 교무실에 돌아와 계속 작업했어요. 제 컴퓨터 내역을 보셔도 좋아요!");
							System.out.println(nick + " : " + "(이 사람도.. 조금 의심이 되는군) 현도씨와 만나셨나요?");
							System.out.println("지은 : 네. 작업중에 잠깐 교무실에 들어오더군요. 보통은 사람있으면 들어오지는 않는데...");
						} else if (choice == 2) {
							// 증거찾기
							System.out.println("증거를 찾을 장소를 선택하세요");
							System.out.println("[1]선생님들 책상  [2]열쇠함  [3]선생님 캐비넷 ");
							System.out.print("입력 >> ");
							choice = sc.nextInt();
							cnt++;
							if (choice == 1) {
								// 선생님들 책상
								System.out.println("선생님들 책상을 살펴본다.");
								System.out.println("김지은 선생님 외에는 모두 퇴근한 것으로 보인다.");
								// QuizTeach2 머그잔
								cnt++;
								if (quiz.quizTeach1()) {
									System.out.println("증거를 획득!!");
									image.imageMug();
									if (dao.checkClue(9, id) == 9) {

									} else {
										dao.getClue(9, id);
									}
								} else {
									System.out.println("증거 획득 실패!!");
								}

							} else if (choice == 2) {
								// 열쇠함
								cnt++;
								System.out.println("열쇠함을 열어본다.");
								System.out.println("비어있는 곳이 있다.");
								// QuizTeach 없어진 열쇠
								if (quiz.quizTeach2()) {
									System.out.println("증거를 획득!!");
									image.imageKey();
									if (dao.checkClue(3, id) == 3) {

									} else {
										dao.getClue(3, id);
									}
								} else {
									System.out.println("증거 획득 실패!!");
								}

							} else if (choice == 3) {
								// 선생님 캐비넷
								System.out.println("선생님들 캐비넷을 살펴본다.");
								System.out.println("전부 잠겨있다.");
							}

						} else if (choice == 3) {
							System.out.println("복도로 나갑니다.\n\n");
							break;
						}
					}
				}
			} else if (choice == 2) {

				// 범인 지목
				System.out.println("\n\n범인을 지목하시겠습니까? 기회는 한 번 뿐!!");
				System.out.println("[실패시 지금까지의 모든 정보가 초기화됩니다] ");
				System.out.print("진짜로 선택하시겠습니까? \n [1]예 [2]아니오 >> ");
				choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("\n범인을 선택하세요");
					System.out.println("[1] 박상민 [2] 박나영 [3] 장현도 [4] 서하라 [5] 김지은");
					System.out.print("입력 >> ");
					int criminal = sc.nextInt();

					if (criminal == 3) {
						System.out.println("범인 검거 성공!!");
						System.out.println("범인은 PBK의 친한 친구 경비원 장현도 입니다.\n");
						System.out.println(
								"장현도는 PBK의 도움으로 경비원으로 취직했지만 거액의 빚으로 인해 " + "생활고에 시달리던 중, 결국 친구 PBK에게 거액의 돈을 빌린다.");
						System.out.println("처음에는 PBK의 도움으로 매우 고마워 했으나, 점점 빌려준 돈과 "
								+ " 경제적인 상황의 차이로 자신을 하인 취급하고 무시하는 PBK의 태도에 큰 분노를 느끼게 된다.");
						System.out.println("그러던 어느날 PBK가 빌려준 돈을 갚으라고 강하게 요구하고 이에 "
								+ "장현도는 아직 갚을 돈 없다고 사정을 빌자 PBK는 거친욕설로 그를 맹비난한다.");
						System.out.println("순간적인 분노로 인해 장현도는 그를 옥상 난간에 밀쳐 기절 시킨 뒤"
								+ "주머니속에서 비품실에서 꺼내 경비실에 두려던 커터칼을 꺼내 그의 경독맥을 절단하여 " + "사망에 이르게 한다.");
						System.out.println("당황한 그는 커터칼을 휴게실 휴지통에 은폐하여 건물 청소시간에 버려지도록 하고 "
								+ "최대한 많은 사람이 용의자가 올라오도록 옥상이 잠기지 않도록 열쇠를 은폐한다.");

						break;
					} else {
						System.out.println("범인 검거에 실패하였습니다...\n [지금까지 저장된 모든 기록은 삭제되었습니다]");
						dao.deleteClue(id);
						dao.deleteCount(id);
						break;
					}
				} else {

				}

				///
			} else if (choice == 3) {
				dao.showClue(id);

			} else if (choice == 4) {
				dao.save(cnt, id);
				System.out.println("저장되었습니다.");

			} else if (choice == 5) {
				// 종료
				System.out.println("게임을 종료합니다.");
				break;
			}
		}

	}

}
