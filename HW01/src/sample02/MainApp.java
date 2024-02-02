package sample02;

public class MainApp {


	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Employee[] employee = new Employee[5];
		
		
		employee[0] = new FullTime(10, "유재석", "개그우먼", 0, "2013-05-01", "무한도전", 8500, 200);
		employee[1] = new FullTime(20, "박명수", "가수", 10, "2013-06-20", "무한도전", 7500, 100);
		employee[2] = new FullTime(30, "정준하", "예능인", 10, "2013-06-22", "무한도전", 6000, 0);

		employee[3] = new PartTime(40, "노홍철", "예능인", 20, "2014-05-01", "무한도전", 20000);
		employee[4] = new PartTime(50, "하하", "가수", 30, "2014-05-02", "무한도전", 25000);
		// 출력화면을 보고 코딩...

		
		
		System.out.println("**************** employee 정보 ***************");
		
/*
		for(Employee el : employee) {
			if(el instanceof FullTime) {
				System.out.println(((FullTime) el).toString());
				
			}else{
		        System.out.println(((PartTime) el).toString());
		      //  System.out.println(el.toString());
		    }
			
			
		}
		
		
	*/		
		
		
		for(Employee el : employee) {
		
		        System.out.println(el.toString());
		   
			
			
		}
		
		
		

		System.out.println();
		
		System.out.println("**************** Message ******************");

	
		
		  for(Employee el : employee) {
		  
		  el.message();
		  
		  
		  }
		  
}
}
