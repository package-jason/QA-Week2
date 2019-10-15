package com.nationwide.ConnectingToMySQL;

import java.sql.DriverManager;
import java.sql.*;


public class App 
{
    public static void main( String[] args )
    {
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection C = DriverManager.getConnection("jdbc:mysql://localhost/Nationwide", "root","root");
        	Statement S = C.createStatement();
        	S.executeUpdate("insert into tdp value('Peter')");
        }
        
        catch(Exception T) {
        	System.out.println(T.toString());
        }
       
    }
}
