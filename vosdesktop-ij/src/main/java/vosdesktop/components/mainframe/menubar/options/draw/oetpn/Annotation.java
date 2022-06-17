package vosdesktop.components.mainframe.menubar.options.draw.oetpn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Annotation implements Paintable {

    private String text;
    private Font font;

    private Rectangle2D annotation;

    public Annotation(String text, Font font, int x, int y) {
        this.text = text;
        this.font = font;
        annotation = new Rectangle2D.Double(x, y, 120, 15);
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean contains(Point p) {
        return annotation.contains(p);
    }

    public void moveTo(Point2D p) {
        annotation = new Rectangle2D.Double(p.getX(), p.getY(), 120,15);
    }

    public void paint(JComponent parent, Graphics2D g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setFont(font);
        FontMetrics fm = g2.getFontMetrics();
        int height = fm.getHeight();
        int width = fm.stringWidth(text);

        g2.setColor(Color.BLACK);
        g2.draw(annotation);

        double centreX = annotation.getX() + annotation.getWidth() / 2d;
        double centreY = annotation.getY() + annotation.getHeight() / 2d;
        g2.drawString(text, (int) (centreX - 30), (int) (centreY));
        g2.dispose();
    }

    public Rectangle2D getBounds() {
        return annotation.getBounds2D();
    }

}
