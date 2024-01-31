package ex0123;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "홍순호";
		int la = 85;
		int en = 90;
		int ma = 100;
		int total;
		double average;
		char grade;
		
		total = la + en + ma;
		average= total/3.0;
		grade = average >=90 ? 'A' : 'F';		
		
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
