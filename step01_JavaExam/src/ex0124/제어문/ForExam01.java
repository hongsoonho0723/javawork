package ex0124.제어문;

public class ForExam01 {

	public static void main(String[] args) {

		//1부터 100까지 10행 10열 (for 문안에 for문)	
		for(int i =1; i<=100; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		
		// A~ Z까지 한줄 출력
		for(int j = 1; j<=26; j++) {
			char a = (char)(j+64);
			
			System.out.print(a);
			
		}System.out.println();
		
		// A~ Z까지 한줄 출력
				for(char ch ='A'; ch<='Z'; ch++) {
				
					
					System.out.print(ch);
					
				}System.out.println();
				
		
		// 1~10까지 합 구하기
		
		int sum=0;
		for(int k =1; k<=10; k++) {
			sum += k;
		}System.out.println(sum);
		
		
		//1~100사이의 7 배수만 출력
		
		for(int l =1; l<=100; l++) {
		if(l%7 == 0) {
			System.out.print(l+"\t"); }
		}
		
	}

}
