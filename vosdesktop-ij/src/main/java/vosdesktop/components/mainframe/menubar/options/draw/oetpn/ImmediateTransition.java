package vosdesktop.components.mainframe.menubar.options.draw.oetpn;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class ImmediateTransition implements Paintable {

    String name;
    Font font;
    int priority;

    private Rectangle2D immediateTransition;

    public ImmediateTransition(String name, Font font, int x, int y) {
        this.name = name;
        this.font = font;
        immediateTransition = new Rectangle2D.Double(x,y,15,30);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) { this.name = name; }

    public int getPriority() { return this.priority; }

    public void setPriority(int priority) { this.priority = priority; }

    public boolean contains(Point p) {
        return immediateTransition.contains(p);
    }

    public void moveTo(Point2D p) {
        immediateTransition = new Rectangle2D.Double(p.getX(), p.getY(), 15,30);
    }

    public void paint(JComponent parent, Graphics2D g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setFont(font);
        FontMetrics fm = g2.getFontMetrics();
        int height = fm.getHeight();
        int width = fm.stringWidth(name);

        g2.setColor(Color.BLACK);
        g2.fill(immediateTransition);
        g2.setColor(Color.BLACK);
        g2.draw(immediateTransition);

        double centreX = immediateTransition.getX() + immediateTransition.getWidth() / 2d;
        double centreY = immediateTransition.getY() + immediateTransition.getHeight() / 2d;
        g2.drawString(name, (int) (centreX - width / 2), (int) (centreY - 40));
        g2.drawString("p = " + String.valueOf(priority), (int)(centreX - width / 2), (int) (centreY -20));

        g2.dispose();
    }

    public Rectangle2D getBounds() {
        return immediateTransition.getBounds2D();
    }

}
