package ex0126.array;
class ArrayValue{
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)

	int [] arr = new int [] {1,2,3,4,5,6,7,8,9,10};
	//int [] arr = {1,2,3,4,56,7,89,};
	public void printArrayvalue() {
		System.out.println(arr[0]);
		
		int len = arr.length;
		
		System.out.println("배열의 길이 = " + len);
		
		
		for(int i =0; i<len; i++) {
			
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		
		System.out.println("---개선된 for 변경 해보자 ---");
		for(int data : arr )
			System.out.println(data);
		
		
	}
	
	
   /*printArrayvalue 메소드작성
       => 메소드 안에서 위에 선언된 배열방의 값을 출력한다.
   
	*/			
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue에 있는 printArrayvalue메소드 호출

		ArrayValue arr = new ArrayValue();
		arr.printArrayvalue();
	
	}
}