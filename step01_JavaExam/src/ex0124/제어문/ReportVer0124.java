package ex0124.제어문;

//author 홍순호

public class ReportVer0124 {

	public static void main(String[] args) {

		///// 1

		for (int i = 1; i <= 5; i++) {

			for (int j = 0; i - j >= 1; j++) {

				System.out.print("★");

			}
			System.out.println();

		}
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");

		//// 2
		for (int i = 1; i <= 5; i++) {

			for (int j = 6; j - i >= 1; j--) {

				System.out.print("★");

			}
			System.out.println();

		}
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
		///// 3

		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("★");
			}
			System.out.println();

		}
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");

		///// 4

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("★");
			}
			System.out.println();

		}

		// 문제 4
		System.out.println();
		System.out.println("문제 4번");

		for (;;) {

			int a = (int) (Math.random() * 6 + 1);
			int b = (int) (Math.random() * 6 + 1);
			System.out.println("a= " + a + " b= " + b + "\t" + "(" + a + "," + b + ")");

			if (a + b == 5)
				break;

		}

		System.out.println();
		System.out.println("문제 5번");

		// 문제 5

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println("(" + x + "," + y + ")");
				}

			}

		}

	}

}