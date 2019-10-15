import java.awt.*;
import java.awt.event.*;
public class EventHandler implements ActionListener {
    TextField TXT1;
    TextField TXT2;
    Label error;
    String test = "";
    
    public EventHandler(TextField T1, TextField T2) {
        TXT1 = T1;
        TXT2 = T2;
        
        // T1 reference variable stored in TXT1
    
    }
    public void actionPerformed(ActionEvent AE) {
    	
    	String output = "";
        String test = TXT1.getText();
        int num = Integer.parseInt(test);
        String ones[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
                " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen",
                " Nineteen" };
        String tens[] = { " ", " ", " Twenty", " Thirty", " Fourty", " Fifty", " Sixty", " Seventy", " Eighty",
                " Ninety" };
        if(num >= 1000) {
            output += ones[num/1000] + " Thousand";
            if(num%1000 != 0) {
            	// != means not equal
            	output += ",";
            }
            num %= 1000;
        }
        if(num >= 100) {
            output += ones[num/100] + " Hundred";
            if(num%100 != 0) {
            	output += " and";
            }
            num %= 100;
        }
        
        if(num >= 20) {
            output += tens[num/10];
            num %= 10;
        }
        if(num >= 1) {
            output += ones[num];
        }
        
        TXT2.setText(output);
    }
}