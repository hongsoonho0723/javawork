package ex0205;

public class Shoppingmall {
	public void enter(int age) throws ShoppingException{
		
		if(age<18) {
			throw new ShoppingException();
			
		}else System.out.println(age +"살 님 입장하신걸 환영합니다");
	}
	
	
	
	
	
}

