package CodingQuiz;

import java.io.File;

public class Quiz {

	public boolean quizKing(String txt, int sum) {
		// ������ �ִ� Tread Ŭ���� ���� ����
//		Scanner sc = new Scanner(System.in);
//		System.out.println("(77*1)+(76*2)+(75*3)+...+(1*77)�� ����ϴ� �ڵ带 �ۼ��Ͽ� �ùٸ� ����� ����Ͻÿ�");
//		System.out.println("��, int sum = 0; ����Ǿ�����, sum�� ����Ͽ� ���;��� ���ٷ� ��¹����� �ۼ��ϸ� �˴ϴ�.");
//		String txt = sc.nextLine();
		boolean correct = false;
		String address = "";

		if (sum == 0) {
			address = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\FailQuiz\\src\\CodingQuiz\\QuizRun.java";
		} else if (sum == 1) {
			address = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\FailQuiz\\src\\CodingQuiz\\QuizRun1.java";
		}
		// ���� �޼ҵ� ����

		File file = new File(address);
		if (file.exists()) {
			if (file.delete()) {
				System.out.println("�������� ����");
			}
		}

//		 ������
		try {

			Thread.sleep(2000); // 2�� ���

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		// �Է��� �ڵ带 ���ڿ��� Thread Ŭ���� �������� ����� �ְ� �Ѱ���
		QuizCreate test = new QuizCreate();
		test.createText(txt, sum, file);

		// ������
		try {
			Thread.sleep(5000); // 1�� ���

			// ������� Thread Ŭ���� ���� ����
			if (sum == 0) {
				QuizRun na = new QuizRun();
				sum = na.run();
			} else if (sum == 1) {
				QuizRun1 na1 = new QuizRun1();
				sum = na1.run();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (sum == 79079 || sum == 3628800) {
			correct = true;
			// ������ �������̺� ����
		}
//		sc.close();
		return correct;
	}

}
