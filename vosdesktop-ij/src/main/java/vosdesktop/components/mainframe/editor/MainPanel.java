package vosdesktop.components.mainframe.editor;

import vosdesktop.components.mainframe.menubar.options.draw.oetpn.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class MainPanel extends JPanel {

    // Variables for the grid
    private static final int MAX_COLS = 10000;
    private static final int MAX_ROWS = 10000;
    private static final int oX = 0;
    private static final int oY = 0;
    private static final int cellSide = 15;

    //
    private static Font baseFont;
    private List<Relationship> relationships = new ArrayList<>();
    private List<Place> places = new ArrayList<>();
    private List<ImmediateTransition> immediateTransitions = new ArrayList<>();
    private List<TimedTransition> timedTransitions = new ArrayList<>();

    private Paintable selectedShape;
    private Point2D offset;


    public MainPanel() {
        setBackground(new java.awt.Color(220, 220, 220));
        baseFont = new Font("Sans Serif", Font.BOLD, 11);

        this.setFont(baseFont);

        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                for (Paintable p : getShapes()) {
                    if (p.contains(e.getPoint())) {
                        selectedShape = p;
                        offset = new Point2D.Double(e.getX() - p.getBounds().getX(), e.getY() - p.getBounds().getY());
                        break;
                    }
                }
                if(e.getClickCount() == 2) {
                    for(Place place : places) {
                        if(place.contains(e.getPoint())) {
                            try {
                                String capacity = JOptionPane.showInputDialog("Place capacity", "Enter capacity...");
                                int k = Integer.parseInt(capacity);
                                while(k <= 0) {
                                    JOptionPane.showMessageDialog(null, "Not a positive integer!");
                                    capacity = JOptionPane.showInputDialog("Place capacity", "Enter capacity...");
                                    k = Integer.parseInt(capacity);
                                }
                                place.setCapacity(k);
                                repaint();
                                String tokens = JOptionPane.showInputDialog("Number of tokens", "Enter number of tokens...");
                                int tk = Integer.parseInt(tokens);
                                while(tk < 0) {
                                    JOptionPane.showMessageDialog(null, "Not a positive integer!");
                                    tokens = JOptionPane.showInputDialog("Number of tokens", "Enter number of tokens...");
                                    tk = Integer.parseInt(tokens);
                                }
                                if(tk > k) {
                                    JOptionPane.showMessageDialog(null,"Number of tokens cannot exceed capacity!");
                                    return;
                                }
                                place.setTokens(tk);
                                repaint();
                            }
                            catch(NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Not a number!");
                                return;
                            }
                            break;
                        }
                    }
                    for(ImmediateTransition immediateTransition : immediateTransitions) {
                        if(immediateTransition.contains(e.getPoint())) {
                            try {
                                String weight = JOptionPane.showInputDialog("Immediate transition weight", "Enter weight...");
                                int w = Integer.parseInt(weight);
                                while(w <= 0) {
                                    JOptionPane.showMessageDialog(null, "Not a positive integer!");
                                    weight = JOptionPane.showInputDialog("Immediate transition weight", "Enter weight...");
                                    w = Integer.parseInt(weight);
                                }
                                immediateTransition.setWeight(w);
                                repaint();
                                String priority = JOptionPane.showInputDialog("Immediate transition priority", "Enter priority...");
                                int p = Integer.parseInt(priority);
                                while(p <= 0) {
                                    JOptionPane.showMessageDialog(null, "Not a positive integer!");
                                    priority = JOptionPane.showInputDialog("Immediate transition priority", "Enter priority...");
                                    p = Integer.parseInt(priority);
                                }
                                immediateTransition.setPriority(p);
                                repaint();
                            }
                            catch(NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Not a number!");
                                return;
                            }
                            break;
                        }
                    }
                    for(TimedTransition timedTransition : timedTransitions) {
                        if(timedTransition.contains(e.getPoint())) {
                            try {
                                String rate = JOptionPane.showInputDialog("Timed transition rate", "Enter rate...");
                                int r = Integer.parseInt(rate);
                                while(r < 0) {
                                    JOptionPane.showMessageDialog(null, "Not a positive integer!");
                                    rate = JOptionPane.showInputDialog("Timed transition rate", "Enter rate...");
                                    r = Integer.parseInt(rate);
                                }
                                timedTransition.setRate(r);
                                repaint();
                            }
                            catch(NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Not a number!");
                                return;
                            }
                            break;
                        }
                    }
                }
            }
            public void mouseReleased(MouseEvent e) {
                selectedShape = null;
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (selectedShape != null) {
                    Point2D p = new Point2D.Double(e.getX() - offset.getX(), e.getY() - offset.getX());
                    selectedShape.moveTo(p);
                }
                repaint();
            }
        });
    }

    protected List<Paintable> getShapes() {
        ArrayList<Paintable> shapes = new ArrayList<>();
        shapes.addAll(places);
        shapes.addAll(immediateTransitions);
        shapes.addAll(timedTransitions);
        return shapes;
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g.create();
        for(int i=0 ; i<MAX_ROWS+1; i++) {
            g2d.drawLine(oX, oY + i * cellSide, oX + MAX_COLS * cellSide, oY + i * cellSide);
        }
        for(int i=0 ; i<MAX_COLS+1 ; i++) {
            g2d.drawLine(oX + i * cellSide, oY, oX + i * cellSide, oY + MAX_ROWS * cellSide);
        }
        for (Relationship relationship : relationships) {
            Point2D p1 = new Point2D.Double(relationship.getParent().getBounds().getCenterX(), relationship.getParent().getBounds().getCenterY());
            Point2D p2 = new Point2D.Double(relationship.getChild().getBounds().getCenterX(), relationship.getChild().getBounds().getCenterY());
            g2d.draw(new Line2D.Double(p1, p2));
        }
        for (Place place : places) {
            place.paint(this, g2d);
        }
        for(ImmediateTransition immediateTransition : immediateTransitions) {
            immediateTransition.paint(this,g2d);
        }
        for(TimedTransition timedTransition : timedTransitions) {
            timedTransition.paint(this,g2d);
        }
        g2d.dispose();
    }

    protected void relate(Place p, ImmediateTransition t) {
        relationships.add(new Relationship(p, t));
    }

    public void addPlace(Place place) {
        places.add(place);
        repaint();
    }

    public void addImmediateTransition(ImmediateTransition immediateTransition) {
        immediateTransitions.add(immediateTransition);
        repaint();
    }

    public void addTimedTransition(TimedTransition timedTransition) {
        timedTransitions.add(timedTransition);
        repaint();
    }
}
