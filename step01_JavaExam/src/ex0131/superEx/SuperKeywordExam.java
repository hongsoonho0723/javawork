package ex0131.superEx;


class Animal{
	int a=10;
	int b=5;
	
	public void aa() {
		System.out.println("super 의 aa() call");
	}
	
	public void bb() {
		System.out.println("super 의 bb() call");
		
	}
}



class Cat extends Animal{ //Cat is Animal 섭립, Cat is Object 성립 ,Animal a = new Cat();
	int a=20;
	int c=7;

	@Override //재정의 @Annotation
	public void aa() {
		//super.aa();
		System.out.println("Sub의 aa() call...");
		

		/*
		 * System.out.println("a =" + a); //20 System.out.println("this.a= "+this.a);
		 * System.out.println("super.a ="+super.a+"\n");
		 * 
		 * //부모쪽에만 있는 인스턴스 필드 System.out.println("b =" + b); //20
		 * System.out.println("this.b= "+this.b);
		 * System.out.println("super.b ="+super.b+"\n");
		 * 
		 * //자식쪽에만 있는 인스턴스 필드 System.out.println("c =" + c); //20
		 * System.out.println("this.c= "+this.c);
		 */
	//	System.out.println("super.c ="+super.c);
		
		
	}
	
	public void cc() {
		
		System.out.println("Sub의 cc() call...");
	}
	
	
	public void test() {
		//메소드 호출
		//aa()메소드는 재정의 되었다 (부모, 자식에도 존재)
		
		aa();
		this.aa();
		super.aa();
		
		System.out.println("bb()는 부모쪽에만=======================");
		bb();
		this.bb();
		super.bb();
		
		System.out.println("cc()는 자식쪽에만=======================");
		cc();
		this.cc();
		//super.cc();
		
		
		
		
		
	}
	
	
	
}



public class SuperKeywordExam {

	public static void main(String[] args){
		
		//new Cat().aa();
		//new Cat().test();
		
		Cat cat = new Cat();
		System.out.println("cat주소 = "+ cat);
		
		System.out.println("cat.a = "+ cat.a);
		System.out.println("cat.b = "+ cat.b);
		System.out.println("cat.c = "+ cat.c);
		
		System.out.println("========== 메소드 호출 ㄴ==========");
		cat.aa();
		cat.bb();
		cat.cc();
		
		System.out.println("-------------------------------------");
		
		
		
		
		Animal animal = new Cat();//필드를 이용한 다향성

		System.out.println("animal주소 = "+ cat);
		
		System.out.println("animal.a = "+ animal.a);
		System.out.println("animal.b = "+ animal.b);
		// System.out.println("animal.c = "+ animal.c); 부모타입으로 작식부분 접근불가
		
		System.out.println("========== 메소드 호출 ==========");
		animal.aa();
		animal.bb();
		//animal.cc();
		System.out.println("---------------------------------");
		//자식쪽에 있는 필드나 메소드 접근하기위해서는 캐스팅이 픨요하다
		if(animal instanceof Cat) {
		Cat cat2 = (Cat)animal; //부모>자식
		System.out.println("cat2주소 = "+cat2); 
		System.out.println("cat2.c = "+cat2.c);
		cat2.cc();
		
		
		
	}
	
	}
}
