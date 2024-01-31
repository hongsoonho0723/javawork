package ex0124.제어문;

public class SwitchExam02 {

	public static void main(String[] args) {

		// 1~12 사이의 난수를 발생한다

		int nansu = (int) (Math.random() * 12 + 1);
		// 출력 -> ~월은 ~일까지 입니다(30,31,28)

		switch (nansu) {
		case 1:
			System.out.println(nansu + "월은 " + "31일까지 입니다");
			break;
		case 2:
			System.out.println(nansu + "월은 " + "28일까지 입니다");
			break;
		case 3:
			System.out.println(nansu + "월은 " + "31일까지 입니다");
			break;
		case 4:
			System.out.println(nansu + "월은 " + "30일까지 입니다");
			break;
		case 5:
			System.out.println(nansu + "월은 " + "31일까지 입니다");
			break;
		case 6:
			System.out.println(nansu + "월은 " + "30일까지 입니다");
			break;
		case 7:
			System.out.println(nansu + "월은 " + "31일까지 입니다");
			break;
		case 8:
			System.out.println(nansu + "월은 " + "31일까지 입니다");
			break;
		case 9:
			System.out.println(nansu + "월은 " + "30일까지 입니다");
			break;
		case 10:
			System.out.println(nansu + "월은 " + "31일까지 입니다");
			break;
		case 11:
			System.out.println(nansu + "월은 " + "30일까지 입니다");
			break;
		case 12:
			System.out.println(nansu + "월은 " + "31일까지 입니다");
			break;

		}

		int a = 1;

		/*
		 * switch (nansu) {
		 * 
		 * case 2: a = 28; break; case 4, 6, 9, 11: a = 30; break;
		 * 
		 * default: a = 31;
		 * 
		 * }
		 * 
		 * System.out.println(nansu + "월은 " + a + "일까지입니다");
		 * 
		 * }
		 */
	
	 /* switch (nansu) {
	  
	  case 2 -> {a =28;}
	  case 4,6,9,11 ->{ a = 30;
	  
	  }
	  default -> a=31;
	  
	  }
	  System.out.println(nansu+"월은 "+a+"일까지입니다" );
	  
	  }*/
		 a=switch (nansu) {
		  
		  case 2 -> 28;
		  case 4,6,9,11 ->{ yield 30;
		  
		  }
		  default -> 31;
		  
		  };
		  System.out.println(nansu+"월은 "+a+"일까지입니다" );
		  
		
	 
	
		if(nansu == 2) {
			a=28;
			
		}else if (nansu==4 || nansu==6 || nansu==9 || nansu==11) {
			a=30;
		}else {
			a=31;
		}
		 System.out.println(nansu+"월은 "+a+"  일까지입니다" );
		  
	
	  }
	
	
	

}
