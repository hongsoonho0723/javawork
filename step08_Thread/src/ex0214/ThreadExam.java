package ex0214;

public class ThreadExam {

	public static void main(String[] args) {

		System.out.println("*****메인 시작합니다*****");
		
		
		NumberThread th1 = new NumberThread("첫번째 Thread");
		NumberThread th2 = new NumberThread("두번째 Thread");
		
		AlphaRunnable alphaRun = new AlphaRunnable();
		Thread th3 = new Thread(alphaRun, "세번째 Thread");
		
		
		//스레드 대기영역
		th1.start();
		th2.start();
		th3.start();
		
		/*
		try {
		th1.join(); //th1스레드가 일을 마칠때 까지 현재 스레드는 대기
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		*/
		System.out.println("총합 = "+ th1.sum);
		
		System.out.println("*****메인 종료합니다*****");
		
			}

}


//////////////////////////////////
/*
 * 1~100 출력하는 스레드 
 */
class NumberThread extends Thread{
	int sum;
	public NumberThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		
	for(int i = 1; i<=100; i++) {
		System.out.println(super.getName()+"-->"+i);
		Thread.yield(); //양보 (현재 스레드 대기상태로)
		sum += i;
	}
		
		System.out.println(super.getName()+"종료합니다.");
	
	}
}
	
/*
 * A~Z 출력하는 Runnable
 */

class AlphaRunnable implements Runnable {

	@Override
	public void run() {
		//현재 스레드
		Thread th = Thread.currentThread();
		
		for(char ch='A'; ch<='z'; ch++) {
			System.out.println(th.getName()+"==>"+ch);
		//	Thread.yield(); //양보 (현재 스레드 대기상태로)
			try {
			Thread.sleep(1);
		}catch(InterruptedException e) {
			
		}
		}
		System.out.println(th.getName()+" 종료합니다");
	}
	
	
}

























