package vosdesktop.components.mainframe.menubar.options.draw.oetpn;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Arc implements Paintable {

    String arc;

    @Override
    public void paint(JComponent parent, Graphics2D g2d) {

    }

    @Override
    public boolean contains(Point p) {
        return false;
    }

    @Override
    public void moveTo(Point2D p) {

    }

    @Override
    public Rectangle2D getBounds() {
        return null;
    }
}
