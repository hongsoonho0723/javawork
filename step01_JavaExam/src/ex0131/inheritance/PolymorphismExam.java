package ex0131.inheritance;

class CarCenter {
	public void engineer(Car cd){
		
		System.out.println("cd 주소 ="+ cd);
		//부모타입으로 자식부분 접근 불가
		//system.out.print("cd.color = "+cd.color);//접근불가
		if(cd instanceof Excel) {
		//자식부분을 접근하기 위해서는 objectDowncasting 필요하다
		//부모 >자식 개념 
		
		Excel e = (Excel)cd;
		System.out.println("e.주소 : "+ e);
		System.out.println("e.color : "+ e.color);
		}
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();

		EfSonata ef=new EfSonata();
		Carnival ca=new Carnival();
		Excel ex=new Excel();
		Car c= new Car();
	
		
		  cc.engineer(c);
		  cc.engineer(ca);
		  cc.engineer(ef);
		 		
	
		cc.engineer(ex);//
		
		
	
	}
}
