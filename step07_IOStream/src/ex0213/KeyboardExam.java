package ex0213;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardExam {

	
	public KeyboardExam() throws Exception {
		//키보드 입력받기
		/*
		InputStream is =System.in; //byte 단위읽기
		int i = is.read();
		System.out.println(i+" , "+(char)i);
	*/
		
		//InputStream --> Reader 로 변환해서 키보드 입력 처리한다
		/*
		InputStreamReader isr = new InputStreamReader(System.in);
		int i = isr.read();
		System.out.println(i+" , "+(char)i);
		*/
		
		//한줄읽기가 가능한 Buffered를 사용한다
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String data = br.readLine();
		System.out.println(data);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) throws Exception {

		new KeyboardExam();
		
	}

}














