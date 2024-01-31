package ex0126.과제;
//홍순호
//2. 19 ~ 20 슬라이드 (교재 198확인문제 9번문제 동일)
import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] agrs) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 수를 입력해주세요");
		studentNum = scanner.nextInt();
		scores = new int[studentNum];

		int total = 0, average = 0, max = 0;

		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 : 2.점수입력 : 3점수리스트 : 4.분석 : 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			System.out.println("선택> " + selectNo);

			if (selectNo == 1) {
				// 작성 위치
				System.out.println("학생수> " + studentNum);

			} else if (selectNo == 2) {
				// 작성위치
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();

				}

			} else if (selectNo == 3) {
				// 작성위치
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);

				}

			} else if (selectNo == 4) {
				// 작성위치
				for (int i = 0; i < studentNum; i++) {
					total += scores[i];
					if (scores[i] > max)
						max = scores[i];

				}

				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + (double)( total / studentNum));

			} else if (selectNo == 5) {
				run = false;

			}else {
				System.out.println("잘못입력하셨습니다 1~5사이 번호를 입력해주세요");
				
			}

		}

		System.out.println("프로그램 종료");

	}
}
