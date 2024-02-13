package HW0213;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class HW1 {

	
	
	public HW1() throws Exception {
	
		FileOutputStream fos = null;

		try {
		fos = new FileOutputStream("C:\\Edu\\java\\javawork\\HW01\\src\\HW0213\\save1.txt",true);

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
		
		while(true) {
			
			String data = br.readLine();
			if(data.equals("exit")) {
				System.out.println("종료 합니다");
				break;
				
		
			}else {
				
				System.out.println(data);
				
				fos.write(data.getBytes());
				fos.write(13);
			}
		
		}
		
		}catch(Exception e ){
			e.printStackTrace();
			
		}finally {
				if(fos!=null)fos.close();
			}
	}
		
	
	
	public static void main (String [] args) throws Exception {
		
		 new HW1();
		
		
	}
	
	
	
	
	
	
	
}
