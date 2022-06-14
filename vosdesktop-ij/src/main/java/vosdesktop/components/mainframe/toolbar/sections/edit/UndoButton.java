package vosdesktop.components.mainframe.toolbar.sections.edit;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class UndoButton extends AbstractButton {

    private JButton undoButton;

    public UndoButton() { initComponents(); }

    private void initComponents() {
        undoButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\undo.png"));
        setButton(undoButton);
        setToolTipText("Undo an operation");
    }

    public void setButton(JButton undoButton) { this.undoButton = undoButton; }
}
