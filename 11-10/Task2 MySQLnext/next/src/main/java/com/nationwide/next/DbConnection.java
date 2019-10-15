package com.nationwide.next;

import java.sql.*;

public class DbConnection {
	static Connection C;
	static Statement S;
	static{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
        	 C = DriverManager.getConnection("jdbc:mysql://localhost/Nationwide", "root","root");
        	 S = C.createStatement();
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
