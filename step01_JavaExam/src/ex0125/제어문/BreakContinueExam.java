package ex0125.제어문;

public class BreakContinueExam {

	public static void main(String[] agrs) {

		outer: for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 3; b++) {

				// if(b==2)continue;
				// if(b==2)break;
				if (b == 2)
					break outer;

				System.out.print(b + " ");
			}

			System.out.println();
		} // for End
		System.out.println("\n구구단 ------------------");
		
		
		
		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {

				System.out.print(j + "*" + i + "=" + i * j + "\t");

			}
			System.out.println();
		}
		
		
		//5단만 빼고 찍기
		
		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {
				if(j==5)continue;
				System.out.print(j + " * " + i + " = " + i * j + "\t");

			}
			System.out.println();
		}
		
		
		//5단까지만 찍기
		
		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {
				if(j==6)break;
				System.out.print(j + " * " + i + " = " + i * j + "\t");

			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
