package pt.iade.CliGest.models.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**Classe responsavel por fazer a conexao com a base de dados*/
public final class DBConnector {
	private static final String URL = "jdbc:mysql://remotemysql.com:3306/iXLJ7yYZQY?useSSL=false";
	private static final String PASS = "jejucTMTpU";
	private static final String USER = "iXLJ7yYZQY";

	private static Connection connector;
	private DBConnector () {}
	
	public static Connection getConnection() {
		try {
			if (connector == null ||
					connector.isClosed())
				connector = DriverManager.
					getConnection(URL,USER,PASS);
			return connector;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; 
	}

}
