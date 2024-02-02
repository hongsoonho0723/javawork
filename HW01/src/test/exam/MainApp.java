package test.exam;

public class MainApp {

	public static void main(String[] args) {
		// Tv 2대 , Audio 2대 저장하고 그 정보를 출력한다.
		ElecFunction elec[] = new ElecFunction[5];

		elec[0] = new Tv("A01", 500000, 12);
		elec[1] = new Tv("A02", 2500, 20);
		elec[2] = new Tv("A03", 3000, 30);

		elec[3] = new Audio("A04", 8500, 200);
		elec[4] = new Audio("A05", 700, 100);

		for (ElecFunction e : elec) {
			 e.start(); //사용자는 interface를 통해 start 호출하지만 내부적으로 구현객체의 start가 호출된다
			//System.out.println(e); //e.toString()
		}

	}
}
