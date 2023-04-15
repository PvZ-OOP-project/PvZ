package Control;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class GamePanel extends JPanel implements ActionListener{
    
    final int PANEL_WIDTH = 1066;
    final int PANEL_HEIGHT = 600;

    Image zombie;
    Image backyardImage;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 20;

    //variable to control by mouse
    ImageIcon image = new ImageIcon("zombie_normal.gif");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prePt;

    public GamePanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT)); //set the size of this class
        this.setBackground(Color.black); //set background as black
        this.setDoubleBuffered(true); //set true: all the drawing from this component will be done in an offscreen painting buffer
        //in short, enabling this can improve game's rendering performance
        
        zombie = new ImageIcon("zombie_normal.gif").getImage();
        backyardImage = new ImageIcon("backyard.png").getImage();
        
        //DragPanel: use mouse to control plants
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
        

        timer = new Timer(10,this);
        timer.start();
    }

    public void paint(Graphics g){
        
        super.paint(g); //paint background

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backyardImage,0,0, null); // draw backyard
        
        // draw grid
        g2D.setColor(Color.BLACK);
        g2D.drawLine(0,80,1066,80);
        g2D.drawLine(0,180,1066,180);
        g2D.drawLine(0,280,1066,280);
        g2D.drawLine(0,380,1066,380);
        g2D.drawLine(0,480,1066,480);
        g2D.drawLine(0,580,1066,580);

        g2D.drawLine(250,0,250,600);
        g2D.drawLine(330,0,330,600);
        g2D.drawLine(410,0,410,600);
        g2D.drawLine(490,0,490,600);
        g2D.drawLine(570,0,570,600);
        g2D.drawLine(650,0,650,600);
        g2D.drawLine(730,0,730,600);
        g2D.drawLine(810,0,810,600);
        g2D.drawLine(890,0,890,600);
        g2D.drawLine(970,0,970,600);
        
        //draw Zombie moving
        g2D.drawImage(zombie,x,y,null);
        g2D.drawImage(zombie,x,y+100,null);
        g2D.drawImage(zombie,x,y+200,null);
        g2D.drawImage(zombie,x,y+300,null);
        g2D.drawImage(zombie,x,y+400,null);

        //draw plants can be clicked
        image.paintIcon(this, g,(int) imageCorner.getX(),(int)imageCorner.getY());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + xVelocity;
        repaint(); //another way to call method paint many times

    }


    //Control by mouse
    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prePt = e.getPoint();   
        }
    }
    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();
            imageCorner.translate((int)(currentPt.getX()-prePt.getX()),(int)(currentPt.getY()-prePt.getY()));
            prePt = currentPt;
            repaint();
        }
    }

}
