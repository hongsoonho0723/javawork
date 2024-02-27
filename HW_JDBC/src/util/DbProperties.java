package util;

/*
 *  DB 설정 정보들을 상수로 관리
 * */
public interface DbProperties {
	public static final String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
	String URl = "jdbc:oracle:thin:@localhost:1521:orcl";
	//String URl = "jdbc:oracle:thin:@192.168.0.36:1521:xe";
	//String USER_ID= "scott";
	//String USER_PASS="TIGER";
	//String USER_ID= "C##HONGSOONHO";
	//String USER_PASS="SOONHO";
	String USER_ID= "C##SOONHO";
	String USER_PASS="soonho";
	
	
}
