package vosdesktop.components.mainframe.toolbar.sections.file;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class SaveButton extends AbstractButton {

    private JButton saveButton;

    public SaveButton() { initComponents(); }

    private void initComponents() {
        saveButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\save.png"));
        setButton(saveButton);
        setToolTipText("Saves a simulation");
    }

    public void setButton(JButton saveButton) { this.saveButton = saveButton; }
}
