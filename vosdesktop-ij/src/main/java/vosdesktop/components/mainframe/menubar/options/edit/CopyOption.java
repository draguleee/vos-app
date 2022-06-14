package vosdesktop.components.mainframe.menubar.options.edit;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class CopyOption extends Option {

    private JMenuItem copy;

    public CopyOption() { initComponents(); }

    private void initComponents() {
        copy = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\copy.png"));
        setText("Copy");
        setOption(copy);
        setToolTipText("Copy an object");
    }

    public void setOption(JMenuItem copy) { this.copy = copy; }
}
