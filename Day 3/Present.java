import java.awt.*;
import java.applet.*;
import java.util.*;
public class Present extends Box
{
    private Point p1;
    private Point p2;
    public Present(int x, int y, int x2, int y2){
        p1 = new Point(x, y);
        p2 = new Point(x2, y2);
    }
    public void draw(Graphics g) {
        g.setColor(new Color(Math.random()*256, Math.random()*256, Math.random()*256)); 
        g.fillRect(p1.getX(), p1.getY(), p2.getX(), p2.getX());
        g.fillRect(p1.getX()+50,p1.getY()+50,p2.getX(),p2.getX());
        g.drawLine(p1.getX(), p1.getY(),p1.getX()+50,p1.getY()+50);
        g.drawLine(p1.getX(), p1.getY()+p2.getX(), p1.getX()+50,p1.getY()+50+p2.getX());
        g.drawLine(p1.getX()+p2.getX(),p1.getY(), p1.getX()+50+ p2.getX(),p1.getY()+50);
        g.drawLine(p1.getX()+p2.getX(),p1.getY()+p2.getX(),
        p1.getX()+ 50 + p2.getX(), p1.getY() + 50 + p2.getX());
}
