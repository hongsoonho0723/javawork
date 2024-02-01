package ex0201.final_abstract;

class Test{
	final int age; //반드시 초기화 필수 (명시적초기화 or 생성자를 이용한 초기화
	// final int age1; final 초기화
	
	//static final int pie=20; //생성자초기화 못함 
	static final int pie; //명시적 초기화 or static 블럭에서 초기화 가능 = constant = 상수
	static {
		pie=100;
	}
	Test(int age){
	this.age=age;//생성자를 이용해서 final필드를 초기화
	}
	
}

///////////////////////////////////////
public class FinalVsConstantExam {

	public static void main(String[] args) {
	/*	 Test t = new Test();
		 System.out.println("t.age = "+ t.age);
		 //t.age=30; final 필드이므로 값변경불가
	*/
		/* Teat t = new Test(20);
		 System.out.println("t.age="+ t.age);
		 
		 Teat t2 = new Test(50);
		 System.out.println("t.age="+ t2.age);
		 */
	
	
	}

}
