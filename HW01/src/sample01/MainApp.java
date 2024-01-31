package sample01;

class FullTime {
	FullTime() {
	};

	public FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int salary,
			int bonus) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.deptName = deptName;
		this.salary = salary;
		this.bonus = bonus;
	}

	int empNo;
	String eName;
	String job;
	int mgr;
	String hiredate;
	String deptName;
	int salary;
	int bonus;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}

class PartTime {

	int empNo;
	String eName;
	String job;
	int mgr;
	String hiredate;
	String deptName;
	int timePay;

	public PartTime() {
	};

	public PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int timePay) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.deptName = deptName;
		this.timePay = timePay;

	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}

}

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
		for (int i = 0; i < flen; i++) {

			System.out.println(full[i].getEmpNo() + " : " + full[i].geteName() + " : " + full[i].getJob() + " : "
					+ full[i].getMgr() + " : " + full[i].getHiredate() + " : " + full[i].getDeptName() + " : "
					+ full[i].getSalary() + " : " + full[i].getBonus());

		}

		System.out.println();
		System.out.println("*************** PartTime 정보 **********************");
		for (int i = 0; i < plen; i++) {

			System.out.println(part[i].getEmpNo() + " : " + part[i].geteName() + " : " + part[i].getJob() + " : "
					+ part[i].getMgr() + " : " + part[i].getTimePay());

		}
		System.out.println();
		System.out.println("**************** Message ******************");

		for (int i = 0; i < flen; i++) {

			System.out.println(full[i].geteName()+"사원은 정규직입니다.");
		}
		
		for (int i = 0; i < plen; i++) {
			
			
			System.out.println(part[i].geteName()+"사원은 비정규직입니다.");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
