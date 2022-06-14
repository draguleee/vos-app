package vosdesktop.components.mainframe.toolbar.sections.view;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class GridButton extends AbstractButton {

    private JButton gridButton;

    public GridButton() { initComponents(); }

    private void initComponents() {
        gridButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\grid.png"));
        setButton(gridButton);
        setToolTipText("Enable / disable grid");
    }

    public void setButton(JButton gridButton) { this.gridButton = gridButton; }
}
