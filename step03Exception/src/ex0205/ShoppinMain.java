package ex0205;

import java.util.Random;

public class ShoppinMain {

public static void main(String [] args) throws ShoppingException {
	
		System.out.println("shoppingMall OPEN");
		Shoppingmall mall = new Shoppingmall();
		Random r = new Random();
		
		
		for(int i=0; i<10; i++) {
			int age = r.nextInt(55)+1;
			
			try {
				mall.enter(age);
			} catch (ShoppingException e) {
				System.out.println(e.getMessage());
			}
		
	}

}
}
