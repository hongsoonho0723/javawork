package ex0125.과제;

import java.util.Scanner;

//홍순호
//성적프로그램 ver3



public class ReportVer02 {

	public static void main(String [] agrs) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			
			
			
		System.out.println("1. 성적표구하기 \t 2. 종료");
		
		int num = sc.nextInt();
		
		if(num==1) {
		
		
		
		
		System.out.println("국어 점수를 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int math = sc.nextInt();
		ReportVer02_01 report = new ReportVer02_01();
		
		
		}else if(num==2)break;
		else System.out.println("잘못입력했습니다.");
		
				
		}
		
		
	}
		
		
	}
	
class ReportVer02_01{

	private int sum(int kor, int eng, int math) {

		int total = kor + eng + math;

		return total;
	
}

	private int average(int total,double a) {
		
		int average = total/3;
		
		return average;
		
		
		
	}
	
	
	private int grade(int average) {
		char grade ='F';
		if(average>=90) {
			grade ='A';
			
		}else if(average>=80) {
			grade='B';
		}else if(average>=70) {
			grade='C';
		}else if(average>=60) {
			grade='D';
		}else {}
		
		
		return grade;
		
	}
	
	
	
	/*
	 * public int output(int kor, int eng, int math) {
	 * 
	 * int total=this.sum(kor, eng, math); int average= this.average(total);
	 * 
	 * return (total); }
	 */
	
	
	
	
	
	
	
	
	
	
	
}