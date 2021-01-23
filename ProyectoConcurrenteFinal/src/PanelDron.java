/**
 * @author Gerardo Miguel Quechol Zarate        201768662
 * @version final 2
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class PanelDron extends JPanel{
    private MiX x;
    private MiY y;
    private int n;
    public PanelDron(MiX x, MiY y, int n){
        this.x=x;
        this.y=y;
        this.n=n;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.black);
        g2.fill(new Ellipse2D.Double(x.getMiX(),y.getMiY(),20,20));
        g2.setColor(Color.white);
        g2.drawString(String.valueOf(n),x.getMiX()+7,y.getMiY()+14);
    }
}
