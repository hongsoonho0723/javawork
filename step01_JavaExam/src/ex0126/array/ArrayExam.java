package ex0126.array;

class ArrayExam{ 
	
	//각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요
	int [] intArr = new int [5];
	double [] doubleArr = new double [5];
	char [] charArr = new char [5];
	boolean [] booleanArr = new boolean[5];
	String [] stringArr = new String [5];
	
	
	//메소드 : printArrayValue01	
	//위의 배열들에 자동으로 초기화 된값을 출력하세요
	
	public void printArrayValue01 () {
		
		System.out.println(intArr[0]);
		
	}
	
	

	//메소드 : printArrayValue02	
	//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.
	
	public void printArrayValue02() {
		intArr [0]=1;
		
		for(int i = 0; i<=4; i++) {
			intArr[i]=i;
						
		}
		
		this.printArrayValue01();
		
		
	}
	
	
	//메소드 : printArrayValue03	
	//새롭게 할당된값을 출력하세요
	
	public void printArrayValue03() {
		for(int i =0; i<4; i++) {
			System.out.println(intArr[i]);
			
		}
		
		
		
	}
	
	
	//메인메소드에서
	//ArrayExam의 메소드들을 순서대로 호출하세요.
	
	
	
	
	

	
}













