package ex0123;
public class Exam{
//public 생략가능 생략시 해당 패키지안에서만 사용가능
	public static void main (String [] args){
	// 1~12 사이의 난수를 발생한다
	
	int no =(int)( Math.random()*12+1);
	
	//발생한 난수가 1이면 일요일 2이면 월요일 3이면 화요일 4이면 수요일 5이면 목요일 6이면 금요일 이외의 수는 토요일 출력한다
	
	if(no==1 ){
		
	System.out.print("일요일");
}else if(no==2 ){
	System.out.print("월요일");
}
else if(no==3 ){
	System.out.print("화요일");
}
else if(no==4 ){
	System.out.print("수요일");
}
else if(no==5 ){
	System.out.print("목요일");
}
else if(no==6 ){
	System.out.print("금요일");
}else {
System.out.print("토요일");}

System.out.print(no);
}

	
	
}
