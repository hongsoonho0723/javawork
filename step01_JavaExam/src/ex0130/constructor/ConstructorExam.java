package ex0130.constructor;
//ConstructorExam.java
class Puppy{
		//String,int  타입 전역 변수 선언(member 변수선언)
		String a;
		int i;
		
	
		/*	메소드 printPuppyName작성
			인수없음, 리턴안함
			"public void printPuppyName() 호출되었습니다!"출력
			전역변수를 출력
		*/	
		
		public void printPuppyName() {
			System.out.println("public void printPuppyName() 호출되었습니다!");
			System.out.println("전역변수"+a);
			System.out.println("전역변수"+i);
			
		}
		
		
		
		
		/*인수가 없는 생성자 작성
			"생성자 public Puppy() 호출되었습니다!"출력
			printPuppyName메소드 호출
				전역변수 String에"메리" 할당
			전역변수 int에 -98998 할당
		*/
		public Puppy() {
			System.out.println("생성자 public Puppy() 호출되었습니다");
			this.printPuppyName();
			this.a ="메리";
			this.i = -98998;
			
		}
		
}
public class ConstructorExam{
	//메인메소드에서
	public static void main(String [] agrs){
		//Puppy객체 생성
		Puppy p = new Puppy(); //객체가 생성되는 순간 전역변수초기화 ,명시적초기화,생성자가 호출된다
		System.out.println("-----------");
		
		//Puppy객체의 printPuppyName메소드 호출
		p.printPuppyName();
		
		
	}
}
			
