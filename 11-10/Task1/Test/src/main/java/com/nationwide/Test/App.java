package com.nationwide.Test;

/**
 * Hello world!
 *
 */

import java.sql.*;

public class App {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Nationwide", "root", "root");
			Statement stmt = conn.createStatement();

			ResultSet resultSet = stmt.executeQuery("Select * from school");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getInt(3));
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}