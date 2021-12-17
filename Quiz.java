package CodingQuiz;

import java.io.File;

public class Quiz {

	public boolean quizKing(String txt, int sum) {
		// 기존에 있던 Tread 클래스 파일 삭제
//		Scanner sc = new Scanner(System.in);
//		System.out.println("(77*1)+(76*2)+(75*3)+...+(1*77)를 계산하는 코드를 작성하여 올바른 결과를 출력하시오");
//		System.out.println("단, int sum = 0; 선언되어있음, sum을 사용하여 엔터없이 한줄로 출력문까지 작성하면 됩니다.");
//		String txt = sc.nextLine();
		boolean correct = false;
		String address = "";

		if (sum == 0) {
			address = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\FailQuiz\\src\\CodingQuiz\\QuizRun.java";
		} else if (sum == 1) {
			address = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\FailQuiz\\src\\CodingQuiz\\QuizRun1.java";
		}
		// 문제 메소드 진행

		File file = new File(address);
		if (file.exists()) {
			if (file.delete()) {
				System.out.println("기존파일 삭제");
			}
		}

//		 딜레이
		try {

			Thread.sleep(2000); // 2초 대기

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		// 입력한 코드를 문자열로 Thread 클래스 내용으로 만들수 있게 넘겨줌
		QuizCreate test = new QuizCreate();
		test.createText(txt, sum, file);

		// 딜레이
		try {
			Thread.sleep(5000); // 1초 대기

			// 만들어진 Thread 클래스 파일 실행
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
			// 차용증 증거테이블에 저장
		}
//		sc.close();
		return correct;
	}

}
