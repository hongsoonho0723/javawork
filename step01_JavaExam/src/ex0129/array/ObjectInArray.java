package ex0129.array;
//ObjectInArray.java

class ObjectOne{
	public int a; //속성
}

public class ObjectInArray{
	//메인 메소드에서 
	public static void main(String [] agrs) {
		
		//int 타입을 5개 까지 저장하는 배열을 선언하고
		int [] arr1 = new int [5];
		//ObjectOne 타입을 5개 까지 저장하는 배열을 선언하고
		ObjectOne arr[] = new ObjectOne [5];
		System.out.println("arr = "+arr);
		//5개의 ObjectOne객체를 생성하세요.
		
		for(int i=0; i<5;i++) {
			
			System.out.print("생성전 "+"arr{"+i+"] = "+ arr[i]+"\t");
			
			arr[i]=new ObjectOne();

			System.out.print("생성후 "+"arr{"+i+"] = "+ arr[i]+"\t");
			System.out.println(arr[i].a);
		}

		//각 객체가 갖고있는 전역변수 출력
		
		//각 객체의 주소값 출력
		
		
		//각각의 ObjectOne객체가 서로 다른 a의 값을 갖도록 a의 값을 변경하세요.			
		
		
		//각 ObjectOne 객체의 a를 출력하세요
			System.out.println("----변수 값 변경해보기-----");
		for(int i=0; i<arr.length; i++) {
			arr[i].a = (i+1); //값변경
			System.out.println("arr{"+i+"] = "+arr[i]+"\t");
			
			
		}
	
		arr[0]= arr[1]; //1번의 주소를 0번지에넣어라
		
		System.out.println("----변경해보기-----");
		for(int i=0; i<arr.length; i++) {
			arr[i].a = (i+1); //값변경
			System.out.println("arr{"+i+"] = "+arr[i]+"\t");
			
			
			
		}
		
		
	}
	
	
	
}









