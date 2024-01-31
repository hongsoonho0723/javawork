package ex0125.제어문;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DoWhileExam {

	public static void main(String[] agrs) {

		// 1~100까지 한줄 출력

		int i = 1;
		do {
			System.out.print(i++ + " ");

		} while (i <= 100);

		System.out.println("/n------------------------");

		// A~Z 한줄 출력

		i = 0;
		do {
			System.out.print((char) ('A' + i) + " ");
			i++;

		} while (i < 26);

		System.out.println("/n------------------------");

		i = 0;
		do {
			System.out.print((char) ('a' + i) + " ");
			i++;

		} while (i < 26);

		// 1~100 사이의 3의 배수 합
		System.out.println("/n------------------------");

		/*
		 * i = 1; int sum = 0; do { if (i % 3 == 0) {
		 * 
		 * sum += i;
		 * 
		 * i++; } } while (i <= 100);
		 * 
		 * System.out.println(sum);
		 */
		// 1~100까지 10행 10열로 출력(2중 while이용)
		System.out.println("/n------------------------");

		int a = 0;

		do {
			int b = 1;
			do {
				System.out.print((a + b) + " ");
				b++;
			} while (b <= 10);
			System.out.println();
			a += 10;

		} while (a < 100);

	}
}
