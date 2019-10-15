
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window10 {
	public static void main(String XYZ[]) {
		Frame F = new Frame();
		Button B1 = new Button("A");
		Button B2 = new Button("B");
		F.setLayout(new GridLayout(1, 2));
		F.add(B1);
		F.add(B2);

		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent X) {
				System.out.println("A is clicked");
			}
		}

		);
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent J) {
				System.out.println("B is clicked");
			}
		});

		F.setSize(400, 400);
		F.setVisible(true);

	}
}
