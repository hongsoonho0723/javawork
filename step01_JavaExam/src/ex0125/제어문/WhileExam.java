package ex0125.제어문;

public class WhileExam {

	public static void main(String[] agrs) {

		// 1~100까지 한줄 출력

		int a = 1;
		int k = 1;

		while (a <= 100) {

			System.out.print(a);
			a++;
			System.out.print(k++);

		}
		System.out.println();
		// A~Z 한줄 출력
		int b = 65;
		while (b <= 90) {
			System.out.print((char) b);
			b++;

		}

		char j = 'A';
		while (j <= 'Z') {
			System.out.print(j++ + " ");

		}

		System.out.println();
		// 1~100 사이의 3의 배수 합

		int c = 1;
		int d = 0;
		while (c <= 100) {
			if (c % 3 == 0)
				d += c;

			c++;

		}
		System.out.println(d);

		// 1~100까지 10행 10열로 출력(2중 while이용)
		int e = 0;
		while (e < 10) {

			int f = 1;
			while (f <= 10) {
				System.out.print(10*e+f +" ");
				f++;

			}
			System.out.println();
			e++;
		}

	}
}
