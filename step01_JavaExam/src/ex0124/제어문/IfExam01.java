package ex0124.제어문;

public class IfExam01 {

	public static void main(String[] args) {
		//임의의 정수 변수를 선언하고 초기화 한다
		
		int a=5;
		
		//선언된 변수의 값이 짝수이면 짝수 홀수이면 홀수를 출력
		if(a%2 == 0) {
			System.out.println(a+"는 짝수");
			
		} else {

			System.out.println(a+"는 홀수");
			
		}
		
		System.out.println("-----------------");
		
		for(int i = 1; i<10; i++) {
		int no =(int)( Math.random()*10+1);
		System.out.println(no);
		
		//1~10사이 숫자
		//Math.random() * 경우의수 + 최솟값;
		
		}
		
	}

}
