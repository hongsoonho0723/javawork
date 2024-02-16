package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChatExam {
		Socket sk;
		
		public ServerChatExam() {
			try(ServerSocket server = new ServerSocket(9000)){
				System.out.println("클라이언트 접속 대기중...");
				
				sk= server.accept();
				
				//읽기 -Inner 클래스(상대측에서 보낸 데이터 읽기)
				new ServerReciveThread().start();
				
				//쓰기 -outer 클래스(상대측에게 키보드 입력을 받아서 데이터 전송)
				new SendThread(sk,"SERVER").start();
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	public static void main(String[] args) {
		new ServerChatExam();
	}
	/*
	 * Inner클래스는 Outer클래스의 필드와 메소드를 접근
	 */
	class ServerReciveThread extends Thread{
		
		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()))){
				while(true) {
				String read = br.readLine();
				
				if(read.equals("exit"))break;
				
				System.out.println("서버 받는 스레드 종료합니다");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//runned
		
		
	}// inner클래스 =>ServerChatExam$ServerReciveThread.class
	
	
}//클래스 끝
