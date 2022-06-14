package vosdesktop.components.mainframe.menubar.options.draw.oetpn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Annotation extends JTextField {

    private volatile int draggedAtX, draggedAtY;

    public Annotation(String text) {
        super(text);
        setDoubleBuffered(false);
        setSize(100, 20);
        setBackground(Color.white);
        setForeground(Color.black);
        getBaselineResizeBehavior();

        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                draggedAtX = e.getX();
                draggedAtY = e.getY();
                if(e.getButton() == MouseEvent.BUTTON3) {
                    setVisible(false);
                    setText(null);
                }
            }
        });

        addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent e){
                setLocation(e.getX() - draggedAtX + getLocation().x,
                        e.getY() - draggedAtY + getLocation().y);
            }
        });
    }

}
