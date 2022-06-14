package vosdesktop.components.mainframe.toolbar.sections.edit;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class PasteButton extends AbstractButton {

    private JButton pasteButton;

    public PasteButton() { initComponents(); }

    private void initComponents() {
        pasteButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\paste.png"));
        setButton(pasteButton);
        setToolTipText("Paste an object");
    }

    public void setButton(JButton pasteButton) { this.pasteButton = pasteButton; }
}
