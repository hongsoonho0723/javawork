package ex0124.제어문;

public class Grade {

	public static void main(String[] args) {
		String name = "홍순호";
		//국어 영어 수학 점수를 45~100사이의 난수로 저장
		int la = (int)(Math.random()*56+45);
		int en = (int)(Math.random()*56+45);
		int ma = (int)(Math.random()*56+45);
		int total;
		double average;
		char grade;
		
		total = la + en + ma;
		average= total/3.0;
		
		//90이상이면 A 80-89사이면  b 70 79 c 60 69 d 나며지 e
		
		if(average>=90) {
			grade='A';
		}else if(average>=80) {
			grade='B';
		}else if(average>=70) {
			grade='C';
		}else if(average>=60) {
			grade='D';
		}else {
			grade='E';
		}
		
			
		
		System.out.println("이름 : "+name); 
		System.out.println();
		System.out.println("국어점수 : "+la); 
		System.out.println();
		System.out.println("영어점수 : "+en); 
		System.out.println();
		System.out.println("수학점수 : "+ma);
		System.out.println();
		System.out.println("총점 : "+total);
		System.out.println();
		average*=100;
		System.out.println("평균 : "+(int)average/100.0); 
		
		System.out.println();
		System.out.println("성적 : "+grade); 
		
	}

}
