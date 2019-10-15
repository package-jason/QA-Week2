import java.awt.*;
public class WindowsXP {
    public static void main(String XYZ[]) {
        Frame F = new Frame("QA Consulting");
        Button B = new Button("Click Me");
        TextField T = new TextField();
        BEventhandler BClicked = new BEventhandler(T);
        B.addActionListener(BClicked);
        F.add(T, BorderLayout.NORTH);
        F.add(B, BorderLayout.CENTER);
        F.setSize(400,400);
        F.setVisible(true);
    }
}