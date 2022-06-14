package vosdesktop.components.mainframe.menubar.options.edit;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class SelectAllOption extends Option {

    private JMenuItem selectAll;

    public SelectAllOption() { initComponents(); }

    private void initComponents() {
        selectAll = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\select-all.png"));
        setText("Select All");
        setOption(selectAll);
        setToolTipText("Select all objects");
    }

    public void setOption(JMenuItem selectAll) { this.selectAll = selectAll; }
}
