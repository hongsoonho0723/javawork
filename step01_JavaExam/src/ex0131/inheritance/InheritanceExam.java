package ex0131.inheritance;
class Car{
		public String carname;
		public int cost;
		
		protected void printAttributes(){
			System.out.println("carname="+carname+"\tcost="+cost);
		}
}

//Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성	
	//각 클래스에 인수를 받지않는 생성자 작성
	//각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당
	
	class EfSonata extends Car{
		EfSonata(){
			this.carname="efsonata";
			this.cost=1000;
		};
	}

	class Excel extends Car{
		String color;
		Excel (){
			this.carname="excel";
			this.cost=2000;
		};
	}
	
	class Carnival extends Car{
		Carnival(){
			this.carname="carnival";
			this.cost=3000;
		};
	}
	
public class InheritanceExam{
	//메인메소드에서 
	public static void main(String []args) {
		Car car = new Car();
		EfSonata efsonata= new EfSonata();
		Excel excel = new Excel();
		Carnival carnival = new Carnival();

		System.out.println("=================");
		System.out.println("car = "+ car);
		System.out.println("efsonata = "+ efsonata);
		System.out.println("excel = "+ excel);
		System.out.println("carnival = "+ carnival);
		System.out.println("=================");
		
		car.printAttributes();
		efsonata.printAttributes();
		excel.printAttributes();
		carnival.printAttributes();
		
		
	}
		//Car, EfSonata, Excel, Canival 네개의 객체를 생성
		// 각 클래스에서 Car calss에있는 printAttributes()메소드를 호출할수있다.
		
	
}

