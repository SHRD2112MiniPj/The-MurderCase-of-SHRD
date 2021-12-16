package murderCase_of_SMHRD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ƽ�Ű ��Ʈ�� ������ ���λ�� ����� BGM(�����ϰ� ��ο�)'
		MurderDAO dao = new MurderDAO();
		Delay time = new Delay();
		Scanner sc = new Scanner(System.in);
		Quiz quiz = new Quiz();
		Image image = new Image();
		int cnt = 0;
		

		// ������� ��ٶ� ȿ���� �ݺ��ؼ� ȸ������ ������??
		System.out.println("�������� ���� �� ó�� �̽��׸��� ������ ���� ��...");
		time.timeDelay(2);
		System.out.println("���� ���� �������� ���λ�ǿ� ���� ������ ���Դ�!");
		time.timeDelay(1);
		System.out.println("����� ���� ����� ������ ������ ��� ����!");
		time.timeDelay(1);
		System.out.println("�̶� ���� ���ᰡ ����� �̸��� �θ���!!\n");
		time.timeDelay(2);

		int choice = 0;
		int temp = 0;
		String temp2 = "";
		String id = "";
		String pw = "";
		String nick = "";

		while (true) {
			System.out.println("���� ������ �����ڸ� ������ ����� �̸���??");
			System.out.println("[1] ȸ������ [2] �α���");
			System.out.print("�Է� >> ");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("ȸ�� ����! ���ο� ����� ȯ���մϴ�!!");
				while (true) {
					System.out.print("����� ���̵� �Է��ϼ��� >> ");
					id = sc.next();
					if (dao.checkId(id).equals(id)) {
						System.out.println("�ߺ��� ���̵� �Դϴ�. �ٸ� ���̵� �Է����ּ���");
					} else {
						break;
					}
				}

				System.out.print("��й�ȣ�� �Է��ϼ��� >> ");
				pw = sc.next();
				System.out.print("����� �̸��� �Է��ϼ��� >> ");
				nick = sc.next();

				temp = dao.join(id, pw, nick);
				if (temp > 0) {
					System.out.println("ȸ������ ����!");
					break;
				} else {
					System.out.println("ȸ������ ����!");
				}

			} else if (choice == 2) {
				System.out.println("����� ȯ���մϴ�! �α����� ���ּ���!");
				System.out.print("���̵� �Է��ϼ��� >> ");
				id = sc.next();
				System.out.print("��й�ȣ�� �Է��ϼ��� >> ");
				pw = sc.next();

				temp2 = dao.login(id, pw);
				System.out.println(temp2 + " ����� �ݰ����ϴ�!\n");
				break;
			}
		}

		while (true) {
			System.out.println("[1]�����ϱ� [2]�ҷ����� [3]��ŷ����");
			System.out.print("�Է� >> ");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("\n\n���ο� ������ �����մϴ�.\n");
				dao.deleteClue(id);
				dao.deleteCount(id);
				dao.getClue(1, id);
				dao.getClue(2, id);
				break;
			} else if (choice == 2) {
				if (dao.showCount(id) == 0) {
					System.out.println("����� ������ �����ϴ�. '[1]�����ϱ�'�� �����ϼ���. \n");
				} else {
					System.out.println("���� ������ �̾ �����մϴ�.\n");

					break;
				}

			} else if (choice == 3) {
				System.out.println("��ŷ�� Ȯ���մϴ�");
				dao.ranking();

			}

		}
		// opening
		System.out.println("�� �������� ������ ����� ��...");
		time.timeDelay(1);
		System.out.println("����� ��ģ ���� �̲��� �������� �ö󰬴�..");

		System.out.println("�ε�!!!!!!!"); // BGM + ��ü �ƽ�Ű��Ʈ
		
		image.imageIntro();
		
		time.timeDelay(1);
		
		System.out.println("������ �п��� ��Ÿ �������� �˸��޴� ���翴�� PBK");
		System.out.println("�״� �δ��� �ְ����� �߰ߵǾ���!");
		time.timeDelay(1);
		System.out.println("��Ȳ�� ����� �ǿ���� ��踦 ����߸��� ��ü ������ �ٰ����µ�...\n");

		while (true) {
			System.out.println("��ü�� Ȯ���Ͻðڽ��ϱ�?");
			System.out.println("[1] ���׸޼��� [2] ����� ��ó [3] �������� [4] �ʿ� ���� ����ƽ [5] ���̾� ���� [6] �Ѿ��\n"
					+ "[�⺻ ������ ������ ���ź��⸦ ���� Ȯ���� �� �ֽ��ϴ�]");
			System.out.print("�Է� >> ");
			choice = sc.nextInt();
			System.out.println("\n");
			if (choice == 1) {
				System.out.println("����� ��ü ������ �ٰ�����. PBK�� �� �þ��� �� ���� � �޼����� �ִ�");
				image.imageDie();
				System.out.println("�ױ����� ���ο� ���� ������ �������� ���� ����...\n");
				time.timeDelay(1);
				// ���׸޼����� �����ֱ⸸ �ϰ� ���̺� ���� X
			} else if (choice == 2) {
				System.out.println("�����ڴ� ���帰 ä �׾��ִ�. ������� ���캸�� ū Ȥ�� �ھ��ִ�. " + "������ �ڿ��� �׸� ������ ���ϱ�?");
				System.out.println("�׷��� ���� �� �ֺ��� ��ó�� ����� �ʿ� ���� ���ڱ��� ���� �����δ� " + "���������� ���������� �𸥴�.\n");
				// �ʱ����� ����� ���� ��ó
			} else if (choice == 3) {
				System.out.println(
						"������ ��ü ��ó�� ��׷��� ������ ���� ���ڰ� �κη��� �ִ�. ����� " + "�̿� ����ä ���� ���� ���� ��½ �鿩�� ���� ��¦�̴� �� �ð谡 ���δ�.");
				image.imageWatch();
				time.timeDelay(1);
				System.out.println("���� ���� ���ڿ� �ո�ð��� �� �ʹ�.\n");
				// �ʱ� ���� �������� �� �� �ð�
			} else if (choice == 4) {
				System.out.println("����� �򰥸����� ���ϰ� �ٸ� ���� �ڱ��� �������� ���ǿ� �����ִ�. �Լ� ����� " + "�ڱ�... �̰��� �����ϱ�?\n");
				image.imagelip();
				time.timeDelay(1);
				// �ʱ� ���� ����ƽ �ڱ�
			} else if (choice == 5) {
				System.out.println("�����ڴ� �ױ��� � ���ڿ� ����ģ ���ϱ�? ���� ������ ��ó�� �� �ٸ� ������ ���δ�. "
						+ " ��Ҽӿ����� �� ���� ���� ���� �ϳ� ���� ���̴� ���̾ƹ����� �߰��Ѵ�. ����� ��ĩ �����.\n");
				image.imageRing();
				time.timeDelay(1);
				// �ʱ� ���� ���̾� ����
			} else if (choice == 6) {
				System.out.println("�ٷ� ������ �����մϴ�.\n");
				break; // skip
			}
		}
		System.out.println("����� ��� ������ �߽���ä ���󿡼� �������� ��ܿ��� �������� �Ű��Ѵ�.\n");
		System.out.println(
				"����� �����ڰ� �ִ� ��Ҹ� �����Ͽ� �����ڸ� �߱��� �� �ֽ��ϴ�. \n" + "�߱��� ���� �������Ÿ� �߰��ϰų� �� ��Ҹ� Ž���Ͽ� �������Ÿ� �߰��� �� �ֽ��ϴ�.\n");

		time.timeDelay(1);
		dao.showOpening();
		dao.showClue(id);
		System.out.println();
		System.out.println("===========================================");
		dao.showCount(id);
		System.out.println();

		while (true) {
			System.out.println("����� ������ �����߽��ϴ�.");
			System.out.println("[1] Ž�� [2] �������� [3] ���ź��� [4] ���� [5] ���� ");
			System.out.print("�Է� >> ");
			choice = sc.nextInt();
			cnt++;

			if (choice == 1) {
				// Ž��
				System.out.println("Ž���� ��Ҹ� �����ϼ���.");
				System.out.println("[1] �ްԽ� [2] ����� [3] ���� [4] ���ǽ� [5] ������");
				System.out.print("Ž���� ��� �Է� >> ");
				choice = sc.nextInt();
				System.out.println("\n\n");
				if (choice == 1) {
					System.out.println(choice);
					// �ްԽ�
					while (true) {
						System.out.println("�ްԽǿ� �ڻ�� �л��� �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						choice = sc.nextInt();
						cnt++;
						if (choice == 1) {
							// ���ΰ��� ��ȭ - �⺻����
							System.out.println(nick + " : ��� �л����� ������ �Ѵ�.");
							System.out.println(nick + " : " + "����� PBK ��ü ���ʹ߰��� �Դϱ�?");
							System.out.println("��� :��... 10�� 40�� �Ѿ ���� ������ PBK��������...�ý��ϴ�....");
//									 ���ΰ��� ��ȭ
//									 boolean true false ��ȯ
//									 true(���Ű� ���� ��)
							// �߰�����
							System.out.println(nick + " : " + "���󿡴� �� �ö󰡼̳���?");
							System.out.println("��� : PBK������ ��ǥ �ڷḦ �غ��ϴٰ� �ٶ��� ���� �ö󰬴µ�...\n");
							System.out.println(nick + " : " + "��� �����ڿ��� ���谡 ����ϱ�?");
							System.out.println("��� : ��? ���� ���� �ǽ��Ͻó���? ���� �������� ���� ���� ������Ʈ ������ �߽��ϴ�..");
							System.out.println("������ ���� ����ڸ��� �ֽñ�� ����ؼ� ���� �������� ���ϰ� �ִµ� �������� ���̸�");
							System.out.println("���� ���� �̵��� �������? ���� ���� ������ ���ؼ� ���� ���忡 �����ϰ� ������... ���");
							System.out.println("�۾��� ������ ���� ����� ������.. �������� ������ �� �ʿ��� ���Դϴ�!! ���� ����ؿ�!\n");
							System.out.println(nick + " : " + "9�� 30�к��� 10�ñ��� ��𿡼� ������ �߽��ϱ�?");
							System.out.println("��� : 8�� 40�� ���� ��ü �߰� ������ ���� ���⼭ ȥ�� �۾����̾����ϴ�.. \n");
							System.out.println(nick + " : " + "(ȥ�ڼ� �۾��ߴ�... ������ ���� ����.)");
							System.out.println("��� : ��ҿ� �ڳ���������̶� PBK�������� �����ϴ� ���� �ý��ϴ�... �ѹ� ����鿡�� ������� �����.. ");
							System.out.println(nick + " : " + "(�ڳ��� ������� �̾߱⸦ �ؾ߰ڱ�..)");

						} else if (choice == 2) {
							System.out.println(choice);
							// ����ã��
							System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1]������ ���� [2]�������� [3]�޽Ŀ� ��Ʈ ");
							System.out.print("�Է� >> ");
							choice = sc.nextInt();
							cnt++;
							if (choice == 1) {
								// ������
								System.out.println("������ ������ ���캻��.");
								System.out.println("�ƹ��͵� ����.");

							} else if (choice == 2) {
								// ��������-����
								System.out.println("�ްԽ� ���������� ���캻��.");
								cnt++;
								if (quiz.quizCafe()) {
									cnt++;

									if (dao.checkClue(4, id) == 4) {
										System.out.println("���Ÿ� �̹� ȹ���߽��ϴ�.");
									} else {
										dao.getClue(4, id);
										System.out.println("���Ÿ� ȹ��!!");
									}

								} else {
									System.out.println("���� ȹ�� ����!!");
								}

							} else if (choice == 3) {
								// �޽Ŀ� ��Ʈ
								System.out.println("��Ʈ�� ���캸�Ҵ�.");
								System.out.println("ħ���� å ��� ���δ�.");
								//
							}
						} else if (choice == 3) {
							System.out.println("������ �����ϴ�.\n\n");
							break;
						}
					}
				} else if (choice == 2) {

					while (true) {
						// �����
						System.out.println("����ǿ� �ڳ��� ������ �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						choice = sc.nextInt();
						cnt++;
						if (choice == 1) {

							System.out.println(nick + " : �ڳ��� ���忡�� ������ �Ѵ�.");
							System.out.println(nick + " : �����, ���� � �ص� �ǰڽ��ϱ�?(��... �°� ��ǰ��.. �ſ� ȭ���� ��Ÿ���̱�..");
							System.out.println("���� : (��Į����) ���� ���� �ǽ��Ͻô°ǰ���? ���ƿ�. ������ �������.");
//							 ���ΰ��� ��ȭ
//							 boolean true false ��ȯ
//							 true(���Ű� ���� ��)
							// �߰�����
							System.out.println(nick + " : �����ڴ� � ����Դϱ�?");
							System.out.println("���� : �� �ǹ����� ������ ���� ���߾��. �׷��� ������ ��������.\n");
							System.out.println(nick + " : ��� �����ڿ��� ���谡 ����ϱ�?");
							System.out.println("���� : �����ϰ� ���ϸ� �� ����� ������. ���� ������ ���忡�� �����̳��ϰ�.");
							System.out.println("������ �׷��Ϸ� ����� ������ �ʾƿ�. ���� ������ ���� ����̶� ���� �׷��ʿ䵵 �����. �ذ��ϸ� �Ǵϱ��.");
							System.out.println(nick + " : 9�� 30�к��� 10�ñ��� ��𿡼� ������ �߽��ϱ�?");
							System.out.println("���� : ���� ��� ����ǿ� �־����. �߿��� ������Ʈ�� �� �־ ��û�������� ����ǿ��� ȸ�����̾����.");
							System.out.println(nick + " : (�˸����̰� �ֱ�...������ �ٸ� Ʈ���� �������� �־�!)");
							System.out.println("���� : ���� �� ������ �ǽɰ���. �̸��� �𸣰ڴµ�, �� ��� ������.");
							System.out.println(nick + " : " + "����? �� �ǹ��� �����̿�?");
							System.out.println("���� : �� ��� PBK�� ģ�߾��. �ٵ� ���ݾ�? ���ܹ��� ���������. ����� ����."
									+ "�׸��� ���� �и��� ���ŷ��� �߾��. ��� �׻��... ���� �� ������? �����θ� ģ���� ���� ���ΰ� ����. ������ �ӾƵ� ���� ������.");
							System.out.println(nick + " : " + "�� ��� ���̿� ���ŷ��� �־���...");

						} else if (choice == 2) {
							// ����ã��
							System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1] ����� ���� ��ǻ��  [2] Ŀ�ٶ� å��  [3] å�� ���� ");
							System.out.print("�Է� >> ");
							choice = sc.nextInt();
							cnt++;
							sc.nextLine();

							if (choice == 1) {
								// ����� ��ǻ��-����
								cnt++;
								System.out.println("����� ������ǻ�Ϳ� �����մϴ�.");
								image.imageDesktop();
								System.out.println("��й�ȣ�� ����ϴ� �ڵ带 �ۼ��ϼ���");
								System.out.println(">> (77*1)+(76*2)+(75*3)+...+(1*77)�� ����ϴ� �ڵ带 �ۼ��Ͽ� �ùٸ� ����� ����Ͻÿ�");
								System.out.println("��, int sum = 0; ����Ǿ�����, sum�� for���� ����Ͽ� ���;��� ���ٷ� ��¹����� �ۼ��ϸ� �˴ϴ�");
								String txt = sc.nextLine();

								int sum = 0;
								if (quiz.quizKing(txt, sum)) {
									System.out.println("���Ÿ� ȹ��!!");
									if (dao.checkClue(5, id) == 5) {

									} else {
										dao.getClue(5, id);
									}
								} else {
									System.out.println("���� ȹ�� ����!!");
								}
							} else if (choice == 2) {
								// å��
								System.out.println("Ŀ�ٶ� å���� ���캻��.");
								System.out.println("å���� ��û ����.");

							} else if (choice == 3) {
								// ����� å�� ����
								cnt++;
								System.out.println("���� å���� ������ �����.");
								System.out.println("������ �ڹ���� ����ְ� ���� ��Ʈ�� ���� ���̰� �ִ�.");
								System.out.println("��й�ȣ�� ����ϴ� �ڵ带 �ۼ��ϼ���");
								System.out.println(">> 10!(���丮��) ���� ���Ͻÿ�");
								System.out.println("��, int sum = 1; ����Ǿ�����, sum�� for���� ����Ͽ� ���;��� ���ٷ� ��¹����� �ۼ��ϸ� �˴ϴ�.");
								String txt = sc.nextLine();

								int sum = 1;

								if (quiz.quizKing(txt, sum)) {
									System.out.println("���Ÿ� ȹ��!!");
									if (dao.checkClue(8, id) == 8) {
										continue;
									} else {
										dao.getClue(8, id);
									}
								} else {
									System.out.println("���� ȹ�� ����!!");
								}
							}
						} else if (choice == 3) {
							System.out.println("������ �����ϴ�.\n\n");
							break;
						}

					}
				} else if (choice == 3) {
					System.out.println(choice);

					while (true) {
						// ����
						System.out.println("���ǿ� ������ ��� �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						choice = sc.nextInt();
						cnt++;
						if (choice == 1) {
							// ���ΰ��� ��ȭ - �⺻����
							System.out.println(nick + " : ������ ��񿡰� ������ �Ѵ�.");
							System.out.println(nick + " : " + "��������, ���� � �ص� �ǰڽ��ϱ�?(��ġ�� ũ��... �������� ���� ����ϱ�.)");
							System.out.println("���� : (�ǰ��� ǥ��) �������̽ʴϱ�..? ���� ������.. ��ģ���� �׾��ٰ��.");
//						 ���ΰ��� ��ȭ
//						 boolean true false ��ȯ
//						 true(���Ű� ���� ��)
							// �߰�����
							System.out.println(nick + " : " + "�����ڿ��� ����� ����ϱ�?");
							System.out.println("���� : ���� PBK�� �ʵ��к��� ģ���Դϴ�. ���� ���� ������ �ƴϿ���.");
							System.out.println(nick + " : " + "�׷�����, 9�� �ݺ��� 10�ñ��� ������ �ϼ���?");
							System.out.println("���� : ���� �ǹ� ��ü�� �������̾����ϴ�. 1������ 4������... ���ǽǿ����� ���϶� �������� ������, �����ǿ��� ������ �������� �־����ϴ�.");
							System.out.println("���� ���϶� �������� �ǽɵ˴ϴ�. �׺� ������ PBK�� ���̹��̿���.");
							System.out.println(nick + " : " + "���϶� �����԰� PBK ���̰� ���� �ʳ���?");
							System.out.println("���� : ��, �ֱٿ��� �� �� �����Ϸ��� �ֽ�µ�, PBK�� �Ȱɷ� �˰� �ֽ��ϴ�. ");
							System.out.println(nick + " : " + "(�ϴ� ������ ���̴� ��... ������ �ٸ� ���𰡴� ������?)");
							System.out.println("���� : ���� PBK�� ������ ���� �޾ҽ��ϴ�. ���� ������ �ƴմϴ�.");
							System.out.println(nick + " : " + "Ȥ�� ���� ���� �׻� ����ֽ��ϱ�? ���� ������ �Ͻó���?");
							System.out.println("���� : �ʿ��� ���� ������.. ������ �����ǿ��� �մϴ�.");
							System.out.println(nick + " : " + "PBK�� �������� �ŷ��� �־�����?");
							System.out.println("���� : ..... ���� ��Ȳ�� ����� �� ģ���� ���� ������ �� ���Դϴ�. �� �����߱���.");
						} else if (choice == 2) {
							// ����ã��
							System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1]���� ����� [2]���� å�� ���� [3]�������� ���� ");
							System.out.print("�Է� >> ");
							choice = sc.nextInt();

							if (choice == 1) {
								// ���� �����
								System.out.println("���� ����͸� ���캻��.");
								System.out.println("�ްԽ�, ���½�, ���ǽ�, ����ǿ� �Ѹ� ����� �ִ�.");

							} else if (choice == 2) {
								// ���� å�� ����
								System.out.println("���� å�� ������ �����.");
								System.out.println("������ �ɰ����� ����ִ�.");

							} else if (choice == 3) {
								// �������� ����
								cnt++;
								System.out.println("�������� ������ �����ִ�.");
								System.out.println("�߿��غ��̴� ������ ���δ�.");

								if (quiz.quizSecu()) {
									System.out.println("���Ÿ� ȹ��!!");
									if (dao.checkClue(6, id) == 6) {

									} else {
										dao.getClue(6, id);
									}
								} else {
									System.out.println("���� ȹ�� ����!!");
								}
							}

						} else if (choice == 3) {
							System.out.println("������ �����ϴ�.\n\n");
							break;

						}

					}
				} else if (choice == 4) {

					System.out.println(choice);
					while (true) {
						// ���ǽ�
						System.out.println("���ǽǿ� ���϶� �������� �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						choice = sc.nextInt();
						cnt++;
						if (choice == 1) {
							// ���ΰ��� ��ȭ
							System.out.println(nick + "���϶� �����Կ��� ������ �Ѵ�.");
							System.out.println(nick + " : " + "���϶�, ���� � �ص� �ǰڽ��ϱ�?(�Ҹ��� ���ƺ��̴� ��)");
							System.out.println("�϶� : (¥������ ǥ��) Ȥ�� PBK������ ���̳���?");
//							 ���ΰ��� ��ȭ
//							 boolean true false ��ȯ
//							 true(���Ű� ���� ��)
							// �߰�����
							System.out.println(nick + " : " + "�����ڿ��� ����� ����ϱ�?");
							System.out.println("�϶� : ���� PBK�� ���е�â�̿���. ������ ���̴� �����Ҿ��.");
							System.out.println(nick + " : " + "��, ������ϴ�. 9�� �ݺ��� 10�ñ��� ������ �ϼ���?");
							System.out.println("�϶� : ��ȩ�� ����� ���� ��� ģ���� ��ȭ���̾����. ģ������ �������.");
							System.out.println("������ ������ �ð��� ���� ������ �������� �����غ��°� ���?");
							System.out.println(nick + " : " + "������ ������? �׺��� �� �ǽ��Ͻô� ����?");
							System.out.println("�϶� : �Ʊ� ���� �ð��� ��� PBK�� ��û ã������. ��ҿ��� ���� �Ѿƴٳ��."
									+ "���� ������ �þ��. ��� PBK���� ����Ŀ�� �־��µ� �и��� �׿��ڿ���. ��ҿ��� ������ ���ϴٱ���.");
							System.out.println(nick + " : " + "���������� ����ġ����?");
							System.out.println("�϶� : ��. �� ����� ���� ���ְ���, ����Ƿ� ���ְ��� �� ������. �ٵ� �׻���� ģ�ؿ�. PBK��..");
							System.out.println(nick + " : " + "���󿡴� �Ȱ��Űǰ���? ��ȭ�Ҷ�?");
							System.out.println("�϶� : ���� �Ȱ���. �űⰡ�� ����Ǵ� ����鸸 �־.");
						} else if (choice == 2) {
							// ����ã��
							System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1] ���ǽ� ��ǻ�� [2] ���ǽ� å�� ��  [3] �л��� å�� ��  ");
							System.out.print("�Է� >> ");
							choice = sc.nextInt();
							cnt++;
							if (choice == 1) {
								// ���ǽ� ��ǻ��
								System.out.println("���ǽ� ��ǻ�Ϳ� �����غ���.");
								System.out.println("������ ���� ��ȭ������ �ִ�.");

							} else if (choice == 2) {
								// ���ǽ� å�� ��
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

							} else if (choice == 3) {
								// �л��� å�� ��
								System.out.println("�л��� å�� ���� ���캻��.");
								System.out.println("�л��� ������� �׿��ִ�.");

							}
						} else if (choice == 3) {
							System.out.println("������ �����ϴ�.\n\n");
							break;

						}
					}
				} else if (choice == 5) {
					System.out.println(choice);
					while (true) {
						// ������
						System.out.println("�����ǿ� ������ �������� �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						cnt++;
						choice = sc.nextInt();
						if (choice == 1) {
							// ���ΰ��� ��ȭ
							System.out.println(nick + " : ������ �����Կ��� ������ �Ѵ�.");
							System.out.println(nick + " : " + "��������, ���� � �ص� �ǰڽ��ϱ�?(ȭ���� ���ϳ�..)");
							System.out.println("���� : (������ �긮��..) ����� ������ �� ����ּ���...�ʹ� ���ۿ�...����");
//							 ���ΰ��� ��ȭ
//							 boolean true false ��ȯ
//							 true(���Ű� ���� ��)
							// �߰�����
							System.out.println(nick + " : " + "�����ڿ��� ����� ����ϱ�?");
							System.out.println("���� : ���� PBK �� �ʹ� �����ؿ�. �����ϰ� ���� ���� ���� �����߾��....");
							System.out.println(nick + " : " + "9�� �ݺ��� 10�ñ��� ������ �ϼ���?");
							System.out.println("���� : �� ���... 9�� 20�п� PBK �������� ������... ������ ����! �� �� ������ ��ư�̴ٱ���!");
							System.out.println("����... ����л��� �ǽɰ���.. ��� PBK ������ �ʹ� ����� ���� �߰ŵ��..");//
							System.out.println(nick + " : " + "��.. �׷��ٸ� �������� ����ִ� ������ ������ ����ڽñ���.");
							System.out.println("���� : �׷��� �����Ͻô� �� ���ΰ� �ǳ׿�.. ���� �������� ������ ������ ���ٴ�.. ���� �⻵��..");
							System.out.println(nick + " : " + "(����..�������ΰ�?)... �� �׸��� ��� ������? �� ���Ŀ�");
							System.out.println("���� : �� �ٷ� �����ǿ� ���ƿ� ��� �۾��߾��. �� ��ǻ�� ������ ���ŵ� ���ƿ�!");
							System.out.println(nick + " : " + "(�� �����.. ���� �ǽ��� �Ǵ±�) �������� �����̳���?");
							System.out.println("���� : ��. �۾��߿� ��� �����ǿ� ����������. ������ ��������� �������� �ʴµ�...");
						} else if (choice == 2) {
							// ����ã��
							System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1]�����Ե� å��  [2]������  [3]������ ĳ��� ");
							System.out.print("�Է� >> ");
							choice = sc.nextInt();
							cnt++;
							if (choice == 1) {
								// �����Ե� å��
								System.out.println("�����Ե� å���� ���캻��.");
								System.out.println("������ ������ �ܿ��� ��� ����� ������ ���δ�.");
								// QuizTeach2 �ӱ���
								cnt++;
								if (quiz.quizTeach1()) {
									System.out.println("���Ÿ� ȹ��!!");
									image.imageMug();
									if (dao.checkClue(9, id) == 9) {

									} else {
										dao.getClue(9, id);
									}
								} else {
									System.out.println("���� ȹ�� ����!!");
								}

							} else if (choice == 2) {
								// ������
								cnt++;
								System.out.println("�������� �����.");
								System.out.println("����ִ� ���� �ִ�.");
								// QuizTeach ������ ����
								if (quiz.quizTeach2()) {
									System.out.println("���Ÿ� ȹ��!!");
									image.imageKey();
									if (dao.checkClue(3, id) == 3) {

									} else {
										dao.getClue(3, id);
									}
								} else {
									System.out.println("���� ȹ�� ����!!");
								}

							} else if (choice == 3) {
								// ������ ĳ���
								System.out.println("�����Ե� ĳ����� ���캻��.");
								System.out.println("���� ����ִ�.");
							}

						} else if (choice == 3) {
							System.out.println("������ �����ϴ�.\n\n");
							break;
						}
					}
				}
			} else if (choice == 2) {

				// ���� ����
				System.out.println("\n\n������ �����Ͻðڽ��ϱ�? ��ȸ�� �� �� ��!!");
				System.out.println("[���н� ���ݱ����� ��� ������ �ʱ�ȭ�˴ϴ�] ");
				System.out.print("��¥�� �����Ͻðڽ��ϱ�? \n [1]�� [2]�ƴϿ� >> ");
				choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("\n������ �����ϼ���");
					System.out.println("[1] �ڻ�� [2] �ڳ��� [3] ������ [4] ���϶� [5] ������");
					System.out.print("�Է� >> ");
					int criminal = sc.nextInt();

					if (criminal == 3) {
						System.out.println("���� �˰� ����!!");
						System.out.println("������ PBK�� ģ�� ģ�� ���� ������ �Դϴ�.\n");
						System.out.println(
								"�������� PBK�� �������� �������� ���������� �ž��� ������ ���� " + "��Ȱ�� �ô޸��� ��, �ᱹ ģ�� PBK���� �ž��� ���� ������.");
						System.out.println("ó������ PBK�� �������� �ſ� ���� ������, ���� ������ ���� "
								+ " �������� ��Ȳ�� ���̷� �ڽ��� ���� ����ϰ� �����ϴ� PBK�� �µ��� ū �г븦 ������ �ȴ�.");
						System.out.println("�׷��� ����� PBK�� ������ ���� ������� ���ϰ� �䱸�ϰ� �̿� "
								+ "�������� ���� ���� �� ���ٰ� ������ ���� PBK�� ��ģ�弳�� �׸� �ͺ��Ѵ�.");
						System.out.println("�������� �г�� ���� �������� �׸� ���� ������ ���� ���� ��Ų ��"
								+ "�ָӴϼӿ��� ��ǰ�ǿ��� ���� ���ǿ� �η��� Ŀ��Į�� ���� ���� �浶���� �����Ͽ� " + "����� �̸��� �Ѵ�.");
						System.out.println("��Ȳ�� �״� Ŀ��Į�� �ްԽ� �����뿡 �����Ͽ� �ǹ� û�ҽð��� ���������� �ϰ� "
								+ "�ִ��� ���� ����� �����ڰ� �ö������ ������ ����� �ʵ��� ���踦 �����Ѵ�.");

						break;
					} else {
						System.out.println("���� �˰ſ� �����Ͽ����ϴ�...\n [���ݱ��� ����� ��� ����� �����Ǿ����ϴ�]");
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
				System.out.println("����Ǿ����ϴ�.");

			} else if (choice == 5) {
				// ����
				System.out.println("������ �����մϴ�.");
				break;
			}
		}

	}

}
