package JDBC.jdbc_test;

import java.util.Properties;

public class DatabaseConnectionManager {
	
	private final String url;
	private final Properties properties;
	
	public DatabaseConnectionManager( 
		String host,
		String databaseName,
		String username,
		String password
		) {
	
	this.url = "jdbc:mysql://" + host + "/" + databaseName;
	
	this.properties = new Properties();
	properties
	}
	
	
	
}
