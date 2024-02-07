package ex0206.exam02;

public class Product <K,M>{

	//private String kind; //상품의 종류
	//private String model; //모델저옵
	private K kind;	//상품의 종류
	private M model;//모델정보
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
	
}
