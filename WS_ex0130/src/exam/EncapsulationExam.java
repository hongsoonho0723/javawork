package exam;

import java.util.Scanner;

public class EncapsulationExam {

	private String pw;
	private int weight;

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	// 몸무게검색
	public int getSearch(String pw) {
		if (this.isCheck(pw)) {
			return weight;
		} else {
			return -1;
		}
	}

	// 몸부게변경
	public void setupdate(int nweight, String pw) {
		if (this.isCheck(pw)) {
			weight = nweight;

		} else {
			System.out.println("비밀번호가 일치하지 않습니다");
		}

	}

	// 비밀번호변경

	public void setNpw(String pw, String npw) {
		if (this.isCheck(pw)) {

			this.pw = npw;
			System.out.println("비밀번호를 변경하였습니다");
		} else {
			System.out.println("비밀번호를 변경할수없습니다");
		}

	}

	// 비밀번호 체크
	private boolean isCheck(String pw) {
		if (this.pw.equals(pw)) {
			System.out.println("비밀번호가 일치합니다");
			return true;
		} else {
			System.out.println("비밀번호가 일치하지않습니다");
			return false;
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		EncapsulationExam encapsulationExam = new EncapsulationExam();

		encapsulationExam.setPw("1234");
		encapsulationExam.setWeight(50);
		/*
		 * System.out.println("비밀번호를 입력해주세요"); String pw = sc.next();
		 * System.out.println("몸무게를 입력해주세요"); int weight = sc.nextInt();
		 */
		while (run) {

			System.out.println("---------------------------------------------------------------------");
			System.out.println("1.몸무게 검색  | 2.몸무게 변경   | 3. 비밀번호 변경  |  9.종료");
			System.out.println("---------------------------------------------------------------------");
			System.out.print("선택> ");

			int i = sc.nextInt();
			if (i == 1) {

				System.out.println("비밀번호를 입력해주세요");
				String pw = sc.next();
				int re = encapsulationExam.getSearch(pw);

				if (re == 0) {
					System.out.println("비밀번호가 틀렸습니다");

				} else {
					System.out.println("몸무게는 " + encapsulationExam.weight + "입니다");
				}

			} else if (i == 2) {
				System.out.println("비밀번호를 입력해주세요");
				String pw1 = sc.next();
				System.out.println("변경할 몸무게를 입력해주세요");
				int weight = sc.nextInt();
				encapsulationExam.setupdate(weight, pw1);

			} else if (i == 3) {
				System.out.println("비밀번호를 입력해주세요");
				String pw2 = sc.next();
				System.out.println("변경할 비밀번호를 입력해주세요");
				String pw3 = sc.next();
				encapsulationExam.setNpw(pw2, pw3);

			} else if (i == 9) {

				System.out.println("프로그램 종료합니다");
			} else
				System.out.println("잘못입력하셨습니다 알맞는 숫자를 입력해주세요");

		}

	}

}
