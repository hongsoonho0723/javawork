package ex0207.map;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesExam {
	Properties pro = new Properties();
	public PropertiesExam() {
		//저장
		pro.setProperty("id", "jang");
		pro.setProperty("name", "희정");
		pro.setProperty("age", "20");

		System.out.println("----- 저장된 정보 확인 하기 -----");
		//저장된 정보 검색
		//for(Object key : pro.keySet()) {
		for(String key : pro.stringPropertyNames()) {
			String value = pro.getProperty(key);
			System.out.println(key+" : "+value);
		}
		//pro.getProperty(null);
	}
	//////////////////////////////////
	/*
	 * 외부의 ~.properties파일을 로딩하는 방법
	 * 1) IO를 이용하는 방법
	 * 2) ResourceBundle 이용하는 방법
	 */
	
	//1) IO를 이용하는 방법
	public void test01() {
		try {
		pro.load(new FileInputStream("src/ex0207/map/dbInfo.properties"));
		
		//출력해보자
		for(String key : pro.stringPropertyNames()) {
			String value = pro.getProperty(key);
			System.out.println(key+" : "+value);
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	//2) ResourceBundle
	//확장자가 properties파일을 읽어들이는 전용 클래스
	//파일의 위치의 기준이 classes폴더를 기준으로 작성
	public void test02() {
		ResourceBundle rb= ResourceBundle.getBundle("ex0207/map/dbInfo");//이거사용 한번사용하고 말거
		for(String key : rb.keySet()) {
			String value = rb.getString(key);
			System.out.println(key + " = "+value );
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		PropertiesExam pe = new PropertiesExam();
		//pe.test01();
		pe.test02();
	}

}
