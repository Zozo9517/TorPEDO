import javax.swing.*;
import java.awt.*;
import static java.awt.Color.*;

public class Kinezet extends Main {

    public void ablak(){
        JFrame obj =new JFrame();


        obj.setBounds(10,10,1600,768);
        obj.setBackground(Color.DARK_GRAY);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
