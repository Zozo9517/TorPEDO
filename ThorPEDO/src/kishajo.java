import javax.swing.*;
import java.awt.*;


public class kishajo extends Component {
    private ImageIcon boath;
    private int xpos=300;
    private  int ypos=300;
public kishajo(){


}
    public void paint(Graphics g)
    {
        boath=new ImageIcon("enemy.png");
        boath.paintIcon(this,g,xpos,ypos);
    }

}
