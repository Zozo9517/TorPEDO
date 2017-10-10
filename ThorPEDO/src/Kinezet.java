import javax.swing.*;
import java.awt.*;

public class Kinezet extends Main {

    public void ablak(){
        JFrame obj =new JFrame();


        obj.setBounds(10,10,1600,768);
        obj.setLayout(new GridLayout(0,2));
        obj.add(new JButton("bal oldal"));
        obj.add(new JButton("jobb oldal"));
        obj.setBackground(Color.DARK_GRAY);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
