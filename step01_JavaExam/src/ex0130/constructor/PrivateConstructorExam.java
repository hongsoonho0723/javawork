package ex0130.constructor;
/*
 * 싱글톤 클래스 만드는 방법
 * 1)private 생성자를 만든다
 * 2)static 맴버필드를이용해서 객체를 생성
 * 3)자기자신객체를 리턴해주는 static 메소드 제공
 */
class Test{
	
	private static Test t = new Test();

	
	//private 생성자는 외부에서 객체를 직접 생성할수 없도록 하는것
	private Test(){}


	/*
	 * 자기자신객체를 직접 생성하서 리턴해주는 메소드 제공한다
	 */

	public static Test getInstance() {
		return t;
	}

}






public class PrivateConstructorExam {

	public static void main(String[] args) {
		//new Test(); //생성자호출 > private이므로 직접생성못함
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		Test t3 = Test.getInstance();
		Test t4 = Test.getInstance();
		
		System.out.println("t1 = "+ t1);
		System.out.println("t2 = "+ t2);
		System.out.println("t3 = "+ t2);
		System.out.println("t4 = "+ t2);
		
		
	}

}
