package ex0126.staticEx;


class Test { 
	int i=10;		//인스턴스필드(객체가 생성될때 만들어진다)
	static int j=5;	//static필드(객체생성과 상관없이 하드웨어에 클래슥 로더 될때 자동으로 메모리 만들어진다


	public void aa() {	//non-static 메소드안에서는 static, non-staic 모두 접근가능
		System.out.println(i);
		System.out.println(this.i);
		
		System.out.println(j);
		System.out.println(this.j);
		System.out.println(Test.j);
		
		
	}
	public void bb() {
		//메소드호출
		
		aa();
		this.aa();
		
		cc();
		this.cc();
		Test.cc();
		
		
		
	}
	
	public static void cc() { //static 메소드안에서 no-static접근 불가 , this 사용안됨.
		//System.out.println(i);
		//System.out.println(this.i);
		
		System.out.println(j);
		//System.out.println(this.j);
		System.out.println(Test.j);
		
	}
	public static void dd() {
    	//메소드호출
		
		//aa();
		//this,aa();
		
		cc();
		//this.cc();
		Test.cc();
	}
	
	
}



public class StaticExam {
	
	public static void main(String [] agrs) {
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		System.out.println("주소값 t1 = " + t1);
		System.out.println("주소값 t2 = " + t2);
		System.out.println("주소값 t3 = " + t3);
		
		System.out.println("----인스턴스 필드 접근 (변경전) -----");
		System.out.println("t1.i = " + t1.i);
		System.out.println("t2.i = " + t2.i);
		System.out.println("t3.i = " + t3.i);
		
		
		//값변경
		t1.i=50;
		
		System.out.println("----인스턴스 필드 접근 (변경후) -----");
		System.out.println("t1.i = " + t1.i);
		System.out.println("t2.i = " + t2.i);
		System.out.println("t3.i = " + t3.i);
		
		
		System.out.println("----static 필드 접근 (변경전) -----");
		System.out.println("t1.j = " + t1.j);
		System.out.println("t2.j = " + t2.j);
		System.out.println("t3.j = " + t3.j);
		System.out.println("Test.j = " + Test.j); //5
		
		
		
		//값변경
		t1.j=40;
		
		System.out.println("----static 필드 접근 (변경후) -----");
		System.out.println("t1.j = " + t1.j);
		System.out.println("t2.j = " + t2.j);
		System.out.println("t3.j = " + t3.j);
		System.out.println("Test.j = " + Test.j); //5
		
		
		
		
		
		
			}
		
		/*
		 * static 초기화 작업 환경설정 세팅 초기치 데이터 로딩
		 * 
		 * 
		 * */
		
		static {
			
			System.out.println("static init은 메인보다 먼저 실행되요");
			
		}
		
		
		

	

}
