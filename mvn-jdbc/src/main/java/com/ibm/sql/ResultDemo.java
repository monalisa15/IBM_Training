package com.ibm.sql;
import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.ResultSetMetaData;

import java.sql.SQLException;
import java.sql.Statement;



public class ResultDemo {

	public static void main(String[] args) {

		Connection conn = null;

		String sql = "select * from emp";

		

		try {

			conn = JdbcConnection.getConnection();
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);

			

			ResultSetMetaData meta = rs.getMetaData();

			for(int c=1; c<=meta.getColumnCount(); c++)

				System.out.print(meta.getColumnName(c) + "\t");

			System.out.println();

		while(rs.next()) {

				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
			}

			

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			try {

				if (conn != null)

					conn.close();

			} catch (SQLException e) {

				e.printStackTrace();

			}

		}

	}

}