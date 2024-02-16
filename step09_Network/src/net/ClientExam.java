package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExam {

	
	public ClientExam() {
		//서버에 접속
		try(Socket sk = new Socket("192.168.0.22", 8000)){//192.168.0.36
			
			
			//서버에게 데이터 전송
			PrintWriter pw = new PrintWriter(sk.getOutputStream(),true);
			pw.println("자바세상에 접속하고 싶어요");
			
			//서버가 보내온 데이터 읽기
			BufferedReader br =new BufferedReader(new InputStreamReader(sk.getInputStream()));
			String data = br.readLine();
			System.out.println("서버가 보내온 데이터 : "+data);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static void main(String[] args) {

		new ClientExam();
		
	}

}
