package HW0213;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class HW2 {

	// 이름, 몸무게, 비밀번호
	HW2() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FileOutputStream fos = null;
		FileInputStream fis = null;

		// try {

		String point = ":";
		while (true) {
			System.out.println("========================================================");
			System.out.println("  1. 프로필 저장 	 2. 프로필 불러오기 	3. 종료  ");
			System.out.println("========================================================");
			String st = br.readLine();

			switch (st) {

			case "1":
				System.out.println("이름을 입력해주세요");
				String name = br.readLine();
				System.out.println("몸무게를 입력해주세요");
				String weight = br.readLine();
				System.out.println("비밀번호를 입력해주세요");
				String password = br.readLine();

				fos = new FileOutputStream("C:\\Edu\\java\\javawork\\HW01\\src\\HW0213\\" + name + ".txt", true);
				fos.write(weight.getBytes());
				fos.write(point.getBytes());
				fos.write(password.getBytes());
				System.out.println("프로필 저장 성공!!!");
				break;

			case "2":

				System.out.println("이름을 입력해주세요");
				name = br.readLine();
				BufferedReader bufferedreader = new BufferedReader(
						new FileReader("C:\\Edu\\java\\javawork\\HW01\\src\\HW0213\\" + name + ".txt"));

				String data = null;

				while ((data = bufferedreader.readLine()) != null) {
					System.out.println(data);

				}

				break;

			case "3":
				System.out.println("프로그램을 종료");
				return;

			}

		}

	}

	public static void main(String[] args) throws Exception {

		new HW2();
	}

}
