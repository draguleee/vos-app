package vosdesktop.components.mainframe.toolbar.sections.draw;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class DeleteTokenButton extends AbstractButton {

    private JButton deleteTokenButton;

    public DeleteTokenButton() { initComponents(); }

    private void initComponents() {
        deleteTokenButton= new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\delete-token.png"));
        setButton(deleteTokenButton);
        setToolTipText("Delete a token");
    }

    public void setButton(JButton deleteTokenButton) { this.deleteTokenButton = deleteTokenButton; }
}
