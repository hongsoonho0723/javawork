package ex0216.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientChatExam {

	public ClientChatExam() {
		
		try {
			//Socket sk = new Socket("192.168.0.24",9000); //192.168.0.24
			Socket sk = new Socket("192.168.0.36",9000);
			
			System.out.println("서버와 채팅을 시작합니다");
			
			//보내는 스레드
			new SendThread(sk,"CLIENT").start();
			
			//받는 스레드
			
			new Thread(()->{
				
				try(BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()))){
					while(true) {
					String read = br.readLine();
					
					if(read.equals("exit")) {
						break;
						
					}
					
					   System.out.println(read);
					}
					
					System.out.println("클라이언트쪽 받는 스레드 종료합니다22");
					
				}catch(Exception e) {
					//e.printStackTrace();
				}finally {
					//리소스 정리
					System.out.println("프로그램을 정리합니다");
					System.exit(0);
				}
			}).start();
			
			
			
		}catch(Exception e) {
			//e.printStackTrace();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new ClientChatExam();
	}

}
