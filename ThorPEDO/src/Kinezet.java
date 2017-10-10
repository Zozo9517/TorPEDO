import javafx.scene.effect.DropShadow;

import javax.swing.*;
import java.awt.*;
import static java.awt.Color.*;

    public class Kinezet extends Component {

    public void ablak(){
        JFrame obj =new JFrame();

        obj.setBounds(10,10,1600,768);
        obj.setLayout(new GridLayout(0,2));
        obj.setBackground(Color.DARK_GRAY);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

        private static ImageIcon boat;
        private static int xpos=300;
        private static int ypos=300;

        public void paint(Graphics g)
        {
            boat=new ImageIcon("enemy.png");
            boat.paintIcon(this,g,xpos,ypos);
        }

    }
