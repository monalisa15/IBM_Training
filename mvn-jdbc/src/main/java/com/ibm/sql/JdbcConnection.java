package com.ibm.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.Driver;

public final class JdbcConnection {
	public JdbcConnection() {
		// TODO Auto-generated constructor stub
	}
	public static Connection getConnection() throws SQLException{

		String url = "jdbc:mysql://localhost:3306/example";
		Connection conn = null;
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		conn = DriverManager.getConnection(url, "root","pass@word1");
		return conn;
		
	}

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/example";
		Connection conn = null;
		try {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		conn = DriverManager.getConnection(url, "root","pass@word1");
		System.out.println("Connected successfully");
		java.sql.DatabaseMetaData meta = conn.getMetaData();
		System.out.println(meta.getDatabaseProductName());
		System.out.println(meta.getDatabaseProductVersion());
		System.out.println(meta.getDriverName());
		System.out.println(meta.getDriverVersion());
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				if(conn != null)
					conn.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
}

}
