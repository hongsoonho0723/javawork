package ex0201.final_abstract;
//Error 를 수정하고 이유를 주석으로 처리하세요.

final class FinalClassExam{ //상속불가 , 생성가능
 final int i = -999999; 
}


abstract class AbstractClassExam{ //상속가능 ,생성불가
    abstract String abstractMethodExam(int i,String s); //기능없고 재정의 위한 메소드    
     int finalMethodExam(int i, int j){ 
        return i+j;
    }
}


class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
	//final 메소드는 재정의할수없다
	/*
	 * int finalMethodExam(int i, int j){ return i*j; }
	 */
	
}

//final class는 상속할수없다
//class Sample02 extends FinalClassExam{  }


 
abstract class Sample03 extends AbstractClassExam{
	 String abstractMethodExam(int i,String s){
		 
		return s+i;
	 }
	abstract String abstractMethodExam(String s,int i);    

	void sampleMethod03(){
		System.out.println("void sampleMethod03() 호출 됨");
	}
}

public class AbstractFinalClassTest{
    public static void main(String args[]){
		AbstractClassExam ace; // = new AbstractClassExam(); //생성불가
		FinalClassExam fce = new FinalClassExam();
		// fce.i=100000;
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}
