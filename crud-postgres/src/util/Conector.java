package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	static String url = "jdbc:postgresql://drona.db.elephantsql.com:5432/ywiuegoj";
	static String user = "ywiuegoj";
	static String password = " xUTI96gd2ZeQ7nqp4wyGpRcDM5xrg8m6";
	static Connection con;

	public static Connection getConexao() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
			if(con == null){
				con = (Connection) DriverManager.getConnection(url, user, password);
			}
			return con;
		}catch(ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}

}
