package ponggame;

/**
 *
 * @author Antin
 */
import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{
    GamePanel panel;
    public GameFrame(){
        panel = new GamePanel();
        setGUI();
    }
    public final void setGUI(){
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
