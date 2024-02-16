package net;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/*
 * 키보드 입력을 받아서 상대측에게 데이터 전송하기
 */
public class SendThread extends Thread {
	Socket sk;
	public SendThread(Socket sk,String name) {
		super(name);
		this.sk=sk;
	}
	@Override
	public void run() {
		//키보드입력 받기
		
		Scanner sc = new Scanner(System.in);
		try(PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);){
			while(true) {
				String inputData = sc.nextLine();
			
				if(inputData.equals("exit")) {
					pw.println(inputData);
					break;
				}else {

					// 상대측에 전송
					pw.println(super.getName() + "가 보낸 내용 : " + inputData);
						
				}
				
			}
			System.out.println(super.getName()+"의 보내는 스레드 종료합니다");
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}//runEnd
	
}//classEnd
