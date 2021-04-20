package com.ibm.sql;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class JdbcFactory {
	
	private JdbcFactory() {
		// TODO Auto-generated constructor stub
	}
	public static Connection getConnection() throws  SQLException
	{
		Properties p = new Properties();
		try {
			p.load(new FileReader("src/main/resorces/dbinfo.properties"));
			}catch(IOException e1)
		{
				throw new SQLException(e1);
		}
		try {
			Class.forName(p.getProperty("driver"));
		}
		catch(ClassNotFoundException e)
		{
			throw new SQLException(e);
		}
		
		return DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"),p.getProperty("pass"));
	}
	

}
