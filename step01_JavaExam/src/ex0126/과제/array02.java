package ex0126.과제;
//홍순호
// 4. 22 슬라이드 로또
public class array02 {

	public static void main(String[] agrs) {

		int lotto[] = new int[6];
		array02 ar = new array02();
		ar.createnum(lotto);
		ar.check(lotto);
		ar.sorting(lotto);
		ar.printarray(lotto);

	}

	public void check(int lotto[]) {
		int len = lotto.length;
		for (int i = 0; i < len; i++) {

			for (int j = i + 1; j < len; j++)
				if (lotto[i] == lotto[j]) {

					this.createnum(lotto);

				}

		}

	}

	public void createnum(int lotto[]) {

		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

		}

	}

	public void sorting(int lotto[]) {

		for (int i = 0; i < 6; i++) {

			for (int j = i + 1; j < 6; j++)

				if (lotto[i] < lotto[j]) {

					swap(lotto, i, j);
				}

		}

	}

	private static void swap(int lotto[], int i, int j) {
		int temp;

		temp = lotto[i];
		lotto[i] = lotto[j];
		lotto[j] = temp;

	}

	public void printarray(int lotto[]) {
		System.out.println("이번주 로또 번호는!");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");

		}

	}

}
