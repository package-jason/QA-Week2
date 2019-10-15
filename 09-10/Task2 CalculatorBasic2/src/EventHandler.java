import java.awt.*;
import java.awt.event.*;

public class EventHandler implements ActionListener {
	TextField TXT1, TXT2, TXT3;
	Label error;

	public EventHandler(TextField T1, TextField T2, TextField T3, Label ER) {
		TXT1 = T1;
		TXT2 = T2;
		TXT3 = T3;
		error = ER;
	}

	public void actionPerformed(ActionEvent AE) {
		float A = 0;
		float B = 0;
		float C = 0;
		Button Btn;
		Btn = (Button) AE.getSource();
		String sign = Btn.getLabel();

		try {
			A = Float.parseFloat(TXT1.getText());
			B = Float.parseFloat(TXT2.getText());
		} catch (NumberFormatException noDigits) {
			error.setText("Digits Only please");
		}
		
		

		if (sign.contentEquals("+")) {
			C = A + B;
		} else if (sign.contentEquals("-")) {
			C = A - B;
		} else if (sign.contentEquals("x")) {
			C = A * B;
		} else if (sign.contentEquals("÷")) {
			C = A / B;
		}
		TXT3.setText(Float.toString(C));
	}
}