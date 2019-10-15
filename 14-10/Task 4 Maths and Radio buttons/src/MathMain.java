import java.awt.Button;
import java.awt.Container;

import javax.swing.SwingUtilities;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MathMain {
	public static void main(String[] args) {
		
		
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
		
				
		
		
		frame.setLayout(new GridLayout(4, 3));
		frame.add(B1);
		frame.add(B2);
		frame.add(B3);
		frame.add(B4);
		Operations opt = new Operations();
		
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent X) {
				opt.F.setTitle("Addition");
				opt.B.setLabel("Addition");
				opt.F.setVisible(true);
			}
		});
		
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent S) {
				opt.F.setTitle("Subtraction");
				opt.B.setLabel("Subtraction");
				opt.F.setVisible(true);
			}
		});
		
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent M) {
				opt.F.setTitle("Multiplication");
				opt.B.setLabel("Multiplication");
				opt.F.setVisible(true);
			}
		});
		
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent M) {
				opt.F.setTitle("Division");
				opt.B.setLabel("Division");
				opt.F.setVisible(true);
			}
		});
		frame.setSize(200,200);
		frame.setVisible(true);
	}
}
