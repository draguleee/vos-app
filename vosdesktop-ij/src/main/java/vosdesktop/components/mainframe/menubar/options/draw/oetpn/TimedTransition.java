package vosdesktop.components.mainframe.menubar.options.draw.oetpn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class TimedTransition implements Paintable {

    String name;
    Font font;
    int rate;

    private Rectangle2D timedTransition;

    public TimedTransition(String name, Font font, int x, int y) {
        this.name = name;
        this.font = font;
        timedTransition = new Rectangle2D.Double(x,y,15,30);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) { this.name = name; }

    public int getRate() { return this.rate; }

    public void setRate(int rate) { this.rate = rate; }

    public boolean contains(Point p) {
        return timedTransition.contains(p);
    }

    public void moveTo(Point2D p) {
        timedTransition = new Rectangle2D.Double(p.getX(), p.getY(), 15,30);
    }

    public void paint(JComponent parent, Graphics2D g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setFont(font);
        FontMetrics fm = g2.getFontMetrics();
        int height = fm.getHeight();
        int width = fm.stringWidth(name);

        g2.setColor(Color.WHITE);
        g2.fill(timedTransition);
        g2.setColor(Color.BLACK);
        g2.draw(timedTransition);

        double centreX = timedTransition.getX() + timedTransition.getWidth() / 2d;
        double centreY = timedTransition.getY() + timedTransition.getHeight() / 2d;
        g2.drawString(name, (int) (centreX - width / 2), (int) (centreY - 30));
        g2.drawString("r = " + String.valueOf(rate), (int) (centreX - width / 2), (int) (centreY - 20));

        g2.dispose();
    }

    public Rectangle2D getBounds() {
        return timedTransition.getBounds2D();
    }
}
