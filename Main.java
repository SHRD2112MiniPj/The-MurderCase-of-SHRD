import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// �ƽ�Ű ��Ʈ�� ������ ���λ�� ����� BGM(�����ϰ� ��ο�)'
		MurderDTO dto = new MurderDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� �� ó�� �̽��׸��� ������ ���� ��...");
		dto.timelate(2);
		System.out.println("���� ���� �������� ���λ�ǿ� ���� ������ ���Դ�!");
		dto.timelate(1);
		System.out.println("����� ���� ����� ������ ������ ��� ����!");
		dto.timelate(1);
		System.out.println("�̶� ���� ���ᰡ ����� �̸��� �θ���!!\n");
		dto.timelate(2);

		int choice = 0;
		int temp = 0;

		while (true) {
			System.out.println("���� ������ �����ڸ� ������ ����� �̸���??");
			System.out.println("[1] ȸ������ [2] �α���");
			System.out.print("�Է� >> ");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("ȸ�� ����! ���ο� ����� ȯ���մϴ�!!");
				System.out.print("����� ���̵� �Է��ϼ��� >> ");
				String id = sc.next();
				System.out.print("��й�ȣ�� �Է��ϼ��� >> ");
				String pw = sc.next();
				System.out.print("����� �̸��� �Է��ϼ��� >> ");
				String nick = sc.next();
			} else if (choice == 2) {
				System.out.println("����� ȯ���մϴ�! �α����� ���ּ���!");
				System.out.print("���̵� �Է��ϼ��� >> ");
				String id = sc.next();
				System.out.print("��й�ȣ�� �Է��ϼ��� >> ");
				String pw = sc.next();
				// System.out.println(nickname+" ����� �ݰ����ϴ�!");
				// String nickname = murder.login(id, pw);

				if (temp > 0) {
					System.out.println("�α��� ����!");
					break;
				} else {
					System.out.println("�α��� ����!");
				}
				break;
			}
		}

		while (true) {
			System.out.println("[1]�����ϱ� [2]�ҷ����� [3]��ŷ����");
			System.out.print("�Է� >> ");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("���ο� ������ �����մϴ�.");
				break;
			} else if (choice == 2) {
				System.out.println("���� ������ �̾ �����մϴ�.");
				// �ҷ����� �޼ҵ�
				break;
			} else if (choice == 3) {
				System.out.println("��ŷ�� Ȯ���մϴ�");
				// get.rank();?

			}

		}

		// opening
		System.out.println("�� �������� ������ ����� ��...");
		System.out.println("����� ��ģ ���� �̲��� �������� �ö󰬴�..");
		System.out.println("�ε�!!!!!!!"); // BGM + ��ü �ƽ�Ű��Ʈ

		System.out.println("������ �п��� ��Ÿ �������� �˸��޴� ���翴�� PBK");
		System.out.println("�״� �δ��� �ְ����� �߰ߵǾ���!");
		System.out.println("��Ȳ�� ����� �ǿ���� ��踦 ����߸��� ��ü ������ �ٰ����µ�...");

		while (true) {

			System.out.println("��ü�� Ȯ���Ͻðڽ��ϱ�?");
			System.out.println("[1] ���׸޼��� [2] ����� ��ó [3] �������� [4] �ʿ� ���� ����ƽ [5] ���̾� ���� [6] �Ѿ��");
			System.out.print("�Է� >> ");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("����� ��ü ������ �ٰ�����. PBK�� �� �þ��� �� ���� � �޼����� �ִ�");
				// �ƽ�Ű ��Ʈ �޼��� secu ���� ���� ���...
				System.out.println("�ױ����� ���ο� ���� ������ �������� ���� ����...");
				// ���׸޼����� �����ֱ⸸ �ϰ� ���̺� ���� X
			} else if (choice == 2) {
				System.out.println("�����ڴ� ���帰 ä �׾��ִ�. ������� ���캸�� ū Ȥ�� �ھ��ִ�. " + "������ �ڿ��� �׸� ������ ���ϱ�?");
				System.out.println("�׷��� ���� �� �ֺ��� ��ó�� ����� �ʿ� ���� ���ڱ��� ���� �����δ� " + "���������� ���������� �𸥴�.");
				// �ʱ����� ����� ���� ��ó
			} else if (choice == 3) {
				System.out.println(
						"������ ��ü ��ó�� ��׷��� ������ ���� ���ڰ� �κη��� �ִ�. ����� " + "�̿� ����ä ���� ���� ���� ��½ �鿩�� ���� ��¦�̴� �� �ð谡 ���δ�.");
				System.out.println("���� ���� ���ڿ� �ո�ð��� �� �ʹ�.");
				// �ʱ� ���� �������� �� �� �ð�
			} else if (choice == 4) {
				System.out.println("����� �򰥸����� ���ϰ� �ٸ� ���� �ڱ��� �������� ���ǿ� �����ִ�. �Լ� ����� " + "�ڱ�... �̰��� �����ϱ�?");
				// �ʱ� ���� ����ƽ �ڱ�
			} else if (choice == 5) {
				System.out.println("�����ڴ� �ױ��� � ���ڿ� ����ģ ���ϱ�? ���� ������ ��ó�� �� �ٸ� ������ ���δ�. "
						+ " ��Ҽӿ����� �� ���� ���� ���� �ϳ� ���� ���̴� ���̾ƹ����� �߰��Ѵ�. ����� ��ĩ �����.");
				// �ʱ� ���� ���̾� ����
			} else if (choice == 6) {
				System.out.println("�ٷ� ������ �����մϴ�. �⺻ ������ ������ ���ź��⸦ ���� Ȯ���� �� �ֽ��ϴ�.");
				break; // skip
			}
			
		}
		
		System.out.println("����� ��� ������ �߽���ä ���󿡼� �������� ��ܿ��� �������� �Ű��Ѵ�.");
		System.out.println("Ž���� �����մϴ�. ����� �����ڰ� �ִ� ��Ҹ� �����Ͽ� �����ڸ� �߱��� �� �ֽ��ϴ�. "
				+ "�߱��� ���� �������Ÿ� �߰��ϰų� �� ��Ҹ� Ž���Ͽ� �������Ÿ� �߰��� �� �ֽ��ϴ�.");
		
		while (true) {
			System.out.println("����� ������ �����߽��ϴ�.");
			System.out.println("[1] Ž�� [2] �������� [3] ���ź��� [4] ���� [5] ���� ");
			System.out.print("�Է� >> ");
			choice = sc.nextInt();

			if (choice == 1) {
				// Ž��
				System.out.println("Ž���� ��Ҹ� �����ϼ���.");
				System.out.println("[1] �ްԽ� [2] ����� [3] ���� [4] ���ǽ� [5] ������");
				System.out.print("Ž���� ��� �Է� >> ");
				choice = sc.nextInt();

				if (choice == 1) {
					// �ްԽ�
					while (true) {
						System.out.println("�ްԽǿ� �ڻ�� �л��� �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						choice = sc.nextInt();
						if (choice == 1) {
								//���ΰ��� ��ȭ - �⺻����
							System.out.println(dto.nickname()+"��� �л����� ������ �Ѵ�.");
							System.out.println(dto.nickname()+" : "+"����� PBK ��ü ���ʹ߰��� �Դϱ�?");
							System.out.println("��� :��... 10�� 40�� �Ѿ ���� ������ PBK��������...�ý��ϴ�....");
//							 ���ΰ��� ��ȭ
//							 boolean true false ��ȯ
//							 true(���Ű� ���� ��)
							// �߰�����
							System.out.println(dto.nickname()+" : "+"���󿡴� �� �ö󰡼̳���?");
							System.out.println("��� : PBK������ ��ǥ �ڷḦ �غ��ϴٰ� �ٶ��� ���� �ö󰬴µ�...");
							System.out.println(dto.nickname()+" : "+"��� �����ڿ��� ���谡 ����ϱ�?");
							System.out.println("��� : ��? ���� ���� �ǽ��Ͻó���? ���� �������� ���� ���� ������Ʈ ������ �߽��ϴ�..");
							System.out.println("������ ���� ���ڸ��� �ֽñ�� ����ؼ� ���� �������� ���ϰ� �ִµ� �������� ���̸�");
							System.out.println("���� ���� �̵��� �������? ���� ���� ������ ���ؼ� ���� ���忡 �����ϰ� ������... ���");
							System.out.println("�۾��� ������ ���� ����� ������.. �������� ������ �� �ʿ��� ���Դϴ�!! ���� ����ؿ�!");
							System.out.println(dto.nickname()+" : "+"9�� 30�к��� 10�ñ��� ��𿡼� ������ �߽��ϱ�?");
							System.out.println("��� : 8�� 40�� ���� ��ü �߰� ������ ���� ���⼭ ȥ�� �۾����̾����ϴ�.. ");
							System.out.println(dto.nickname()+" : "+"(ȥ�ڼ� �۾��ߴ�... ������ ���� ����.)");
							System.out.println("��� : ��ҿ� �ڳ���������̶� PBK�������� �����ϴ� ���� �ý��ϴ�... �ѹ� ����鿡�� ������� �����.. ");
							System.out.println(dto.nickname()+" : "+"(�ڳ��� ������� �̾߱⸦ �ؾ߰ڱ�..)");
							
						} else if (choice == 2) {
							// ����ã��
							System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1]������ ���� [2]�������� [3]�޽Ŀ� ��Ʈ ");
							System.out.print("�Է� >> ");
							choice = sc.nextInt();
							if (choice == 1) {
								// ������
								System.out.println("������ ������ ���캻��.");
								System.out.println("�ƹ��͵� ����.");

							} else if (choice == 2) {
								// ��������-����
								System.out.println("�ްԽ� ���������� ���캻��.");
								System.out.println("���� �ǽɽ������ �ִ�.");
								// QuizCafe() ==true
								if (temp > 0) {
									System.out.println("���Ÿ� ȹ��!!");
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
							System.out.println("������ �����ϴ�.");
							break;
						}
					}
				} else if (choice == 2) {
					// �����
					System.out.println("����ǿ� �ڳ��� ������ �ֽ��ϴ�.");
					System.out.println("������ �Ͻðڽ��ϱ�?");
					System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
					System.out.print("�Է� >> ");
					choice = sc.nextInt();

					if (choice == 1) {
						// ���ΰ��� ��ȭ
						//���ΰ��� ��ȭ - �⺻����
					System.out.println(dto.nickname()+"�ڳ��� ���忡�� ������ �Ѵ�.");
					System.out.println(dto.nickname()+" : "+"�����, ���� � �ص� �ǰڽ��ϱ�?(��... �°� ��ǰ��.. �ſ� ȭ���� ��Ÿ���̱�..");
					System.out.println("���� : (��Į����) ���� ���� �ǽ��Ͻô°ǰ���? ���ƿ�. ������ �������.");
//					 ���ΰ��� ��ȭ
//					 boolean true false ��ȯ
//					 true(���Ű� ���� ��)
					// �߰�����
					System.out.println(dto.nickname()+" : "+"�����ڴ� � ����Դϱ�?");
					System.out.println("���� : �� �ǹ����� ������ ���� ���߾��. �׷��� ������ ��������.");
					System.out.println(dto.nickname()+" : "+"��� �����ڿ��� ���谡 ����ϱ�?");
					System.out.println("���� : �����ϰ� ���ϸ� �� ����� ������. �� ������ ������ ���� �߰ŵ��.");
					System.out.println("������ �׷��Ϸ� ����� ������ �ʾƿ�. ���� ������ ���� ����̶� ���� �׷��ʿ䵵 �����.");
					System.out.println(dto.nickname()+" : "+"9�� 30�к��� 10�ñ��� ��𿡼� ������ �߽��ϱ�?");
					System.out.println("���� : ���� ��� ����ǿ� �־����. �߿��� ������Ʈ�� �� �־ ��û�������� ����ǿ��� ȸ�����̾����.");
					System.out.println(dto.nickname()+" : "+"(������ �ֱ�...������ �ٸ� Ʈ���� �������� �־�!)");
					System.out.println("���� : ���� �� ������ �ǽɰ���. �̸��� �𸣰ڴµ�, �� ��� ������.");
					System.out.println(dto.nickname()+" : "+"����? �� �ǹ��� �����̿�?");
					System.out.println("���� : �� ��� PBK�� ģ�߾��. �ٵ� ���ݾ�? ���ܹ��� ���������. ����� ����.");
					
					} else if (choice == 2) {
						// ����ã��
						System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
						System.out.println("[1]����� ���� ��ǻ��  [2] Ŀ�ٶ� å��  [3] å�� ���� ");
						System.out.print("�Է� >> ");
						choice = sc.nextInt();

						if (choice == 1) {
							// ����� ��ǻ��-����
							System.out.println("����� ������ǻ�Ϳ� �����մϴ�.");
							// QuizKing �޼ҵ�
							if (temp > 0) {
								System.out.println("���Ÿ� ȹ��!!");
							} else {
								System.out.println("���� ȹ�� ����!!");
							}
						} else if (choice == 2) {
							// å��
							System.out.println("Ŀ�ٶ� å���� ���캻��.");
							System.out.println("å���� ��û ����.");

						} else if (choice == 3) {
							// ����� å�� ����
							System.out.println("���� å���� ������ �����.");
							// QuizKing2 �޼ҵ�
							if (temp > 0) {
								System.out.println("���Ÿ� ȹ��!!");
							} else {
								System.out.println("���� ȹ�� ����!!");
							}
						}
					} else if (choice == 3) {
						System.out.println("������ �����ϴ�.");
						break;
					}
				}
			} else if (choice == 3) {
				// ����
				System.out.println("���ǿ� ������ ��� �ֽ��ϴ�.");
				System.out.println("������ �Ͻðڽ��ϱ�?");
				System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
				System.out.print("�Է� >> ");
				choice = sc.nextInt();
				if (choice == 1) {
					// ���ΰ��� ��ȭ
					//���ΰ��� ��ȭ - �⺻����
				System.out.println(dto.nickname()+"������ ��񿡰� ������ �Ѵ�.");
				System.out.println(dto.nickname()+" : "+"��������, ���� � �ص� �ǰڽ��ϱ�?(��ġ�� ũ��... �������� ���� ����ϱ�.)");
				System.out.println("���� : (�ǰ��� ǥ��) �������̽ʴϱ�..? ���� ������.. ��ģ���� �׾��ٰ��.");
//				 ���ΰ��� ��ȭ
//				 boolean true false ��ȯ
//				 true(���Ű� ���� ��)
				// �߰�����
				System.out.println(dto.nickname()+" : "+"�����ڿ��� ����� ����ϱ�?");
				System.out.println("���� : ���� PBK�� �ʵ��б��� ���� ģ���Դϴ�. ���� ���� ������ �ƴϿ���.");
				System.out.println(dto.nickname()+" : "+"�׷�����, 9�� �ݺ��� 10�ñ��� ������ �ϼ���?");
				System.out.println("���� : ���� �ǹ� ��ü�� �������̾����ϴ�. 1������ 4������... ���ǽǿ����� ���϶� �������� ������, �����ǿ��� ������ �������� �־����ϴ�.");
				System.out.println("���� ���϶� �������� �ǽɵ˴ϴ�. �׺� ������ PBK�� ���̹��̿���.");
				System.out.println(dto.nickname()+" : "+"���϶� �����԰� PBK ���̰� ���� �ʳ���?");
				System.out.println("���� : ��, �ֱٿ��� �� �� �����Ϸ��� �ֽ�µ�, PBK�� �Ȱɷ� �˰� �ֽ��ϴ�. ");
				System.out.println(dto.nickname()+" : "+"(�ϴ� ������ ���̴� ��... ������ �ٸ� ���𰡴� ������?)");
				System.out.println("���� : ���� PBK�� ������ ���� �޾ҽ��ϴ�. ���� ������ �ƴմϴ�.");
				System.out.println(dto.nickname()+" : "+"Ȥ�� ���� ���� �׻� ����ֽ��ϱ�? ���� ������ �Ͻó���?");
				System.out.println("���� : �ʿ��� ���� ������.. ������ �����ǿ��� �մϴ�.");
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
						System.out.println("�������� ������ �����ִ�.");
						System.out.println("�߿��غ��̴� ������ ���δ�.");

						// QuizeSecu�޼ҵ�
						if (temp > 0) {
							System.out.println("���Ÿ� ȹ��!!");
						} else {
							System.out.println("���� ȹ�� ����!!");
						}
					}

				} else if (choice == 3) {
					System.out.println("������ �����ϴ�.");
					break;

				}
			} else if (choice == 4) {
				// ���ǽ�
				System.out.println("���ǽǿ� ���϶� �������� �ֽ��ϴ�.");
				System.out.println("������ �Ͻðڽ��ϱ�?");
				System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
				System.out.print("�Է� >> ");
				choice = sc.nextInt();

				if (choice == 1) {
					// ���ΰ��� ��ȭ
					System.out.println(dto.nickname()+"���϶� �����Կ��� ������ �Ѵ�.");
					System.out.println(dto.nickname()+" : "+"���϶�, ���� � �ص� �ǰڽ��ϱ�?(�Ҹ��� ���ƺ��̴� ��)");
					System.out.println("�϶� : (¥������ ǥ��) Ȥ�� PBK������ ���̳���?");
//					 ���ΰ��� ��ȭ
//					 boolean true false ��ȯ
//					 true(���Ű� ���� ��)
					// �߰�����
					System.out.println(dto.nickname()+" : "+"�����ڿ��� ����� ����ϱ�?");
					System.out.println("�϶� : ���� PBK�� ���е�â�̿���. ������ ���̴� �����Ҿ��.");
					System.out.println(dto.nickname()+" : "+"��, ������ϴ�. 9�� �ݺ��� 10�ñ��� ������ �ϼ���?");
					System.out.println("�϶� : ��ȩ�� ����� ���� ��� ģ���� ��ȭ���̾����. ģ������ �������.");
					System.out.println("������ ������ �ð��� ���� ������ �������� �����غ��°� ���?");
					System.out.println(dto.nickname()+" : "+"������ ������? �׺��� �� �ǽ��Ͻô� ����?");
					System.out.println("�϶� : �Ʊ� ���� �ð��� ��� PBK�� ��û ã������. ��ҿ��� ���� �Ѿƴٳ��.");
					System.out.println(dto.nickname()+" : "+"���������� ����ġ����?");
					System.out.println("�϶� : ��. �� ����� ���� ���ְ���, ����Ƿ� ���ְ��� �� ������. �ٵ� �׻���� ģ�ؿ�. PBK��..");
					System.out.println(dto.nickname()+" : "+"���󿡴� �Ȱ��Űǰ���? ��ȭ�Ҷ�?");
					System.out.println("�϶� : ���� �Ȱ���. �űⰡ�� ����Ǵ� ����鸸 �־.");
				} else if (choice == 2) {
					// ����ã��
					System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
					System.out.println("[1]���ǽ� ��ǻ�� [2]���ǽ� å�� ��  [3] �л��� å�� ��  ");
					System.out.print("�Է� >> ");
					choice = sc.nextInt();

					if (choice == 1) {
						// ���ǽ� ��ǻ��
						System.out.println("���ǽ� ��ǻ�Ϳ� �����غ���.");
						System.out.println("������ ���� ��ȭ������ �ִ�.");

					} else if (choice == 2) {
						// ���ǽ� å�� ��
						System.out.println("���ǽ� å�� ���� ���캻��.");
						// QuizeLec�޼ҵ�
						if (temp > 0) {
							System.out.println("���Ÿ� ȹ��!!");
						} else {
							System.out.println("���� ȹ�� ����!!");
						}

					} else if (choice == 3) {
						// �л��� å�� ��
						System.out.println("�л��� å�� ���� ���캻��.");
						System.out.println("�л��� ������� �׿��ִ�.");

					}
				} else if (choice == 3) {
					System.out.println("������ �����ϴ�.");
					break;

				}
			} else if (choice == 5) {
				// ������
				System.out.println("�����ǿ� ������ �������� �ֽ��ϴ�.");
				System.out.println("������ �Ͻðڽ��ϱ�?");
				System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
				System.out.print("�Է� >> ");

				choice = sc.nextInt();
				if (choice == 1) {
					// ���ΰ��� ��ȭ
					System.out.println(dto.nickname()+"������ �����Կ��� ������ �Ѵ�.");
					System.out.println(dto.nickname()+" : "+"��������, ���� � �ص� �ǰڽ��ϱ�?(ȭ���� ���ϳ�..)");
					System.out.println("���� : (������ �긮��..) ����� ������ �� ����ּ���...�ʹ� ���ۿ�...����");
//					 ���ΰ��� ��ȭ
//					 boolean true false ��ȯ
//					 true(���Ű� ���� ��)
					// �߰�����
					System.out.println(dto.nickname()+" : "+"�����ڿ��� ����� ����ϱ�?");
					System.out.println("���� : ���� PBK �� �ʹ� �����ؿ�. �����ϰ� ���� ���� ���� �����߾��....");
					System.out.println(dto.nickname()+" : "+"9�� �ݺ��� 10�ñ��� ������ �ϼ���?");
					System.out.println("���� : �� ���... 9�� 20�п� PBK �������� ������... ������ ����! �׋������� ��ư�̴ٱ���!");
					System.out.println("����... ����л��� �ǽɰ���.. ��� PBK������ �ʹ� ����� ���� �߰ŵ��..");
					System.out.println(dto.nickname()+" : "+"��.. �׷��ٸ� �������� ����ִ� ������ ������ ����ڽñ���.");
					System.out.println("���� : �׷��� �����Ͻô� �� ���ΰ� �ǳ׿�.. ���� �������� ������ ������ ���ٴ�.. ���� �⻵��..");
					System.out.println(dto.nickname()+" : "+"(����..�������ΰ�?)... �� �׸��� ��� ������? �� ���Ŀ�");
					System.out.println("���� : �� �ٷ� �����ǿ� ���ƿ� ��� �۾��߾��. �� ��ǻ�� ������ ���ŵ� ���ƿ�!");
					System.out.println(dto.nickname()+" : "+"(�� �����.. ���� �ǽ��� �Ǵ±�) �������� �����̳���?");
					System.out.println("���� : ��. �۾��߿� ��� �����ǿ� ����������. ������ ��������� �������� �ʴµ�....");
				} else if (choice == 2) {
					// ����ã��
					System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
					System.out.println("[1]�����Ե� å��  [2]������  [3]������ ĳ��� ");
					System.out.print("�Է� >> ");
					choice = sc.nextInt();

					if (choice == 1) {
						// �����Ե� å��
						System.out.println("�����Ե� å���� ���캻��.");
						System.out.println("������ ������ �ܿ��� ��� ����� ������ ���δ�.");
						// QuizTeach2 �ӱ���
						if (temp > 0) {
							System.out.println("���Ÿ� ȹ��!!");
						} else {
							System.out.println("���� ȹ�� ����!!");
						}

					} else if (choice == 2) {
						// ������
						System.out.println("�������� �����.");
						System.out.println("����ִ� ���� �ִ�.");
						// QuizTeach ������ ����
						if (temp > 0) {
							System.out.println("���Ÿ� ȹ��!!");
						} else {
							System.out.println("���� ȹ�� ����!!");
						}

					} else if (choice == 3) {
						// ������ ĳ���
						System.out.println("�����Ե� ĳ����� ���캻��.");
						System.out.println("���� ����ִ�.");
					}

				} else if (choice == 3) {
					System.out.println("������ �����ϴ�.");
					break;
				}

			} else if (choice == 2) {
				// ���� ����
				System.out.println("������ �����Ͻðڽ��ϱ�?");
				System.out.println("[1] �ڻ�� [2] �ڳ��� [3] ������ [4] ���϶� [5] ������");
				System.out.print("�Է� >> ");
				int criminal = sc.nextInt();

				if (criminal == 3) {
					System.out.println("���� �˰� ����!!");
					System.out.println("������ PBK�� ģ�� ģ�� ���� ������ �Դϴ�.");
					System.out
							.println("�������� PBK�� �������� �������� ���������� �ž��� ������ ���� " + "��Ȱ�� �ô޸��� ��, �ᱹ ģ�� PBK���� �ž��� ���� ������.");
					System.out.println("ó������ PBK�� �������� �ſ� ���� ������, ���� ������ ���� "
							+ " �������� ��Ȳ�� ���̷� �ڽ��� ���� ����ϰ� �����ϴ� PBK�� �µ��� ū �г븦 ������ �ȴ�.");
					System.out.println(
							"�׷��� ����� PBK�� ������ ���� ������� ���ϰ� �䱸�ϰ� �̿� " + "�������� ���� ���� �� ���ٰ� ������ ���� PBK�� ��ģ�弳�� �׸� �ͺ��Ѵ�.");
					System.out.println("�������� �г�� ���� �������� �׸� ���� ������ ���� ���� ��Ų ��"
							+ "�ָӴϼӿ��� ��ǰ�ǿ��� ���� ���ǿ� �η��� Ŀ��Į�� ���� ���� �浶���� �����Ͽ� " + "����� �̸��� �Ѵ�.");
					System.out.println("��Ȳ�� �״� Ŀ��Į�� �ްԽ� �����뿡 �����Ͽ� �ǹ� û�ҽð��� ���������� �ϰ� "
							+ "�ִ��� ���� ����� �����ڰ� �ö������ ������ ����� �ʵ��� ���踦 �����Ѵ�.");

				} ///
					// ���н�

				///
			} else if (choice == 3) {
				// ���� ����
				// showClue
			} else if (choice == 4) {
				// ����
				// save
				System.out.println("����Ǿ����ϴ�.");
			} else if (choice == 5) {
				// ����
				System.out.println("������ �����մϴ�.");
				break;
			}
		}
	}
}
