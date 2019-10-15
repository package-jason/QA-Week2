import java.awt.event.*;
import java.awt.TextField;

public class BEventhandler implements ActionListener {
	TextField TXT;

	public BEventhandler(TextField X) {
		TXT = X;
	}

	public void actionPerformed(ActionEvent E) {
		TXT.setText("Hello My Friends");
	}
}
