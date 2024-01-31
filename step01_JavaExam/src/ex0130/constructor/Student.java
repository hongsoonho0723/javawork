package ex0130.constructor;

public class Student {

	/*
	 * 학생의 속성을 관리하는 객체 value Object =DTO(Date transfer ) Object= Domian;
	 */
	private String name;
	private int age;
	private String addr;

	//생성자 추가
	public Student(String name,int age, String addr) {
		//기능
		this(name,addr); //인수 2개받는 생성자 호출
		this.age=age;
		
	}
	
	public Student() {
		
	}
	
	//정보를 수정할때 사용할 생성자
	public Student(String name, String addr) {
		this.name=name;
		this.addr=addr;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {

		return name;

	}

	public void setAge(int age) {
		if (age > 18)
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAddr() {
		return addr;
	}

}
