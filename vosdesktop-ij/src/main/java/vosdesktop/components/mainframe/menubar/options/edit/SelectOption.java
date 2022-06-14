package vosdesktop.components.mainframe.menubar.options.edit;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class SelectOption extends Option {

    private JMenuItem select;

    public SelectOption() { initComponents(); }

    private void initComponents() {
        select = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\select.png"));
        setText("Select");
        setOption(select);
        setToolTipText("Select an object");
    }

    public void setOption(JMenuItem select) { this.select = select; }
}
