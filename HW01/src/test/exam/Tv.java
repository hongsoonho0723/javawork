package test.exam;

public class Tv extends Elec implements ElecFunction {

	private int chnnel;

	public Tv() {
	};

	public Tv(int chnnel) {
	};

	public Tv(String code, int cost, int chnnel) {
		super(code, cost);
		this.chnnel = chnnel;
	}

	@Override
	public void start() {
		System.out.println(toString());
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(super.toString());
		builder.append("제품 TV를 ");
		builder.append(chnnel);
		builder.append("을 본다");

		return builder.toString();

	}

}
