import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.SwingUtilities;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorBasicAnonClass {
	public static void main(String XYZ[]) {
		Frame F = new Frame("QA Consulting");
		final TextField T1 = new TextField(10);
		final TextField T2 = new TextField(10);
		final TextField T3 = new TextField(10);
		Label L1 = new Label("First Number");
		Label L2 = new Label("Second Number");
		Label L3 = new Label("Result");
		Label error = new Label();
		
		 JFrame frame = new JFrame();
		    Container contentPane = frame.getContentPane();
		    contentPane.setLayout(new GridLayout(0, 1));
		    ButtonGroup group = new ButtonGroup();
		    JRadioButton B1 = new JRadioButton("Addition", true);
		    group.add(B1);
		    contentPane.add(B1);
		    JRadioButton B2 = new JRadioButton("Subtraction", false);
		    group.add(B2);
		    contentPane.add(B2);
		    JRadioButton B3 = new JRadioButton("Multiply", false);
		    group.add(B3);
		    contentPane.add(B3);
		    JRadioButton B4 = new JRadioButton("Division", false);
		    group.add(B4);
		    contentPane.add(B4);
		


		FlowLayout Flow = new FlowLayout();
		F.setLayout(Flow);
//		AddEventhandler Plus = new AddEveandler(T1, T2, T3, error);
//		SubEventhandler Sub = new SubEventhandler(T1, T2, T3, error);
//		MulEventhandler Min = new MulEventhandler(T1, T2, T3, error);
//		DivEventhandler Div = new DivEventhandler(T1, T2, T3, error);

		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent E) {
				float Result;
				try {
					Result = Float.parseFloat(T1.getText()) + Float.parseFloat(T2.getText());
					T3.setText(Float.toString(Result));
				} catch (NumberFormatException F) {
					error.setText("Digits only please");

				}
			}
		});

		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent E) {
				float Result;
				try {
					Result = Float.parseFloat(T1.getText()) - Float.parseFloat(T2.getText());
					T3.setText(Float.toString(Result));
				} catch (NumberFormatException F) {
					error.setText("Digits only please");
				}
			}
		});

		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent E) {
				float Result;
				try {
					Result = Float.parseFloat(T1.getText()) * Float.parseFloat(T2.getText());
					T3.setText(Float.toString(Result));
				} catch (NumberFormatException F) {
					error.setText("Digits only please");
				}
			}

		});

		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent E) {
				float Result;
				try {
					Result = Float.parseFloat(T1.getText()) / Float.parseFloat(T2.getText());
					T3.setText(Float.toString(Result));
				} catch (NumberFormatException F) {
					error.setText("Digits only please");
				}
			}

		});

		B4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent E) {
				float Result;
				try {
					Result = Float.parseFloat(T1.getText()) / Float.parseFloat(T2.getText());
					T3.setText(Float.toString(Result));
				} catch (NumberFormatException F) {
					error.setText("Digits only please");
				}
			}
		});

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
