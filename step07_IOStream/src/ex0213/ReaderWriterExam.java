package ex0213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderWriterExam {

	public ReaderWriterExam() {
		// 문자단위로 파일 읽기 - buffered이용

		try (BufferedReader br = new BufferedReader(new FileReader("src/ex0213/info.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0213/info.txt"))) {

			/*
			 * while(true) { int i = br.read(); if(i==-1)break;String data = br.readLine()
			 * System.out.println(i+" , "+(char)i); }
			 */

			// 한줄씩 읽기
			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}

			bw.write(65);
			bw.write("BCDEF");
			bw.write(32);
			bw.write("재밌다");
			bw.newLine();
			bw.write("좋아요");

		} catch (Exception e) {
			e.printStackTrace();
			}

	}

	public static void main(String[] args) {

		new ReaderWriterExam();

	}

}
