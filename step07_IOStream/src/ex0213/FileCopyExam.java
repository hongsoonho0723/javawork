package ex0213;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileCopyExam {
	public FileCopyExam(String readName, String writeName) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(readName);
			fos = new FileOutputStream(writeName,true);
			
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
			while((i=fis.read()) !=-1) {
				
				fos.write(i);
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	public static void main(String[] args) {
		String readName = JOptionPane.showInputDialog("읽을 파일이름?");

		String writeName = JOptionPane.showInputDialog("저장할 파일이름?");
		
		
		long start = System.nanoTime();
		new FileCopyExam(readName, writeName);
		long end = System.nanoTime();
		System.out.println(end-start);
		
		
		
	}

}
