package com.vosdesktop.components.toolframe.menubar.options.view;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class ZoomInOption extends Option {

    private JMenuItem ZoomIn;

    public ZoomInOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_EQUALS, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\zoom-in.png")); // NOI18N
        setOption(ZoomIn);
        setText("Zoom in");
        setToolTipText("Zooms in the grid");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomInActionPerformed(evt);
            }
        });
    }

    private void ZoomInActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem ZoomIn) { this.ZoomIn = ZoomIn; }
}
