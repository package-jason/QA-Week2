import java.awt.*;
import java.awt.event.*;

public class SubEventhandler implements ActionListener {
	TextField TXT1, TXT2, TXT3;
	Label error;

	public SubEventhandler(TextField T1, TextField T2, TextField T3, Label E) {
		TXT1 = T1;
		TXT2 = T2;
		TXT3 = T3;
		error = E;
	}

	public void actionPerformed(ActionEvent E) {
		float NO1, NO2, Result;
		try {
			Result = Float.parseFloat(TXT1.getText()) - Float.parseFloat(TXT2.getText());
			TXT3.setText(Float.toString(Result));
		} catch (NumberFormatException F) {
			error.setText("Digits only please");
		}
	}
}
