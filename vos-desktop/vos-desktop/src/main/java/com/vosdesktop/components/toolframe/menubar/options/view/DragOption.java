package com.vosdesktop.components.toolframe.menubar.options.view;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class DragOption extends Option {

    private JMenuItem Drag;

    public DragOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\drag.png")); // NOI18N
        setOption(Drag);
        setToolTipText("Drag screen");
        setText("Drag Screen");
    }

    public void setOption(JMenuItem Drag) { this.Drag = Drag; }
}
