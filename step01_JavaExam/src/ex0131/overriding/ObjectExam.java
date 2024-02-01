package ex0131.overriding;

class ObjectExam{
	String str;
	public ObjectExam(){ 
		
	}
	public ObjectExam(String str){  
		this.str=str;
		
	}
	
	public String toString() {
		
		return str+super.toString();
	}
	
}
///////////////////////////////
class ReferenceExam{
	
	
	public static void main(String[] args){
			char c='a';
			
			String s01="장희정"; 
			String s02="Java";
			
			String s03=new String("월요일");
			
			ObjectExam oe1=new ObjectExam("홍순호");
			ObjectExam oe2=new ObjectExam("안녕");
			
			/*
			 * printle(Object obj) or print (Object)
			 *	: 인수로 Object 전달되면 obj.toString() 자동 호출
			 *	  Object에 정의되어 있는 toString()메소드는
			 *	  객체의 주소를 클래스이름@hashcode 의 형태의 문자열로
			 *	  만들어서 리턴해준다  
			 *
			 */
			
			System.out.println(c);//
			
			System.out.println(s01);//
			System.out.println(s02);//
			System.out.println(s03);//
			
			System.out.println(oe1.toString());//
			System.out.println(oe2);//
			
	}
}
