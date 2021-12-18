package murderCase_of_SMHRD;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ƽ�Ű ��Ʈ�� ������ ���λ�� ����� BGM(�����ϰ� ��ο�)'
		MurderDAO dao = new MurderDAO();
		Delay time = new Delay();
		Scanner sc = new Scanner(System.in);
		Quiz quiz = new Quiz();
		Image image = new Image();
		MusicPlayer music = new MusicPlayer();
		int cnt = 0;

		// ������� ��ٶ� ȿ���� �ݺ��ؼ� ȸ������ ������??
		music.goodEnding();
		
		image.imageTitle();
		time.timeDelay(700);
		System.out.println("\n\n�������� ���� ��ó�� �̽��׸��� ������ ���� ��...\n");
		time.timeDelay(1200);
		System.out.println("���� ���� �������� ���λ�ǿ� ���� ������ ���Դ�!\n");
		time.timeDelay(700);
		System.out.println("����� ���� ����� ������ ������ ��� ����!\n");
		time.timeDelay(700);
		System.out.println("�̶� ���� ���ᰡ ����� �̸��� �θ���!!\n\n");
		time.timeDelay(1000);

		String choice = "";
		int temp = 0;
		String temp2 = "";
		String id = "";
		String pw = "";
		String nick = "";

		while (true) {
			System.out.println("���� ������ �����ڸ� ������ ����� �̸���??");
			System.out.println("[1] ȸ������ [2] �α���");
			System.out.print("�Է� >> ");
			choice = sc.next();

			if (choice.equals("1")) {
				System.out.println("ȸ�� ����! ���ο� ����� ȯ���մϴ�!!");
				while (true) {
					System.out.print("����� ���̵� �Է��ϼ��� >> ");
					id = sc.next();

					boolean checkPbk = id.equals("pbk") || id.equals("PBK") || id.equals("Pbk")
							|| id.equals("hodoodaddy") || id.equals("HODOODADDY") || id.equals("Hodoodaddy")
							|| id.equals("�ں���") || id.equals("������") || id.equals("ȣ�ξƺ�") || id.equals("������")
							|| id.equals("����");

					if (checkPbk) {
						System.out.println("����� �� ���� ���̵��Դϴ�.\n");
					} else if (id.equals(dao.checkId(id))) {
						System.out.println("�ߺ��� ���̵� �Դϴ�. �ٸ� ���̵� �Է����ּ���");
					} else {
						break;
					}
				}

				System.out.print("��й�ȣ�� �Է��ϼ��� >> ");
				pw = sc.next();
				while (true) {
					System.out.print("����� �г����� �Է��ϼ��� >> ");
					nick = sc.next();

					boolean checkPbk = nick.equals("pbk") || nick.equals("PBK") || nick.equals("Pbk")
							|| nick.equals("hodoodaddy") || nick.equals("HODOODADDY") || nick.equals("Hodoodaddy")
							|| nick.equals("�ں���") || nick.equals("������") || nick.equals("ȣ�ξƺ�") || nick.equals("������")
							|| id.equals("����");

					if (checkPbk) {
						System.out.println("����� �� ���� �г����Դϴ�.\n");
					} else {
						break;
					}
				}

				temp = dao.join(id, pw, nick);
				if (temp > 0) {
					System.out.println("ȸ������ ����!");
					break;
				} else {
					System.out.println("ȸ������ ����!");
				}

			} else if (choice.equals("2")) {
				System.out.println("����� ȯ���մϴ�! �α����� ���ּ���!");
				System.out.print("���̵� �Է��ϼ��� >> ");
				id = sc.next();
				System.out.print("��й�ȣ�� �Է��ϼ��� >> ");
				pw = sc.next();

				temp2 = dao.login(id, pw);
				if (temp2 != null) {
					System.out.println(temp2 + " ����� �ݰ����ϴ�!\n");
					nick = temp2;
					break;
				} else {
					System.out.println("�α��� ����!\n");
				}

			} else {
				System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
			}
		}

		while (true) {
			System.out.println("\n[1]�����ϱ� [2]�ҷ����� [3]��ŷ����");
			System.out.print("�Է� >> ");
			choice = sc.next();

			if (choice.equals("1")) {
				System.out.println("\n\n���ο� ������ �����մϴ�.\n");
				dao.deleteClue(id);
				dao.deleteCount(id);
//				dao.getClue(1, id);
//				dao.getClue(2, id);
				break;
			} else if (choice.equals("2")) {
				if (dao.showCount(id) == 0) {
					System.out.println("����� ������ �����ϴ�. '[1]�����ϱ�'�� �����ϼ���. \n");
				} else {
					System.out.println("���� ������ �̾ �����մϴ�.\n");
					cnt = dao.showCount(id);

					break;
				}

			} else if (choice.equals("3")) {
				System.out.println("��ŷ�� Ȯ���մϴ�");
				dao.ranking();

			} else {
				System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
			}

		}

		if (music.isPlaying() == true) {
			music.stopMusic();
		}

		if (choice.equals("1")) {

			// opening
			music.playScream();
			image.imageIntro();
			System.out.println("�� �������� ������ ����� ��...");
			time.timeDelay(700);
			System.out.println("����� ��ģ ���� �̲��� �������� �ö󰬴�..");

			System.out.println("�ε�!!!!!!!"); // BGM + ��ü �ƽ�Ű��Ʈ

			time.timeDelay(1200);
			music.playRain();

			System.out.println("������ �п��� ��Ÿ �������� �˸��޴� ���翴�� PBK");
			System.out.println("�״� �δ��� �ְ����� �߰ߵǾ���!");
			time.timeDelay(700);
			System.out.println("��Ȳ�� ����� �ǿ���� ��踦 ����߸��� ��ü ������ �ٰ����µ�...\n");

			while (true) {
				System.out.println("��ü�� Ȯ���Ͻðڽ��ϱ�?");
				System.out.println("[1] ���׸޼��� [2] ����� ��ó [3] �������� [4] �ʿ� ���� ����ƽ [5] ���̾� ���� [6] �Ѿ��\n"
						+ "[�⺻ ������ ������ ���ź��⸦ ���� Ȯ���� �� �ֽ��ϴ�]");
				System.out.print("�Է� >> ");
				choice = sc.next();
				System.out.println("");
				if (choice.equals("1")) {
					image.imageDie();
					System.out.println("����� ��ü ������ �ٰ�����. PBK�� �� �þ��� �� ���� � �޼����� �ִ�");
					System.out.println("�ױ����� ���ο� ���� ������ �������� ���� ����...\n");
					time.timeDelay(700);
					// ���׸޼����� �����ֱ⸸ �ϰ� ���̺� ���� X
				} else if (choice.equals("2")) {
					System.out.println("�����ڴ� ���帰 ä �׾��ִ�. ������� ���캸�� ū Ȥ�� �ھ��ִ�. " + "������ �ڿ��� �׸� ������ ���ϱ�?");
					time.timeDelay(700);
					System.out.println("�׷��� ���� �� �ֺ��� ��ó�� ����� �ʿ� ���� ���ڱ��� ���� �����δ� " + "���������� ���������� �𸥴�.\n");
					// �ʱ����� ����� ���� ��ó
				} else if (choice.equals("3")) {
					image.imageWatch();
					System.out.println(
							"������ ��ü ��ó�� ��׷��� ������ ���� ���ڰ� �κη��� �ִ�. ����� " + "�̿� ����ä ���� ���� ���� ��½ �鿩�� ���� ��¦�̴� �� �ð谡 ���δ�.");
					time.timeDelay(700);
					System.out.println("���� ���� ���ڿ� �ո�ð��� �� �ʹ�.\n");
					// �ʱ� ���� �������� �� �� �ð�
				} else if (choice.equals("4")) {
					image.imagelip();
					System.out.println("����� �򰥸����� ���ϰ� �ٸ� ���� �ڱ��� �������� ���ǿ� �����ִ�. �Լ� ����� " + "�ڱ�... �̰��� �����ϱ�?\n");
					time.timeDelay(700);
					// �ʱ� ���� ����ƽ �ڱ�
				} else if (choice.equals("5")) {
					image.imageRing();
					System.out.println("�����ڴ� �ױ��� � ���ڿ� ����ģ ���ϱ�? ���� ������ ��ó�� �� �ٸ� ������ ���δ�. "
							+ " ��Ҽӿ����� �� ���� ���� ���� �ϳ� ���� ���̴� ���̾ƹ����� �߰��Ѵ�. ����� ��ĩ �����.\n");
					time.timeDelay(700);
					// �ʱ� ���� ���̾� ����
				} else if (choice.equals("6")) {
					System.out.println("�ٷ� ������ �����մϴ�.\n");
					break; // skip
				}
			}

			System.out.println(".");
			time.timeDelay(500);
			System.out.println(".");
			time.timeDelay(500);
			System.out.println(".");
			time.timeDelay(500);
			System.out.println("����� ��� ������ �߽���ä ���󿡼� �������� ��ܿ��� �������� �Ű��Ѵ�.\n");
			System.out.println(
					"����� �����ڰ� �ִ� ��Ҹ� �����Ͽ� �����ڸ� �߱��� �� �ֽ��ϴ�. \n" + "�߱��� ���� �������Ÿ� �߰��ϰų� �� ��Ҹ� Ž���Ͽ� �������Ÿ� �߰��� �� �ֽ��ϴ�.\n\n");

		} ////////// �����ϱ� ������ if�� ���� //
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
			System.out.println("����� ������ �����߽��ϴ�.");
			System.out.println("[1] Ž�� [2] �������� [3] ���ź��� [4] ���� [5] ���� ");
			System.out.print("�Է� >> ");
			choice = sc.next();
			cnt++;
			System.out.println();

			if (choice.equals("1")) {
				// Ž��
				System.out.println("Ž���� ��Ҹ� �����ϼ���.");
				System.out.println("[1] �ްԽ� [2] ����� [3] ���� [4] ���ǽ� [5] ������");
				System.out.print("Ž���� ��� �Է� >> ");
				choice = sc.next();
				music.playWalk();
				System.out.println("\n\n");
				System.out.println();
				if (choice.equals("1")) {
					// �ްԽ�
					while (true) {
						System.out.println("\n�ްԽǿ� �ڻ�� �л��� �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						choice = sc.next();
						cnt++;
						System.out.println();
						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						if (choice.equals("1")) {
							// ���ΰ��� ��ȭ - �⺻����
							music.playPushing();
							System.out.println(nick + " : " + "����� PBK ��ü ���ʹ߰��� �Դϱ�?");
							System.out.println("��� :��... 10�� 40�� �Ѿ ���� ������ PBK��������...�ý��ϴ�....");
							time.timeDelay(700);
//									 ���ΰ��� ��ȭ
//									 boolean true false ��ȯ
//									 true(���Ű� ���� ��)

							System.out.println(nick + " : " + "���󿡴� �� �ö󰡼̳���?");
							System.out.println("��� : PBK������ ��ǥ �ڷḦ �غ��ϴٰ� �ٶ��� ���� �ö󰬴µ�...\n");
							time.timeDelay(700);
							System.out.println(nick + " : " + "��� �����ڿ��� ���谡 ����ϱ�?");
							System.out.println("��� : ��? ���� ���� �ǽ��Ͻó���? ���� �������� ���� ���� ������Ʈ�� �����߽��ϴ�..\n");
							time.timeDelay(700);
							System.out.println("������ ���� ����ڸ��� �ֽñ�� ����ؼ� ���� �������� ���ϰ� �ִµ� �������� ���̸�\n");
							time.timeDelay(700);
							System.out.println("���� ���� �̵��� �������?");
							time.timeDelay(700);
							System.out.println("�۾��� ������ ���� ����� ������.. �������� ������ �� �ʿ��� ���Դϴ�!! ���� ����ؿ�!\n");

							if (dao.checkClue(15, id) == 15) {

							} else {
								dao.getClue(15, id);
							}

							// �߰� ����
							if (dao.checkClue(4, id) == 4 || dao.checkClue(10, id) == 10) {

								System.out.println(
										nick + " : " + "��ξ� �߰��� ���� ���Ű� �ֽ��ϴ�! " + "\n ����ϴٴ� �������δ� ��ξ��� ���� ������ ���� �����! ");
								System.out.println("��� : ���� 8�� 40�� ���� ��ü �߰� ������ ���⼭ ��� �۾����̾����ϴ�! ����մϴ�!\n");
								time.timeDelay(700);
								System.out.println(nick + " : �˸����̸� �������ֽ� ���� �����ʴϱ�? ");
								System.out.println("��� : ��, �װ�... ��! �ֱٿ� �ڳ���������̶� PBK�������� ũ�� ������ ���� �ý��ϴ�! \n "
										+ "\t�ڳ��� ������� ���������� �𸨴ϴ�!");
								time.timeDelay(700);

								if (dao.checkClue(11, id) == 11) {

								} else {
									dao.getClue(11, id);
								}
							}

						} else if (choice.equals("2")) {
							// ����ã��
							System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1]������ ���� [2]�������� [3]�޽Ŀ� ��Ʈ ");
							System.out.print("�Է� >> ");
							choice = sc.next();
							cnt++;

							if (choice.equals("1")) {
								// ������
								System.out.println("������ ������ ���캻��.");
								System.out.println("�ƹ��͵� ����.\n");

							} else if (choice.equals("2")) {
								// ��������-����
								music.playGrope();
								System.out.println("�ްԽ� ���������� ���캻��.");
								cnt++;
								if (quiz.quizCafe()) {
									cnt++;

									if (dao.checkClue(4, id) == 4) {
										System.out.println("���Ÿ� �̹� ȹ���߽��ϴ�.");
									} else {
										dao.getClue(4, id);
										System.out.println("���Ÿ� ȹ��!!");
										image.imageBlade();
									}

								} else {
									System.out.println("���� ȹ�� ����!!");
								}

							} else if (choice.equals("3")) {
								// �޽Ŀ� ��Ʈ
								music.playGrope();
								System.out.println("��Ʈ�� ���캸�Ҵ�.");
								System.out.println("ħ���� å ��� ���δ�.\n");
								//
							} else {
								System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
							}

						} else if (choice.equals("3")) {
							System.out.println("������ �����ϴ�.\n\n");
							music.playWalk();
							break;
						} else {
							System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
						}

					}
				} else if (choice.equals("2")) {

					while (true) {
						// �����
						System.out.println("����ǿ� �ڳ��� ������ �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						choice = sc.next();
						cnt++;

						if (music.isPlaying() == true) {
							music.stopMusic();
						}
						if (choice.equals("1")) {

//							 ���ΰ��� ��ȭ
//							 boolean true false ��ȯ
//							 true(���Ű� ���� ��)
							// �߰�����
							music.playPushing();
							System.out.println(nick + " : �����, ���� � �ص� �ǰڽ��ϱ�?(��... �°� ��ǰ��.. �ſ� ȭ���� ��Ÿ���̱�..)");
							System.out.println("���� : (��Į����) ���� ���� �ǽ��Ͻô°ǰ���? ���ƿ�. ������ �������.\n");
							time.timeDelay(700);
							System.out.println(nick + " : ��� �����ڿ� ���� ��� ���� �ϼ̽��ϱ�?");
							System.out.println(
									"���� : �� �ǹ����� ������ ���� ���߾��. �׷��� ������ ��������. \n" + "\t��û���� �ʴٸ� ���� �׿��� �Ŷ�� �������� �ʰ���?!\n");
							time.timeDelay(700);

							if (dao.checkClue(16, id) == 16) {

							} else {
								dao.getClue(16, id);
							}

							// �߰� ����
							if (dao.checkClue(5, id) == 5 || dao.checkClue(8, id) == 8 || dao.checkClue(11, id) == 11) {

								System.out.println(nick + " : ���ݱ��� �˾ƺ� �ٷδ� �ֱٿ� �������� pbk ���̿� �� ū ������ �־��µ�, �װͰ���.. ");
								System.out.println(
										"���� : ���� ��� ����ǿ� �־����! �߿��� ������Ʈ�� �־ 9�� 15�п��� 10�� 20�б��� ���⼭ ��û�������� ȸ�����̾��ٱ���!\n");
								time.timeDelay(700);
								System.out.println("���� : �̰� �ð� �����! ���� �� ������ �� �ǽ��� ���׿�!\n"
										+ "\t��... ��ư, ���� �� ��� PBK�� ���÷� ���� �ִµ��ٰ�, ���� �ִ� �� ������?\n\t�и� ���� �־����. ������ �ӾƵ� ���� ������.\n");
								time.timeDelay(700);
								if (dao.checkClue(12, id) == 12) {

								} else {
									dao.getClue(12, id);
								}
							}

						} else if (choice.equals("2")) {
							// ����ã��
							System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1] ����� ���� ��ǻ��  [2] Ŀ�ٶ� å��  [3] å�� ���� ");
							System.out.print("�Է� >> ");
							choice = sc.next();
							cnt++;
							sc.nextLine();

							if (choice.equals("1")) {
								// ����� ��ǻ��-����
								cnt++;
								music.playButten();
								image.imageDesktop();
								System.out.println("����� ������ǻ�Ϳ� �����մϴ�.");

								while (true) {
									System.out.println("\n[��й�ȣ ��Ʈ]");

									if (quiz.quizKing()) {
										image.imagePayDoc();
										System.out.println("���Ÿ� ȹ��!!");
										if (dao.checkClue(5, id) == 5) {

										} else {
											dao.getClue(5, id);
										}
										break;
									} else {
										System.out.println("���� ȹ�� ����!!");
										break;
									}
								}

							} else if (choice.equals("2")) {
								// å��
								System.out.println("Ŀ�ٶ� å���� ���캻��.");
								System.out.println("å���� ��û ����.");

							} else if (choice.equals("3")) {
								// ����� å�� ����
								cnt++;
								music.playDrawerOpen();
								System.out.println("���� å���� ������ �����.");
								System.out.println("������ �ڹ���� ����ְ� ���� ��Ʈ�� ���� ���̰� �ִ�.");
								while (true) {
									System.out.println("\n[��й�ȣ ��Ʈ]");

									if (quiz.quizKing2()) {
										image.imageDeposit();
										System.out.println("���Ÿ� ȹ��!!");
										// �۱ݳ��� �ƽ�Ű��Ʈ �ʿ�
										if (dao.checkClue(8, id) == 8) {

										} else {
											dao.getClue(8, id);
										}
										break;
									} else {

										System.out.println("���� ȹ�� ����!!");
										break;
									}
								}
							} else {
								System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
							}

						} else if (choice.equals("3")) {
							System.out.println("������ �����ϴ�.\n\n");
							music.playWalk();
							break;
						} else {
							System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
						}

					}
				} else if (choice.equals("3")) {

					while (true) {
						// ����
						System.out.println("\n���ǿ� ������ ��� �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						choice = sc.next();
						cnt++;

						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						if (choice.equals("1")) {
							// ���ΰ��� ��ȭ - �⺻����
							music.playPushing();
							System.out.println(nick + " : " + "��������, ���� � �ص� �ǰڽ��ϱ�?(��ġ�� ũ��... �������� ���� ����ϱ�.)");
							System.out.println("���� : (�ǰ��� ǥ��) �������̽ʴϱ�..? ���� ������.. ��ģ���� �׾��ٰ��.\n");
							time.timeDelay(700);
//						 ���ΰ��� ��ȭ
//						 boolean true false ��ȯ
//						 true(���Ű� ���� ��)
							// �߰�����
							System.out.println(nick + " : " + "�����ڿ��� ����� ����ϱ�?");
							System.out.println("���� : ���� PBK�� �ʵ��к��� ģ���Դϴ�. ���� ���� ������ �ƴϿ���.\n");
							time.timeDelay(700);
							System.out.println(nick + " : " + "�׷�����, 9�� �ݺ��� 10�ñ��� ������ �ϼ���?");
							System.out.println("���� : ���� �ǹ� ��ü�� �������̾����ϴ�. 1������ 4������... ���ǽǿ����� ���϶� �������� ������, "
									+ "\n�����ǿ��� ������ �������� �־����ϴ�.\n");
							time.timeDelay(700);

							if (dao.checkClue(17, id) == 17) {

							} else {
								dao.getClue(17, id);
							}

							if (dao.checkClue(6, id) == 6 || dao.checkClue(12, id) == 12) {
								// ���ų� ������ ������ �߰��� ���� �� �ִ� ��������
								// �߱��Ҷ��� pushing ���� �ٰ���?
								System.out.println("���� : ���� PBK�� ������ ���� �޾ҽ��ϴ�. ���� ������ �ƴմϴ�.");
								System.out.println("���� ���϶� �������� �ǽɵ˴ϴ�. �׺� ������ PBK�� ���̹��̿���.\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "���϶� �����԰� PBK ���̰� ���� �ʳ���?");
								System.out.println("���� : ��, �ֱٿ��� �� �� �����Ϸ��� �ֽ�µ�, PBK�� �Ȱɷ� �˰� �ֽ��ϴ�. \n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "(�ϴ� ������ ���̴� ��... ������ �ٸ� ���𰡴� ������?)\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "Ȥ�� ���� ���� �׻� ����ֽ��ϱ�? ���� ������ �Ͻó���?");
								System.out.println("���� : �ʿ��� ���� ������.. ������ �����ǿ��� �մϴ�.\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "PBK�� �������� �ŷ��� �־�����?");
								System.out.println("���� : ..... ���� ��Ȳ�� ����� �� ģ���� ���� ������ �� ���Դϴ�. �� �����߱���.\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "����� ��Ȳ�� ������ٸ� Ȥ�� ���� ���Ƚ��ϱ�? �� �ݾ��� �󸶳� �Ǵ°���?");
								System.out.println("���� : (���� ȭ�� ����)���� �׷��ͱ��� ��� �ؾ��ϳ���? ���̻� ���� ���� �ʰڽ��ϴ�.\n");

								if (dao.checkClue(13, id) == 13) {

								} else {
									dao.getClue(13, id);
								}
							}

						} else if (choice.equals("2")) {
							// ����ã��
							System.out.println("\n���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1]���� CCTV [2]���� å�� ���� [3]�������� ���� ");
							System.out.print("�Է� >> ");
							choice = sc.next();

							if (choice.equals("1")) {
								// ���� �����
								System.out.println("\n���� CCTV�� ���캻��.");
								System.out.println("�ްԽ�, ������, ���ǽ�, ����ǿ� �Ѹ� ����� �ִ�.");

							} else if (choice.equals("2")) {
								// ���� å�� ����
								music.playOpen();
								System.out.println("���� å�� ������ �����.");
								System.out.println("������ �ɰ����� ����ִ�.");

							} else if (choice.equals("3")) {
								// �������� ����
								cnt++;
								music.playGrope();
								System.out.println("�������� ������ �����ִ�.");
								System.out.println("�߿��غ��̴� ������ ���δ�.");

								if (quiz.quizSecu()) {
									image.imageRent();
									System.out.println("���Ÿ� ȹ��!!");

									if (dao.checkClue(6, id) == 6) {

									} else {
										dao.getClue(6, id);
									}
								} else {
									System.out.println("���� ȹ�� ����!!");
								}
							} else {
								System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
							}

						} else if (choice.equals("3")) {
							System.out.println("������ �����ϴ�.\n\n");
							music.playWalk();
							break;

						} else {
							System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
						}

					}
				} else if (choice.equals("4")) {

					while (true) {
						// ���ǽ�
						System.out.println("\n���ǽǿ� ���϶� �������� �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						choice = sc.next();
						cnt++;

						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						if (choice.equals("1")) {
							// ���ΰ��� ��ȭ
							music.playPushing();
							System.out.println(nick + " : " + "���϶�, ���� � �ص� �ǰڽ��ϱ�?(�Ҹ��� ���ƺ��̴� ��)");
							System.out.println("�϶� : (¥������ ǥ��) Ȥ�� PBK������ ���̳���?");
							time.timeDelay(700);
//							 ���ΰ��� ��ȭ
//							 boolean true false ��ȯ
//							 true(���Ű� ���� ��)
							// �߰�����
							System.out.println(nick + " : " + "�����ڿ��� ����� ����ϱ�?");
							System.out.println("�϶� : ���� PBK�� ���е�â�̿���. ������ ���̴� �����Ҿ��.\n");
							time.timeDelay(700);
							System.out.println(nick + " : " + "��, ������ϴ�. 9�� �ݺ��� 10�ñ��� ������ �ϼ���?");
							System.out.println("�϶� : ��ȩ�� ����� ���� ��� ģ���� ��ȭ���̾����. ģ������ �������.\n");

							if (dao.checkClue(18, id) == 18) {

							} else {
								dao.getClue(18, id);
							}

							if (dao.checkClue(7, id) == 7 || dao.checkClue(13, id) == 13) {
								// ���ų� ������ ������ �߰��� ���� �� �ִ� ��������
								System.out.println("������ ������ �ð��� ���� ������ �������� �����غ��°� ���?");
								time.timeDelay(700);
								System.out.println(nick + " : " + "������ ������? �׺��� �� �ǽ��Ͻô� ����?");
								System.out.println("�϶� : �Ʊ� ���� �ð��� ��� PBK�� ��û ã������. ��ҿ��� ���� �Ѿƴٳ��."
										+ "\n\t���� ������ �þ��. ��� PBK���� ����Ŀ�� �־��µ� �и��� �׿��ڿ���. ��ҿ��� ������ ���ϴٱ���.\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "���������� ����ġ����?");
								System.out.println("�϶� : ��. �� ����� ���� ���ְ���, ����Ƿ� ���ְ��� �� ������...\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "���󿡴� �� ���Űǰ���? ��ȭ�Ҷ�?");
								System.out.println("�϶� : ���� �Ȱ���. �űⰡ�� ����Ǵ� ����鸸 �־.\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "Ȥ�� �϶� �������� ���� �Ͻó���?");
								System.out.println("�϶� : �ƴϿ� �� ��� ������ �Ⱦ ��� ��ó�� �� ���� ����̿���."
										+ "�л����̶� ���� ������ �־�� �ϴµ� �� ���� ������ ǳ��� �ȵ���.");
								System.out.println("�϶� : ��! �Ʊ� �������� ����ż� �����帮�µ�, �׺� PBK�� ��û ģ�ؿ�. �Ƹ� ���� �ϵ�...\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "Ȥ�� �󸶳� ģ���� �ƽó���?");
								System.out.println("�϶� : �װ� ���� ���� ���������� �������?");

								if (dao.checkClue(14, id) == 14) {

								} else {
									dao.getClue(14, id);
								}
							}

						} else if (choice.equals("2")) {
							// ����ã��
							System.out.println("\n���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1] ���ǽ� ��ǻ�� [2] ���ǽ� å�� ��  [3] �л��� å�� ��  ");
							System.out.print("�Է� >> ");
							choice = sc.next();
							System.out.println();
							cnt++;
							if (choice.equals("1")) {
								// ���ǽ� ��ǻ��
								music.playButten();
								System.out.println("���ǽ� ��ǻ�Ϳ� �����غ���.");
								System.out.println("������ ���� ��ȭ������ �ִ�.");

							} else if (choice.equals("2")) {
								// ���ǽ� å�� ��
								music.playGrope();
								System.out.println("���ǽ� å�� ���� ���캻��.");
								cnt++;
								if (quiz.quizLec()) {
									System.out.println("���Ÿ� ȹ��!!");
									image.imageCiga();
									if (dao.checkClue(7, id) == 7) {

									} else {
										dao.getClue(7, id);
									}
								} else {
									System.out.println("���� ȹ�� ����!!");
								}

							} else if (choice.equals("3")) {
								// �л��� å�� ��
								System.out.println("�л��� å�� ���� ���캻��.");
								System.out.println("�л��� ������� �׿��ִ�.");

							} else {
								System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
							}

						} else if (choice.equals("3")) {
							System.out.println("������ �����ϴ�.\n\n");
							music.playWalk();
							break;

						} else {
							System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
						}

					}
				} else if (choice.equals("5")) {

					while (true) {
						// ������
						System.out.println("\n�����ǿ� ������ �������� �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						cnt++;
						choice = sc.next();

						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						if (choice.equals("1")) {
							// ���ΰ��� ��ȭ
							music.playPushing();
							System.out.println(nick + " : " + "��������, ���� � �ص� �ǰڽ��ϱ�?(ȭ���� ���ϳ�..)");
							System.out.println("���� : (������ �긮��..) ����� ������ �� ����ּ���...�ʹ� ���ۿ�...����\n");
							time.timeDelay(700);
//							 ���ΰ��� ��ȭ
//							 boolean true false ��ȯ
//							 true(���Ű� ���� ��)
							// �߰�����
							System.out.println(nick + " : " + "�����ڿ��� ����� ����ϱ�?");
							System.out.println("���� : ���� PBK �� �ʹ� �����ؿ�. �����ϰ� ���� ���� ���� �����߾��....\n");
							time.timeDelay(700);
							System.out.println(nick + " : " + "9�� �ݺ��� 10�ñ��� ������ �ϼ���?");
							System.out.println("���� : �� ���... 9�� 20�п� PBK �������� ������... ������ ����! �� �� ������ ��ư�̴ٱ���!");
							System.out.println("����... ����л��� �ǽɰ���.. ��� PBK ������ �ʹ� ����� ���� �߰ŵ��..\n");//
							time.timeDelay(700);
							System.out.println(nick + " : " + "��.. �׷��ٸ� �������� ����ִ� ������ ������ ����ڽñ���.");
							System.out.println("���� : �׷��� �����Ͻô� �� ���ΰ� �ǳ׿�.. ���� �������� ������ ������ ���ٴ�.. ���� �⻵��..\n");
							time.timeDelay(700);
							System.out.println(nick + " : " + "(����..�������ΰ�?)... �� �׸��� ��� ������? �� ���Ŀ�");
							System.out.println("���� : �� �ٷ� �����ǿ� ���ƿ� ��� �۾��߾��. �� ��ǻ�� ������ ���ŵ� ���ƿ�!\n");

							if (dao.checkClue(19, id) == 19) {

							} else {
								dao.getClue(19, id);
							}

							if (dao.checkClue(3, id) == 3 || dao.checkClue(9, id) == 9 || dao.checkClue(14, id) == 14) {
								// ���ų� ������ ������ �߰��� ���� �� �ִ� ��������
								System.out.println("���� : ����� �׷��� �����ǿ� ������ ���� ���谡 ������ �־����.\n");//
								time.timeDelay(700);
								System.out.println(nick + " : " + "���� ����� �������� �����Ͻô� �ǰ���?");
								System.out.println(
										"���� : ���� �����ϴ°� �ƴϰ� ���� ������ ���� ���� �Ѵ�ϴ�. �׻� ���� ����� �����Կ� �־��µ� ���ϱ� �������.\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "Ȥ�� ����ƽ �÷��� � ���� ��� �Ͻó���?");
								System.out.println("���� : �ַ� ������ �������̿�. ���� �������� �� ��︮�ŵ��.\n");
								time.timeDelay(700);
								System.out.println(nick + " : " + "Ȥ�� ������ �����ϴ� ���� �̻��� ������ ������ �ֳ���?");
								System.out.println("���� : ���� ������ ����� ... �̷��� ��... �׷��׿�...\n");

								if (dao.checkClue(10, id) == 10) {

								} else {
									dao.getClue(10, id);
								}
							}

						} else if (choice.equals("2")) {
							// ����ã��
							System.out.println("\n���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1]�����Ե� å��  [2]������  [3]������ ĳ��� ");
							System.out.print("�Է� >> ");
							choice = sc.next();
							cnt++;
							if (choice.equals("1")) {
								// �����Ե� å��
								music.playGrope();
								System.out.println("�����Ե� å���� ���캻��.");
								System.out.println("������ ������ �ܿ��� ��� ����� ������ ���δ�.");
								// QuizTeach2 �ӱ���
								cnt++;
								if (quiz.quizTeach1() == true) {
									image.imageMug();
									System.out.println("���Ÿ� ȹ��!!");
									if (dao.checkClue(9, id) == 9) {

									} else {
										dao.getClue(9, id);
									}
								} else {
									System.out.println("���� ȹ�� ����!!");
								}

							} else if (choice.equals("2")) {
								// ������
								cnt++;
								music.playCabinetOpen();
								System.out.println("�������� �����.");
								System.out.println("����ִ� ���� �ִ�.");
								// QuizTeach ������ ����
								if (quiz.quizTeach2()) {
									image.imageKey();
									System.out.println("���Ÿ� ȹ��!!");
									System.out.println("�������� ���󿭼谡 ����� �ִ�. ������ ���󿭼踦 �������� ���̴�. \n"
											+ "���� ����� ����...���� �����ϴ� ���ϱ�? ������ ���� ������ ������?");
									if (dao.checkClue(3, id) == 3) {

									} else {
										dao.getClue(3, id);
									}
								} else {
									System.out.println("���� ȹ�� ����!!");
								}

							} else if (choice.equals("3")) {
								// ������ ĳ���
								music.playCabinetOpen();
								System.out.println("�����Ե� ĳ����� ���캻��.");
								System.out.println("���� ����ִ�.");
							} else {
								System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
							}

						} else if (choice.equals("3")) {
							System.out.println("������ �����ϴ�.\n\n");
							music.playWalk();
							break;
						} else {
							System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
						}

					}
				}
			} else if (choice.equals("2")) {

				// ���� ����
				music.playCatch();
				System.out.println("\n\n������ �����Ͻðڽ��ϱ�? ��ȸ�� �� �� ��!!");
				System.out.println("[���н� ���ݱ����� ��� ������ �ʱ�ȭ�˴ϴ�] ");
				System.out.print("��¥�� �����Ͻðڽ��ϱ�? \n [1]�� [2]�ƴϿ� >> ");
				choice = sc.next();
				System.out.println();
				System.out.println();

				if (choice.equals("1")) {
					System.out.println("\n������ �����ϼ���");
					System.out.println("[1] �ڻ�� [2] �ڳ��� [3] ������ [4] ���϶� [5] ������");
					System.out.print("�Է� >> ");
					int criminal = sc.nextInt();

					if (criminal == 3) {
						if (music.isPlaying() == true) {
							music.stopMusic();
						}
						music.goodEnding();
						System.out.println("���� �˰� ����!!");
						System.out.println("������ PBK�� ģ�� ģ�� ���� ������ �Դϴ�.\n");
						time.timeDelay(1000);
						System.out.println(
								"�������� PBK�� �������� �������� ���������� �ž��� ������ ���� " + "��Ȱ�� �ô޸��� ��, �ᱹ ģ�� PBK���� �ž��� ���� ������.");
						time.timeDelay(1000);
						System.out.println("ó������ PBK�� �������� �ſ� ���� ������, ���� ������ ���� "
								+ " �������� ��Ȳ�� ���̷� �ڽ��� ���� ����ϰ� ��2���ϴ� PBK�� �µ��� ū �г븦 ������ �ȴ�.");
						time.timeDelay(1000);
						System.out.println("�׷��� ����� PBK�� ������ ���� ������� ���ϰ� �䱸�ϰ� �̿� "
								+ "�������� ���� ���� �� ���ٰ� ������ ���� PBK�� ��ģ�弳�� �׸� �ͺ��Ѵ�.");
						time.timeDelay(1000);
						System.out.println("�������� �г�� ���� �������� �׸� ���� ������ ���� ���� ��Ų ��"
								+ "�ָӴϼӿ��� ��ǰ�ǿ��� ���� ���ǿ� �η��� Ŀ��Į�� ���� ���� �浶���� �����Ͽ� " + "����� �̸��� �Ѵ�.");
						time.timeDelay(1000);
						System.out.println("��Ȳ�� �״� Ŀ��Į�� �ްԽ� �����뿡 �����Ͽ� �ǹ� û�ҽð��� ���������� �ϰ� "
								+ "�ִ��� ���� ����� �����ڰ� �ö������ ������ ����� �ʵ��� ���踦 �����Ѵ�.");
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
						System.out.println("���� �˰ſ� �����Ͽ����ϴ�...\n [���ݱ��� ����� ��� ����� �����Ǿ����ϴ�]");
						dao.deleteClue(id);
						dao.deleteCount(id);
						break;
					} else {
						System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
					}

				} else if (choice.equals("2")) {

					if (music.isPlaying() == true) {
						music.stopMusic();
					}

				} else {
					System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
				}

				///
			} else if (choice.equals("3")) {
				dao.showClue(id);
				System.out.println("\n=============================================\n");

			} else if (choice.equals("4")) {
				dao.save(cnt, id);
				System.out.println("����Ǿ����ϴ�.");

			} else if (choice.equals("5")) {
				// ����
				if (music.isPlaying() == true) {
					music.stopMusic();
				}

				System.out.println("������ �����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���");
			}

		}

	}

}