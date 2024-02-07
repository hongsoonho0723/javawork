package ex0206.exam04;

public class Exam04Main {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		Box<String> box2 = new Box<String>();
		
		box1.content="배고프다";
		box2.content="배고프다";
		
		boolean result = box1.compare(box2);
		System.err.println("result = " + result);
		
		System.out.println("----------------------");
		
		Box<Integer> box3 = new Box<Integer>();
		Box<Integer> box4 = new Box<Integer>();
		
		box3.content=200;
		box4.content=200;
		
		result = box3.compare(box4);
		System.err.println("result = " + result);
	
	
	
	}
	}
	
	

