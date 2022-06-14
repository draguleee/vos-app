package vosdesktop.components.mainframe.toolbar.sections.simulate;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class EditModeButton extends AbstractButton {

    private JButton editModeButton;

    public EditModeButton() { initComponents(); }

    private void initComponents() {
        editModeButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\edit.png"));
        setButton(editModeButton);
        setToolTipText("Enter edit mode");
    }

    public void setButton(JButton editModeButton) { this.editModeButton = editModeButton; }
}
