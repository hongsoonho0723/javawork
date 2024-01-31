package ex0124.제어문;

public class ReportVer03 {

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
		
		/*
		 * if(average>=90) { grade='A'; }else if(average>=80) { grade='B'; }else
		 * if(average>=70) { grade='C'; }else if(average>=60) { grade='D'; }else {
		 * grade='E'; }
		 */
		
		//switch문으로 변경
		/*
		 * switch((int)(average/10)) { case 10,9 : grade='A'; break; case 8 : grade='B';
		 * break; case 7 : grade='C'; break; case 6 : grade='D'; break; default : grade
		 * = 'F';
		 * 
		 * 
		 * 
		 * }
		 */
		
		//switch문으로 변경
				
				  grade=switch((int)(average/10)) { 
				  case 10,9 -> 'A';  
				  case 8 ->'B';
				  case 7 -> {yield 'C';}  
				  //yield는 변수 grade 대신 사용가능 grade에 C값
				  case 6 -> 'D';  
				  default ->'F';
				  
				  
				  
				  };
				 
		
		
		
		
		
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
