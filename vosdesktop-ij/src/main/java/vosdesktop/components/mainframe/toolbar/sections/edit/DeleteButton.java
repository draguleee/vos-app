package vosdesktop.components.mainframe.toolbar.sections.edit;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class DeleteButton extends AbstractButton {

    private JButton deleteButton;

    public DeleteButton() { initComponents(); }

    private void initComponents() {
        deleteButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\delete.png"));
        setButton(deleteButton);
        setToolTipText("Delete an object");
    }

    public void setButton(JButton deleteButton) { this.deleteButton = deleteButton; }
}
