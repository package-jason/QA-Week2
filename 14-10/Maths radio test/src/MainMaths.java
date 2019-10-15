import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MainMaths {
	public static void main(String X[]) {
		Frame F = new Frame();
		TextField T1 = new TextField();
		TextField T2 = new TextField();
		TextField T3 = new TextField();
		Button B1 = new Button("Operation");
		JRadioButton R1 = new JRadioButton("Add");
		R1.setSelected(true);
		JRadioButton R2 = new JRadioButton("Subtract");
		JRadioButton R3 = new JRadioButton("Multiply");
		JRadioButton R4 = new JRadioButton("Divide");
		ButtonGroup group = new ButtonGroup();
		group.add(R1);
		group.add(R2);
		group.add(R3);
		group.add(R4);
		F.setLayout(new GridLayout(8, 2));
		F.add(new Label("First No:"));
		F.add(T1);
		F.add(new Label("Second No:"));
		F.add(T2);
		F.add(new Label());
		F.add(R1);
		F.add(new Label());
		F.add(R2);
		F.add(new Label());
		F.add(R3);
		F.add(new Label());
		F.add(R4);
		F.add(new Label());
		F.add(B1);
		F.add(new Label("Result:"));
		F.add(T3);

		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent X) {
				if (R1.isSelected()) {
					try {
						float No1 = Float.parseFloat(T1.getText());
						float No2 = Float.parseFloat(T2.getText());
						float Result = 0;
						Result = No1 + No2;
						T3.setText(Float.toString(Result));
					} catch (NumberFormatException E) {
						T3.setText("Digits only please");
					}
				} else if (R2.isSelected()) {
					try {
						float No1 = Float.parseFloat(T1.getText());
						float No2 = Float.parseFloat(T2.getText());
						float Result = 0;
						Result = No1 - No2;
						T3.setText(Float.toString(Result));
					} catch (NumberFormatException E) {
						T3.setText("Digits only please");
					}
				} else if (R3.isSelected()) {
					try {
						float No1 = Float.parseFloat(T1.getText());
						float No2 = Float.parseFloat(T2.getText());
						float Result = 0;
						Result = No1 * No2;
						T3.setText(Float.toString(Result));
					} catch (NumberFormatException E) {
						T3.setText("Digits only please");
					}
				} else if (R4.isSelected()) {
					try {
						float No1 = Float.parseFloat(T1.getText());
						float No2 = Float.parseFloat(T2.getText());
						float Result = 0;
						Result = No1 / No2;
						T3.setText(Float.toString(Result));
					} catch (NumberFormatException E) {
						T3.setText("Digits only please");
					}
				}

			}
		});
		F.setSize(400, 400);
		F.setVisible(true);


	}
}