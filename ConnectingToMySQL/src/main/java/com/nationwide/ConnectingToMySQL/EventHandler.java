package com.nationwide.ConnectingToMySQL;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EventHandler implements ActionListener {

	Connection C;
	Statement S;
	TextField Regno;
	TextField Name;
	TextField Marks;
	

	public EventHandler(TextField T1, TextField T2, TextField T3) {
    	 try {
         	Class.forName("com.mysql.cj.jdbc.Driver");
         	 C = DriverManager.getConnection("jdbc:mysql://localhost/Nationwide", "root","root");
         	 S = C.createStatement();
         	
    	Regno = T1;
        Name = T2;
        Marks = T3;
    	 }
    	 catch(Exception T) {
    		 System.out.println(T);
    	 }
    }

	public void actionPerformed(ActionEvent AE) {
		try {
			S.executeUpdate("insert into school values(" + Regno.getText()+", '"+Name.getText()+"', "+Marks.getText()+")");
	
		}
		catch(Exception E){
			System.out.println(E);
		}


	}
}