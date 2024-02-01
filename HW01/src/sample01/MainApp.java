package sample01;

public class MainApp {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		FullTime[] full = new FullTime[3];
		PartTime[] part = new PartTime[2];

		full[0] = new FullTime(10, "유재석", "개그우먼", 0, "2013-05-01", "무한도전", 8500, 200);
		full[1] = new FullTime(20, "박명수", "가수", 10, "2013-06-20", "무한도전", 7500, 100);
		full[2] = new FullTime(30, "정준하", "예능인", 10, "2013-06-22", "무한도전", 6000, 0);

		part[0] = new PartTime(40, "노홍철", "예능인", 20, "2014-05-01", "무한도전", 20000);
		part[1] = new PartTime(50, "하하", "가수", 30, "2014-05-02", "무한도전", 25000);
		// 출력화면을 보고 코딩...

		int flen = full.length;
		int plen = part.length;

		System.out.println("**************** FullTime 정보 ***************");
		

		for(FullTime fu : full) {
			System.out.println(fu.toString());
		}
		
		
		/*
		 * for (int i = 0; i < flen; i++) {
		 * 
		 * System.out.println(full[i].getEmpNo() + " : " + full[i].geteName() + " : " +
		 * full[i].getJob() + " : " + full[i].getMgr() + " : " + full[i].getHiredate() +
		 * " : " + full[i].getDeptName() + " : " + full[i].getSalary() + " : " +
		 * full[i].getBonus());
		 * 
		 * }
		 */

		System.out.println();
		System.out.println("*************** PartTime 정보 **********************");
		
		for(PartTime pa : part) {
			System.out.println(pa.toString());
		}
		
		/*
		 * for (int i = 0; i < plen; i++) {
		 * 
		 * System.out.println(part[i].getEmpNo() + " : " + part[i].geteName() + " : " +
		 * part[i].getJob() + " : " + part[i].getMgr() + " : " + part[i].getTimePay());
		 * 
		 * }
		 */
		System.out.println();
		System.out.println("**************** Message ******************");

		for (int i = 0; i < flen; i++) {

			full[i].message();
		}
		
		for (int i = 0; i < plen; i++) {
			
			
			part[i].message();
		}
		
		
	}

}
