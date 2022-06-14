package vosdesktop.components.mainframe.menubar.options.edit;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class UndoOption extends Option {

    private JMenuItem undo;

    public UndoOption() { initComponents(); }

    private void initComponents() {
        undo = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\undo.png"));
        setText("Undo");
        setOption(undo);
        setToolTipText("Undo an operation");
    }

    public void setOption(JMenuItem undo) { this.undo = undo; }
}
