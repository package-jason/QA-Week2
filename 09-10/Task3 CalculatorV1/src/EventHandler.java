import java.awt.*;
import java.awt.event.*;

public class EventHandler implements ActionListener {
	TextField TXT1;
	Label error;
	String AS = "";
	String BS = "";
	// this is what's coming from the screen
	float A = 0;
	float B = 0;
	float C = 0;
	int sign = 0;
	int firstDone = 0;

	public EventHandler(TextField T1) {
		TXT1 = T1;
	}
	
	// assigning to global variable

	public void actionPerformed(ActionEvent AE) {
		Button Btn;
		Btn = (Button) AE.getSource();
		String signgn = Btn.getLabel();

		if (signgn.contentEquals("1")) {
			TXT1.setText(TXT1.getText() + "1");
		} else if (signgn.contentEquals("2")) {
			TXT1.setText(TXT1.getText() + "2");
		} else if (signgn.contentEquals("3")) {
			TXT1.setText(TXT1.getText() + "3");
		} else if (signgn.contentEquals("4")) {
			TXT1.setText(TXT1.getText() + "4");
		} else if (signgn.contentEquals("5")) {
			TXT1.setText(TXT1.getText() + "5");
		} else if (signgn.contentEquals("6")) {
			TXT1.setText(TXT1.getText() + "6");
		} else if (signgn.contentEquals("7")) {
			TXT1.setText(TXT1.getText() + "7");
		} else if (signgn.contentEquals("8")) {
			TXT1.setText(TXT1.getText() + "8");
		} else if (signgn.contentEquals("9")) {
			TXT1.setText(TXT1.getText() + "9");
		} else if (signgn.contentEquals("0")) {
			TXT1.setText(TXT1.getText() + "0");
		} else if (signgn.contentEquals("+")) {
			if (firstDone == 0) {
				AS = TXT1.getText();
				firstDone = 1;
				sign = 1;
				TXT1.setText("");
				// setting screen to empty string
			}
		} else if (signgn.contentEquals("-")) {
			if (firstDone == 0) {
				AS = TXT1.getText();
				firstDone = 1;
				sign = 2;
				TXT1.setText("");
			}
		} else if (signgn.contentEquals("x")) {
			if (firstDone == 0) {
				AS = TXT1.getText();
				firstDone = 1;
				sign = 3;
				TXT1.setText("");
			}
		} else if (signgn.contentEquals("÷")) {
			if (firstDone == 0) {
				AS = TXT1.getText();
				firstDone = 1;
				sign = 4;
				TXT1.setText("");
			}
		} else if (signgn.contentEquals("C")) {
			AS = "";
			BS = "";
			firstDone = 0;
			sign = 0;
			TXT1.setText("");
		} else if (signgn.contentEquals("=")) {
			if (firstDone == 1) {
				BS = TXT1.getText();
				try {
					A = Float.parseFloat(AS);
					B = Float.parseFloat(BS);
				} catch (NumberFormatException uhoh) {
					TXT1.setText("Digits only, please");
					// error.setsignze(112,20);
				}
				if (sign == 1) {
					C = A + B;
				} else if (sign == 2) {
					C = A - B;
				} else if (sign == 3) {
					C = A * B;
				} else if (sign == 4) {
					C = A / B;
				}
				TXT1.setText(Float.toString(C));
				A = 0;
				B = 0;
				C = 0;
				AS = "";
				BS = "";
				firstDone = 0;
				sign = 0;

			}
		}

	}
}