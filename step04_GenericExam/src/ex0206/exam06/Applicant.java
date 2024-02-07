package ex0206.exam06;

public class Applicant<T> {
	private T kind; //사람, 직작인 , 학생 , 고등 ,중학생
	
	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public Applicant(T kind) {
		this.kind = kind;
		
		
		
		
	}

	
	
}




