package ex0126.과제;

import java.util.Arrays;

//홍순호
//3. 21 슬라이드 정렬

public class array01 {

	public static void main(String[] args) {

		int arr[] = { 5, 7, 1, 2, 4, 3, 8, 9, 6, 10 };
		System.out.println("정렬전 배열 : " + Arrays.toString(arr) + "\n");
		int len = arr.length;
		System.out.println("선택정렬을 통한 올림차순");
		for (int i = 0; i < len - 1; i++) {
			int min = i;

			for (int j = i + 1; j < len; j++) {

				if (arr[min] > arr[j]) {
					min = j;

				}

			}

			swap(arr, min, i);

		}
		System.out.println("정렬 후 배열 : " + Arrays.toString(arr));
		/*
		 * for (int i = 0; i < len; i++) { System.out.print(arr[i] + " "); }
		 */

		System.out.println("\n-----------------------------");
		System.out.println("삽입정렬을 통한 내림차순");
		for (int i = 1; i < len; i++) {

			for (int j = 0; j < i; j++) {

				if (arr[j] < arr[i]) {

					swap(arr, i, j);

				}

			}

		}

		System.out.println("정렬 후 배열 : " + Arrays.toString(arr));
		System.out.println("\n-----------------------------");

		System.out.println("버블정렬을 통한 올림차순");

		for (int i = 0; i < len; i++) {

			for (int j = 0; j < len - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					swap(arr, j, j + 1);

				}

			}

		}

		System.out.println("정렬 전 배열 : " + Arrays.toString(arr));
		System.out.println("\n-----------------------------");
	}

	private static void swap(int[] arr, int i, int j) {
		int temp;

		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
