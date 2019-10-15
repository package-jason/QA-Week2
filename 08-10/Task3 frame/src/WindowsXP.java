import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Button;


public class WindowsXP {
	public static void main(String XYZ[]) {
		Button B1,B2,B3,B4,B5;
		B1 = new Button("Click1");
		B2 = new Button("Click2");
		B3 = new Button("Click3");
		B4 = new Button("Click4");
		B5 = new Button("Click5");
		Frame F = new Frame("Nationwide");
		F.add(B1, BorderLayout.NORTH);
		F.add(B2, BorderLayout.EAST);
		F.add(B3, BorderLayout.WEST);
		F.add(B4, BorderLayout.SOUTH);
		F.add(B5, BorderLayout.CENTER);
		
		
		F.setSize(400,400);
		F.setVisible(true);
		
		ButtonClicked Bevent1 = new ButtonClicked();
		ButtonClicked2 Bevent2 = new ButtonClicked2();
		ButtonClicked3 Bevent3 = new ButtonClicked3();
		ButtonClicked4 Bevent4 = new ButtonClicked4();
		ButtonClicked5 Bevent5 = new ButtonClicked5();
		B1.addActionListener(Bevent1);
		B2.addActionListener(Bevent2);
		B3.addActionListener(Bevent3);
		B4.addActionListener(Bevent4);
		B5.addActionListener(Bevent5);
	}
}
