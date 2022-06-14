package vosdesktop.components.mainframe.toolbar.sections.edit;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class SelectAllButton extends AbstractButton {

    private JButton selectAllButton;

    public SelectAllButton() { initComponents(); }

    private void initComponents() {
        selectAllButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\select-all.png"));
        setButton(selectAllButton);
        setToolTipText("Select all objects");
    }

    public void setButton(JButton selectAllButton) { this.selectAllButton = selectAllButton; }
}
