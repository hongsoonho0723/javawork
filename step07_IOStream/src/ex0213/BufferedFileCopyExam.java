package ex0213;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class BufferedFileCopyExam {
	public BufferedFileCopyExam(String readName, String writeName) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		try {
			fis = new FileInputStream(readName);
			fos = new FileOutputStream(writeName,true);
			
			
			//Buffered 적용
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			
			/*
			 * 
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
		} finally {
			try {
				if (bis != null)
					bis.close();
				if (bos != null)
					bos.close();
			} catch (Exception e) {
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
		System.out.println(end - start);
		
	}

}
