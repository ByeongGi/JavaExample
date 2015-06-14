package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
	// ConnectionMaker 객체의 타입으로 자료형태로 makeConnection 를 기능을 구현하여
	// 사용할수 있도록 한다.

	public abstract Connection makeConnection() throws ClassNotFoundException,
			SQLException;

}