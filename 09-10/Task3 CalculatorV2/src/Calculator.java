import java.awt.*;

public class Calculator {
    public static void main(String xyz[]) {
        Frame F= new Frame("Calculator");
        Panel p1=new Panel();
        Panel p2=new Panel();
        GridLayout g1=new GridLayout(4,4);
        p2.setLayout(g1);
        
        
        
        TextField screen= new TextField(20);
        Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
        Button plus,subt,mult,divi,eql,clr;
        b0=new Button("0");
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        plus=new Button("+");
        subt=new Button("-");
        mult=new Button("x");
        divi=new Button("/");
        eql=new Button("=");
        clr=new Button("C");
        
        EventHandler event=new EventHandler(screen);
        
        b0.addActionListener(event);
        b1.addActionListener(event);
        b2.addActionListener(event);
        b3.addActionListener(event);
        b4.addActionListener(event);
        b5.addActionListener(event);
        b6.addActionListener(event);
        b7.addActionListener(event);
        b8.addActionListener(event);
        b9.addActionListener(event);
        plus.addActionListener(event);
        subt.addActionListener(event);
        mult.addActionListener(event);
        divi.addActionListener(event);
        eql.addActionListener(event);
        clr.addActionListener(event);
        
        p1.add(screen);
        p2.add(b0);
        p2.add(b1);
        p2.add(b2);
        p2.add(plus);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(subt);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(mult);
        p2.add(b9);
        p2.add(clr);
        p2.add(eql);
        p2.add(divi);
        
        F.add(p1,BorderLayout.NORTH);
        F.add(p2,BorderLayout.CENTER);
        F.setSize(400,400);
        F.setVisible(true);
    }
}