package ex0126.overloading;

//MethodOverloadingExam.java
class OverloadedMethod {
	private int i; // 전역필드 0 은닉 (외부에서 접근불가)

	public void setOverload(int i) {
		this.i = i; // 전달된 인수의 값을 전역필드에 넣어라(대입)
	}

	public int getOverload() {
		return i;
	}

	// setOverload를 Overloaing하세요. 리턴도 하세요.
	public int setOverload(String s) { 
		return this.i;

	}

	// setOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	public int setOverload(double d) {

		return this.i;

	}

	// setOverload를 또 또Overloading 하세요. 리턴 안해요
	protected void setOverload(boolean b) {

	}

	// getOverload를 Overloading하세요. 리턴도 하세요.
	public int getOverload(String s) {
		return this.i;
	}

	// getOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	private int getOverload(int j) {
		return this.i;
	}

	// getOverload를 또 또Overloading 하세요. 리턴 안해요
	void getOverload(char c) {

	}

}

class MethodOverloadingExam {

	public static void main(String[] agr) {
		// OverloadedMethod객체에서 호출가능한 메소드들을 한번씩 호출하세요.

		OverloadedMethod om = new OverloadedMethod();
		
		int b = om.setOverload(5.5);
		System.out.println(om.setOverload("Hi"));
		System.out.println(om.setOverload(6.5));
		System.out.println(om.getOverload());
		System.out.println(om.getOverload("hi"));
		

		
		
		
		
		
		
		
	}

	
	
	
}
