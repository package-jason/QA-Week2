import java.awt.*;
import javax.swing.SwingUtilities;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operations {
	Frame F;
	Button B;
	TextField T1, T2, T3;
	
	public Operations() {
		F = new Frame();
		B = new Button();
		T1 = new TextField(); 
		T2 = new TextField(); 
		T3 = new TextField(); 
		F.setLayout(new GridLayout (4,2));
		F.add(new Label("First Number"));
		F.add(T1);
		F.add(new Label("Second Number"));
		F.add(T2);
		F.add(new Label());
		F.add(B);
		F.add(new Label("Result"));
		F.add(T3);
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent X) {
				float Result=0;
				float No1 = Float.parseFloat(T1.getText());
				float No2 = Float.parseFloat(T2.getText());
				String Sign = B.getLabel();
				if(Sign.contentEquals("Addition")) {
					Result = No1 + No2;
				}
				if(Sign.contentEquals("Subtraction")) {
					Result = No1 - No2;
				}
				if(Sign.contentEquals("Multiplication")) {
					Result = No1 * No2;
				}
				if(Sign.contentEquals("Division")) {
					Result = No1 / No2;
				}
				T3.setText(Float.toString(Result));
			}
		});
		F.setSize(400,400);
	}
}
