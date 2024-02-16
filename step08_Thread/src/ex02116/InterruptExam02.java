package ex02116;

public class InterruptExam02 {

	public static void main(String[] args) {

		System.out.println("****메인 시작입니다****");

		Thread th = new Thread(() -> {
			while (true) {

				if (Thread.interrupted())
					break;
				System.out.println("Tread 재미있죠??");

			}

		}

		);

		th.start();

		try {
			// 3초 후에 스레드를 종료시키자.
			Thread.sleep(3000);// 3초
		} catch (Exception e) {
			e.printStackTrace();

		}

		th.interrupt();// 스레드 종료 반드시 일시정지상태가 될때 종료를 감지하고 스레드을 안전하게 종료 할 수 있다

		System.out.println("****메인 종료합니다*****");

	}

}
