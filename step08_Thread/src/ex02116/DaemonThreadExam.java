package ex02116;

public class DaemonThreadExam {

	public static void main(String[] args) {

		System.out.println("***메인 시작합니다****");
		
		/*
		
		Runnable r = new Runnable() {
			public void run() {};
			
		};
		*/
		
		Runnable r = ()->{
			while(true) {
				System.out.println("나는 데몬 스레드야~");
				
				
			}
		};
		Thread th = new Thread(r);
		th.setDaemon(true);
		th.start();
		
		//2초후에 메인이 종료되면 스레드도 함께 종료하고 싶다 -데몬스레드
		try {
		Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		
		System.out.println("메인 종료합니다");
		
	}

}
