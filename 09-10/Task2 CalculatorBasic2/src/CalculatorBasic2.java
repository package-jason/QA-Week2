import java.awt.*;


public class CalculatorBasic2 {
	public static void main(String XYZ[]) {
		Frame F = new Frame("QA Consulting");
		TextField T1 = new TextField(10);
		TextField T2 = new TextField(10);
		TextField T3 = new TextField(10);
		Label L1 = new Label("First Number");
		Label L2 = new Label("Second Number");
		Label L3 = new Label("Result");
		Label error = new Label();

		Button B1 = new Button("+");
		Button B2 = new Button("-");
		Button B3 = new Button("x");
		Button B4 = new Button("�");

		FlowLayout Flow = new FlowLayout();
		F.setLayout(Flow);
		EventHandler event = new EventHandler(T1, T2, T3, error);
		

		B1.addActionListener(event);
		B2.addActionListener(event);
		B3.addActionListener(event);
		B4.addActionListener(event);

		F.add(L1);
		F.add(T1);
		F.add(L2);
		F.add(T2);
		F.add(B1);
		F.add(B2);
		F.add(B3);
		F.add(B4);
		F.add(L3);
		F.add(T3);
		F.add(error);
		F.setSize(2000, 100);
		F.setVisible(true);
	}
}
