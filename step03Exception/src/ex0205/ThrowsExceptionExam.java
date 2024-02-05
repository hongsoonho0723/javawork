package ex0205;

class Test{
	public void aa(int i) throws ArithmeticException{
		System.out.println("Test aa() 호출됨....");
		try {
		
		//try {
			this.bb(i);
			
		//} catch (ArithmeticException e) {
		//	System.out.println("aa() catch영역입니다");
			//e.printStackTrace();
		//}
		}finally {
		
			System.out.println("Test aa() 호출끝....");
		}
		
	}
	
	public void bb(int i) throws ArithmeticException {
		System.out.println("Test bb() 호출됨....");
		try {
			int result =100/i; //ArithmeticException가능 있다
			System.out.println("나눈 결과 = " + result);
			
		}finally {
			System.out.println("Test bb() 호출끝....");
			
		}
		//try {
		//} catch (ArithmeticException e) {
		//	e.printStackTrace();
		//}
		
	}
	
}

public class ThrowsExceptionExam {

	public static void main(String[] args) {
		try {
			System.out.println("-----메인 시작합니다------");
			new Test().aa(0);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("-----메인 끝 입니다-----");
		
		
		
	}

}
