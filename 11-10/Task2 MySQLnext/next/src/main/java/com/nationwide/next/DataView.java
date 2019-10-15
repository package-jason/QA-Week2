package com.nationwide.next;

import java.awt.*;
import java.sql.ResultSet;

public class DataView extends Frame {
	TextField Regno, Name, Marks;
	ResultSet Records;
	Label L1, L2, L3;
	Button Back, Next;
	
	public DataView{
		Regno = new TextField();
		Name = new TextField();
		Marks = new TextField();
		L1 = new Label("Regno");
		L2 = new Label("Name");
		L3 = new Label("Marks");
		Back = new Button("Back");
		Next = new Button("Next");
		
		GridLayout Grid = new GridLayout(4,4);
		setLayout(Grid);
		add(new Label());
		add(L1);
		add(Regno);
		add(new Label());
		add(new Label());
		add(L2);
		add(Name);
		add(new Label());
		add(new Label());
		add(L3);
		add(Marks);
		add(new Label());
		add(Back);
		add(new Label());
		add(new Label());
		add(Next);

		Records = DbConnection.class.executeQuery("select * from school");
		
		
	}
}
