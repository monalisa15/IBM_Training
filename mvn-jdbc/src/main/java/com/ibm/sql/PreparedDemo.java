package com.ibm.sql;
import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;
public class PreparedDemo {

	public static void main(String[] args) {

		String sql = "insert into emp values (?,?,?)";

		Connection conn = null;

		

		try {

			conn = JdbcConnection.getConnection();

			PreparedStatement stmt = conn.prepareStatement(sql);

			stmt.setString(1, args[0]);

			stmt.setString(2, args[1]);

			stmt.setDouble(3, Double.parseDouble(args[2]));

			stmt.executeUpdate();

			

			System.out.println("Record inserted");

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}  finally {

			try {

				if (conn != null)

					conn.close();

			} catch (SQLException e) {

				e.printStackTrace();

			}

		}

	}

}