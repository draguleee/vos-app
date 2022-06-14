package vosdesktop.components.mainframe.menubar.options.draw;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class PlaceOption extends Option {

    private JMenuItem place;

    public PlaceOption() { initComponents(); }

    private void initComponents() {
        place = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_P, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\place.png"));
        setText("Place");
        setOption(place);
        setToolTipText("Insert a place");
    }

    public void setOption(JMenuItem place) { this.place = place; }

}
