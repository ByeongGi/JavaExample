package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {
	// ConnectionMaker를 구현하는 DConnectionMaker객체에서 
	// makeConnection()을 구현하여 UserDao클래스에서 ConnectionMaker의 형태의 
	// 인터페이스형 객체데이터 타입으로 저장할수 있게 된다.
	public Connection makeConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection(
				"jdbc:mysql://localhost/springbook?characterEncoding=UTF-8", "spring", "book");
		return c;
	}
}
