package ex0213;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class AutoCloseableBufferedFileCopyExam {
	public AutoCloseableBufferedFileCopyExam(String readName, String writeName) {
		
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(readName));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(writeName))
				){ 
	
		
		
		
			/*
			 
			int length = fis.available();
			System.out.println("length = " + length);

			byte b[] = new byte[length];
			fis.read(b);

			String str = new String(b);
			System.out.println(str);

			fos.write(str.getBytes());

			*/
			
			
			int i = 0;
			while((i=bis.read()) !=-1) {
				
				bos.write(i);
				
			}
			
 			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		

	}

	public static void main(String[] args) {
		String readName = JOptionPane.showInputDialog("읽을 파일이름?");

		String writeName = JOptionPane.showInputDialog("저장할 파일이름?");

		long start = System.nanoTime();

		new FileCopyExam(readName, writeName);
		long end = System.nanoTime();
		System.out.println(end - start);
		
	}

}
