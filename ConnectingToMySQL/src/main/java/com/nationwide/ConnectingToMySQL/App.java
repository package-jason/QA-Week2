package com.nationwide.ConnectingToMySQL;


import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;



public class App 
{
    public static void main( String[] args ) {
   
        Frame F = new Frame("School");
        TextField T1 = new TextField(20);
        TextField T2 = new TextField(40);
        TextField T3 = new TextField(40);
        Label L1 = new Label("RegNo:");
        Label L2 = new Label("Name:");
        Label L3 = new Label("Marks:");
        Label L4 = new Label("");
        Button B1 = new Button("Save");
       
        
       EventHandler event = new EventHandler(T1, T2, T3);
       B1.addActionListener(event);
        
        GridLayout Flow = new GridLayout(4,2);
		F.setLayout(Flow);
		F.add(L1);
		F.add(T1);
		F.add(L2);
		F.add(T2);
		F.add(L3);
		F.add(T3);
		F.add(L4);
		F.add(B1);
        F.setSize(400,400);
        F.setVisible(true);
        B1.setPreferredSize(new Dimension(40, 40));
        
        
       
    }
}
