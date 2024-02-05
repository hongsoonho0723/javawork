package ex0205;

public class ExceptionExam {

	public static void main(String[] args) {

		System.out.println("----- 메인 시작하기------");
	/*	System.out.println("args = " + args);
		System.out.println("args = " + args.length);
		*/
		
	
		try {
			

			String param = args[0];
			System.out.println("param = "+ param);
		
			int convertNo = Integer.parseInt(param);
			System.out.println("변화 한 숫자 = " + convertNo);
			

			int result = 100/convertNo; //ArithmeticException
			System.out.println("나눈 결과 = "+result);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			//예외발생했을때 해야 할 일 작성
			System.out.println("e = "+ e.toString()); //e.toString()호출
		
		
		} catch (NumberFormatException e) {
			//예외발생했을때 해야 할 일 작성
			System.out.println("숫자만 입력하세요 : "+e.getMessage());
		}catch (Exception e) {
			//예외발생했을때 해야 할 일 작성
			e.printStackTrace();// 출력 (개발모드에서만 사용, 운영모드에서 삭제필수
		}finally {
			System.out.println("예외발생여부와 상관없이 무조건 실행됩니다");
		}
		
		System.out.println("----- 메인 끝 ------");
		
		
		
	}

}

/*
 * 실행
 * java ExceptionExam 값 값 값 .....
 * 
 * 
 */



