package vosdesktop.components.mainframe.toolbar.sections.edit;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class CopyButton extends AbstractButton {

    private JButton copyButton;

    public CopyButton() { initComponents(); }

    private void initComponents() {
        copyButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\copy.png"));
        setButton(copyButton);
        setToolTipText("Copy an object");
    }

    public void setButton(JButton copyButton) { this.copyButton = copyButton; }
}
