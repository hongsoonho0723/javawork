package ex0124.제어문;

public class ForExam2 {

	public static void main(String[] args) {

		//1부터 100까지 10행 10열 (for 문안에 for문)		
		for(int i =1; i<=100; i+=10) {
			
			
			for(int j = 1; j<=10; j++) {
				System.out.print(i+j-1  +"\t");
				
				
			}System.out.println();
		}
		
		
		
		/*구구단 출력
		
		2*1=2 3*1=3
		2*2=4
		
		
		*/
		/*
		 * for(int i =1; i<=100; i++) { System.out.print(i); }
		 */
		
		for(int i = 1; i<=9; i++) {
			
			for(int j =2; j<=9; j++) {
				
				System.out.print(j + "*"+i + "="+i*j+"\t");
				
				
			}
			System.out.println();
		}
		
		
		
		
		for(int i= 1; i<=10; i++) {
			
			for(int j=10; j-i>=1; j--) {
				System.out.print("*");
				
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
