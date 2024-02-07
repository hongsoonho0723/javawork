package ex0206.exam05;

public class MainApp {

	public static void main(String[] args) {

		MainApp ma = new MainApp();
		Box<Integer> box1 = ma.boxing(100);
		
		Box<String> box2 = ma.boxing("순호");
	}

	/*메소드 추가 - 제네릭 메소드*/
	public <T >Box <T> boxing(T t) { // T는 실제 사용할 때 파라미터를 구체적인 타입
		Box<T> box = new Box<T>();
		box.setT(t);
		
		return box;
	}
	public <T> Box <T> boxing2() { // T는 실제 사용할 때 파라미터를 구체적인 타입
		
		return null;
	}
	public <T>void boxing3(T t) { // T는 실제 사용할 때 파라미터를 구체적인 타입
		
	}
	
}
