package vosdesktop.components.mainframe.toolbar.sections.view;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class ZoomInButton extends AbstractButton {

    private JButton zoomInButton;

    public ZoomInButton() { initComponents(); }

    private void initComponents() {
        zoomInButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\zoom-in.png"));
        setButton(zoomInButton);
        setToolTipText("Zooms in the panel");
    }

    public void setButton(JButton zoomInButton) { this.zoomInButton = zoomInButton; }
}
