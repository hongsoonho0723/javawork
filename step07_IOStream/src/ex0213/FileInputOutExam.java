package ex0213;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutExam {

	
	public FileInputOutExam() {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			//byte단위로 파일 읽기
		fis = new FileInputStream("src/ex0213/info.txt");
	//	fos = new FileOutputStream("src/ex0213/test");
		
			//1byte씩 읽기
		/*
		while(true) {
		int i = fis.read();
		if(i== -1)break;
		System.out.println(i+" , "+(char)i);
		}
		*/
		int length = fis.available(); //읽을수 있는 byte개수
		System.out.println("length = "+ length);
		
		byte b []  = new byte [length];
		fis.read(b); //byte 배열의 크기만큼 한번에 읽어서 배열에 저장
		
		/*for(byte bb : b) {
			System.out.println(bb);
		}
		*/
		
		//byte 배열을 String 으로 변환
		String str = new String(b);
		System.out.println(str);
		
		//////////////////////////////
		//byte단위로 저장 = 쓰기
		//fos = new FileOutputStream("src/ex0213/test1234");
		fos = new FileOutputStream("src/ex0213/test1234",true);
		fos.write(13);
		fos.write(65);
		fos.write(66);
		fos.write(67);
		
		fos.write(32); //공백
		fos.write(68);
		fos.write(69);
		
		fos.write(13);
		fos.write(10);

		fos.write(70);
		fos.write(13);
		//String 을 byte 배열로 변환
		String message = "안녕하세요.HongSoonHo";
		fos.write(message.getBytes());
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
				try {
					if(fis!=null)fis.close();
					if(fos!=null)fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	
	
	public static void main(String[] args) {

		new FileInputOutExam();
		
	}

}
