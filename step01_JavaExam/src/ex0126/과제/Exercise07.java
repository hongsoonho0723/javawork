package ex0126.과제;
//홍순호
// 1. 17 슬라이드 (교재 198확인문제 7번문제 동일)
public class Exercise07 {

	public static void main(String[] args) {

		int max = 0;

		int[] array = { 1, 5, 3, 8, 2 };
		int len = array.length;
		for (int i = 0; i < len; i++) {

			if (array[i] > max) {
				max = array[i];

			}

		}

		System.out.println("max: " + max);

	}

}
