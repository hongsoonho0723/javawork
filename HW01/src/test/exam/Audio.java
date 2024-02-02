package test.exam;

public class Audio extends Elec implements ElecFunction {

	private int vloumn;

	public Audio() {
	};

	public Audio(int vloumn) {
	};

	public Audio(String code, int cost, int vloumn) {
		super(code, cost);
		this.vloumn = vloumn;
	}

	@Override
	public void start() {
		System.out.println(toString());
		System.out.println(super.getCode()+"의 Audio를 "+this.vloumn+"으로 듣는다");
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
		builder.append("의 Audio를 ");
		builder.append(vloumn);
		builder.append("으로 듣는다.");

		return builder.toString();

	}

}
