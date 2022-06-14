package vosdesktop.components.mainframe.toolbar.sections.edit;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class RedoButton extends AbstractButton {

    private JButton redoButton;

    public RedoButton() { initComponents(); }

    private void initComponents() {
        redoButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\redo.png"));
        setButton(redoButton);
        setToolTipText("Redo an operation");
    }

    public void setButton(JButton redoButton) { this.redoButton = redoButton; }
}
