package vosdesktop.components.mainframe.toolbar.sections.view;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class DragButton extends AbstractButton {

    private JButton dragButton;

    public DragButton() { initComponents(); }

    private void initComponents() {
        dragButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\drag.png"));
        setButton(dragButton);
        setToolTipText("Enable / disable drag");
    }

    public void setButton(JButton dragButton) { this.dragButton = dragButton; }
}
