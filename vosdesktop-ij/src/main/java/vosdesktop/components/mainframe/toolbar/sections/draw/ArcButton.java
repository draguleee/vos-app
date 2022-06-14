package vosdesktop.components.mainframe.toolbar.sections.draw;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class ArcButton extends AbstractButton {

    private JButton arcButton;

    public ArcButton() { initComponents(); }

    private void initComponents() {
        arcButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\arc.png"));
        setButton(arcButton);
        setToolTipText("Insert an arc");
    }

    public void setButton(JButton arcButton) { this.arcButton = arcButton; }
}
