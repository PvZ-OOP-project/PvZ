package PvZ;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GamePanel extends JPanel implements ActionListener{
    
    final int PANEL_WIDTH = 1066;
    final int PANEL_HEIGHT = 600;

    Image zombie;
    Image backyardImage;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    GamePanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT)); //set the size of this class
        this.setBackground(Color.black); //set background as black
        this.setDoubleBuffered(true); //set true: all the drawing from this component will be done in an offscreen painting buffer
        //in short, enabling this can improve game's rendering performance
        zombie = new ImageIcon("zombie_normal.gif").getImage();
        backyardImage = new ImageIcon("backyard.png").getImage();
        timer = new Timer(10,this);
        timer.start();
    }

    public void paint(Graphics g){
        
        super.paint(g); //paint background

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backyardImage,0,0, null);
        g2D.drawImage(zombie,x,y,null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + xVelocity;
        repaint(); //another way to call method paint many times

    }
}
