package JDBC.jdbc_test;

import java.sql.*;

public class JdbcTest {

	public static void main(String[] args) {
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost:3306", "", "root", "");
		
		try {
			
			//
			myConn = dcm.getConnection();
			System.out.println("Database connection successful");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}

	}

}
