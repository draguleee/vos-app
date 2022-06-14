package vosdesktop.components.mainframe.toolbar.sections.edit;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class SelectButton extends AbstractButton {

    private JButton selectButton;

    public SelectButton() { initComponents(); }

    private void initComponents() {
        selectButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\select.png"));
        setButton(selectButton);
        setToolTipText("Select an object");
    }

    public void setButton(JButton selectButton) { this.selectButton = selectButton; }
}


