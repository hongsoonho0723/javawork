package ex0131.superEx;

class Parent{

	
	Parent() { System.out.println(1); }
	 
	Parent(int i) {
		System.out.println(2);
	}

	Parent(String s) {
		System.out.println(3);
	}
 
}


///////////////////////////////////////
class Child extends Parent{ //child is a Parent 성립
	Child(){
		this(4);
		System.out.println(4);
	}
	Child(int i){
		super(1);
		System.out.println(5);
	}
	Child(boolean b){
		super("s");
		System.out.println(6);
	}
}


public class SuperConstructorExam {

	public static void main(String[] args) {

		new Child();		
		//new Child(5);		1 5
		//new Child(true);	1 6
		
		//결론 : 자식생성자 구현부 첫번째 줄에는 super() 생략되어 있다
		//		 부모의 기본생성자를 호출한다
		///////////////////////////////////////////////
		//만약, 부모의 생성자 하나도 없다면....->
		//
		/*
		new Child();		
		new Child(5);		
		new Child(true);	*/
		//결론 : 생성자를 하나도 작성하지 않으면 기본생성자는 자동 삽입되어진다
		////////////////////////////////////////////////
		// 만약 부모의 기본생성자는 없고 인수 있는 생성자만 존재한다면 
	}

}
