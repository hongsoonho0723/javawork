package ex0206.list;

import java.util.ArrayList;
import java.util.Collections;


public class ListExam01 extends ArrayList<Integer>{
    public ListExam01() {
    	super(5);
    	
    	System.out.println("요소의 개수 : " + size() );
    	
    	//추가
    	this.add(5);
    	this.add(15);
    	super.add(2);
    	super.add(20);
    	super.add(10);
    	super.add(20);
    	super.add(50);
    	super.add(40);
    	
    	System.out.println("추가후 요소의 개수 : " + size() );
    	
    	//list안에 요소 꺼내기
    	for(int i=0; i < size() ; i++) {
    	  int no = super.get(i);
    	  System.out.print(no+" , ");
    	}
    	
    	
    	System.out.println("\nthis = " + this );
    	System.out.println( );
    	
    	//요소 제거
    	super.remove(2);//3 번째요소 제거
    	super.remove(4);// 
    	
    	System.out.println("--개선된 for -----");
    	for(Integer n : this ) {
    		System.out.print(n+" , ");
    	}
    	System.out.println("\n------------");
    	//정렬
        Collections.sort( this );//올림차순
    	Collections.sort( this , Collections.reverseOrder());
        
        System.out.println("정렬 후 = " + this);
    	
    }
	public static void main(String[] args) {
		 new ListExam01();

	}

}
