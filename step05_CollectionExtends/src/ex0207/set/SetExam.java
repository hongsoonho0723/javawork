package ex0207.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
     Set<String> set = new HashSet<String>();
	//Set<String> set = new TreeSet<String>();//요소 정렬
     public SetExam(String [] args) {
    	 //set 데이터 추가
    	 for(String s : args) {//7번
    	   boolean re = set.add(s);
    	   System.out.println(s + "추가 결과 = " + re);
    	 }
    	 
    	 System.out.println("Set size() = " +  set.size());
    	 System.out.println("set = " + set);//set.toString()호출
    	 
    	 //set안에 있는 요소 꺼내기 
    	 /*
    	  * Iterator interface는 collection에 있는 모든 자료구조안에 있는
    	  * 요소를 꺼내는 전용 interface이다. 
    	  * */
    	 System.out.println("- Iterator 사용 ----");
    	 Iterator<String>  it = set.iterator();
    	 while( it.hasNext() ) {//객체가 존재한다면
    		  String name = it.next();//객체를 꺼낸다.
    		  System.out.println(name);
    	 }
    	 
    	 System.out.println("--개선 된 for 사용 -----");
    	 for(String n : set) {
    		 System.out.println(n);
    	 }
    	 
    	 //객체 제거
    	  boolean re = set.remove("효리2");
    	  System.out.println("제거 결과 = " + re);
    	  
    	  System.out.println("제거후 = " + set);
     }
     
	public static void main(String[] args) {
         new SetExam(args);		

	}

}
