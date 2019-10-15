import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener{
    TextField screen;
    String Operation;
    int a;
        public EventHandler(TextField T1){
        screen=T1;
        }
        public void actionPerformed(ActionEvent AE) {
            Button btn;
            btn=(Button)AE.getSource();
            String sign=btn.getLabel();
            System.out.println(sign);
            int b=0,c=0;
            
            if (sign.equals("0")) {
                screen.setText(String.valueOf(screen.getText()+sign));
            }
            if (sign.equals("1")) {
                screen.setText(String.valueOf(screen.getText()+sign));
            }
            if (sign.equals("2")) {
                screen.setText(String.valueOf(screen.getText()+sign));
            }
            if (sign.equals("3")) {
                screen.setText(String.valueOf(screen.getText()+sign));
            }
            if (sign.equals("4")) {
                screen.setText(String.valueOf(screen.getText()+sign));
            }
            if (sign.equals("5")) {
                screen.setText(String.valueOf(screen.getText()+sign));
            }
            if (sign.equals("6")) {
                screen.setText(String.valueOf(screen.getText()+sign));
            }
            if (sign.equals("7")) {
                screen.setText(String.valueOf(screen.getText()+sign));
            }
            if (sign.equals("8")) {
                screen.setText(String.valueOf(screen.getText()+sign));
            }
            if (sign.equals("9")) {
                screen.setText(String.valueOf(screen.getText()+sign));
            }
            if (sign.equals("C")) {
                screen.setText(String.valueOf(""));
            }
            if(sign.equals("+")) {
                a=Integer.parseInt(screen.getText());
                screen.setText("");
                Operation="+";
            }
            if(sign.equals("-")) {
                a=Integer.parseInt(screen.getText());
                screen.setText("");
                Operation="-";
             }    
            if(sign.equals("x")) {
                a=Integer.parseInt(screen.getText());
                screen.setText("");
            }    
            if(sign.equals("/")) {
                a=Integer.parseInt(screen.getText());
                screen.setText("");
            }
            if (sign.equals("=")) {
                b=Integer.parseInt(screen.getText());
                if (Operation.contentEquals("+")){
                    c=a+b;
                    
                }
                if (Operation.contentEquals("-")){
                    c=a-b;
                    
                }
                
                screen.setText(String.valueOf(c));
            }
        
    }
}