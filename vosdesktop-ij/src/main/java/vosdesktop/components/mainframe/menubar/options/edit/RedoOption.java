package vosdesktop.components.mainframe.menubar.options.edit;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class RedoOption extends Option {

    private JMenuItem redo;

    public RedoOption() { initComponents(); }

    private void initComponents() {
        redo = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\redo.png"));
        setText("Redo");
        setOption(redo);
        setToolTipText("Redo an operation");
    }

    public void setOption(JMenuItem redo) { this.redo = redo; }
}
