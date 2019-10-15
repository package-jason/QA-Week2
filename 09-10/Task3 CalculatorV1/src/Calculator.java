import java.awt.*;

public class Calculator {
	public static void main(String XYZ[]) {
		Frame F = new Frame("Calculator");
		Panel P1 = new Panel();
		Panel P2 = new Panel();
		GridLayout GL = new GridLayout(4, 4);
		P2.setLayout(GL);

		TextField screen;
		Button B0, B1, B2, B3, B4, B5, B6, B7, B8, B9;
		Button ADD, SUB, MUL, DIV, CLEAR, EQUAL;
		screen = new TextField(40);
		B0 = new Button("0");
        B1 = new Button("1");
        B2 = new Button("2");
        B3 = new Button("3");
        B4 = new Button("4");
        B5 = new Button("5");
        B6 = new Button("6");
        B7 = new Button("7");
        B8 = new Button("8");
        B9 = new Button("9");
        ADD = new Button("+");
        SUB = new Button("-");
        MUL = new Button("x");
        DIV = new Button("÷");
        CLEAR = new Button("C");
        EQUAL = new Button("=");
		
		EventHandler event = new EventHandler(screen);
		B0.addActionListener(event);
		B1.addActionListener(event);
		B2.addActionListener(event);
		B3.addActionListener(event);
		B4.addActionListener(event);
		B5.addActionListener(event);
		B6.addActionListener(event);
		B7.addActionListener(event);
		B8.addActionListener(event);
		B9.addActionListener(event);
		ADD.addActionListener(event);
		MUL.addActionListener(event);
		SUB.addActionListener(event);
		DIV.addActionListener(event);
		EQUAL.addActionListener(event);
		CLEAR.addActionListener(event);

		P1.add(screen);
		P2.add(B7);
		P2.add(B8);
		P2.add(B9);
		P2.add(ADD);
		P2.add(B4);
		P2.add(B5);
		P2.add(B6);
		P2.add(SUB);
		P2.add(B1);
		P2.add(B2);
		P2.add(B3);
		P2.add(MUL);
		P2.add(CLEAR);
		P2.add(B0);
		P2.add(EQUAL);
		P2.add(DIV);
	


		P2.add(EQUAL);
		
		F.add(P1, BorderLayout.NORTH);
		F.add(P2, BorderLayout.CENTER);
		F.setSize(400,400);
		F.setVisible(true);

	}
}
