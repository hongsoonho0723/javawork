package ex0129.array;

public class Student {

	/*
	 * 학생의 속성을 관리하는 객체 value Object =DTO(Date transfer ) Object= Domian;
	 */

	private String name;
	private int age;
	private String addr;

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
