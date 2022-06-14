package vosdesktop.components.mainframe.toolbar.sections.view;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class ZoomOutButton extends AbstractButton {

    private JButton zoomOutButton;

    public ZoomOutButton() { initComponents(); }

    private void initComponents() {
        zoomOutButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\zoom-out.png"));
        setButton(zoomOutButton);
        setToolTipText("Zooms out the grid");
    }

    public void setButton(JButton zoomOutButton) { this.zoomOutButton = zoomOutButton; }
}
