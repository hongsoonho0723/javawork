package ex0126.overloading;

public class VariableArgsExam {

	/*
	 * public void test (int ... i){ //0개 이사의 int형 인수 허용한다 System.out.println(i); }
	 */
	public void test (Object ... i){ 
		System.out.println("---"+i);
}
	public void test2(String name , int ... i) {
		
		
	
	
	
	
	
	}
	
	
	
	public static void main(String[] args) {
		VariableArgsExam va = new VariableArgsExam();
		va.test(4);
		va.test();
		va.test(4,3,1);
		va.test(4,3,1,5,7,8,12);
		
		va.test(3.2);
		va.test(true);
		va.test("점점점");
		
	}

}
