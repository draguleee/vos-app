package vosdesktop.components.mainframe.menubar.options.draw.oetpn;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Place implements Paintable {

    private String name;
    private Font font;
    private int capacity;
    private int tokens;

    private Ellipse2D place;

    public Place(String name, Font font, int x, int y) {
        this.name = name;
        this.font = font;
        place = new Ellipse2D.Double(x, y, 30, 30);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) { this.name = name; }

    public int getCapacity() { return this.capacity; }

    public void setCapacity(int capacity) { this.capacity = capacity; }

    public int getTokens() { return this.tokens; }

    public void setTokens(int tokens) { this.tokens = tokens; }

    public boolean contains(Point p) {
        return place.contains(p);
    }

    public void moveTo(Point2D p) {
        place = new Ellipse2D.Double(p.getX(), p.getY(), 30,30);
    }

    public void paint(JComponent parent, Graphics2D g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setFont(font);
        FontMetrics fm = g2.getFontMetrics();
        int height = fm.getHeight();
        int width = fm.stringWidth(name);

        g2.setColor(Color.WHITE);
        g2.fill(place);
        g2.setColor(Color.BLACK);
        g2.draw(place);

        double centreX = place.getX() + place.getWidth() / 2d;
        double centreY = place.getY() + place.getHeight() / 2d;
        g2.drawString(name, (int) (centreX - 30), (int) (centreY - 10));
        g2.drawString("k = " + String.valueOf(capacity), (int) (centreX - 45), (int) (centreY + 5));
        g2.drawString(String.valueOf(tokens), (int) (centreX - width / 4), (int) (centreY + height / 4));

        g2.dispose();
    }

    public Rectangle2D getBounds() {
        return place.getBounds2D();
    }

}
