import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
//import javax.swing.*;

public class NumberConverter {
    public static void main(String XYZ[]) {
        Frame F = new Frame("Number Converter");
        Panel p = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        
        TextField screenInput = new TextField(20);
        Label L1 = new Label("Input:");
        TextField screenOutput = new TextField(40);
        Label L2 = new Label("Output:");
        Button BConvert = new Button("Convert");
        EventHandler event = new EventHandler(screenInput, screenOutput);
        BConvert.addActionListener(event);        
        p.add(L1);
        p.add(screenInput);
        p2.add(BConvert);
        p3.add(L2);
        p3.add(screenOutput);
        F.add(p,BorderLayout.NORTH);
        F.add(p2, BorderLayout.CENTER);
        F.add(p3, BorderLayout.SOUTH);
        F.setSize(400,140);
        F.setVisible(true);
    }
}