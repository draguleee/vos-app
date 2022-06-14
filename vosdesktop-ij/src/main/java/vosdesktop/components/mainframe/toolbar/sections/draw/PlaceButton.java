package vosdesktop.components.mainframe.toolbar.sections.draw;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class PlaceButton extends AbstractButton {

    private JButton placeButton;

    public PlaceButton() { initComponents(); }

    private void initComponents() {
        placeButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\place.png"));
        setButton(placeButton);
        setToolTipText("Insert a place");
    }

    public void setButton(JButton placeButton) { this.placeButton = placeButton; }
}
