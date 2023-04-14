package PvZ;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{
    
    GamePanel panel;

    GameFrame(){
        panel = new GamePanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Plants Vs Zombies");

        this.add(panel);
        
        this.pack();
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
