package com.vosdesktop.components.toolframe.menubar.options.view;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class ZoomOutOption extends Option {

    private JMenuItem ZoomOut;

    public ZoomOutOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_MINUS, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\zoom-out.png")); // NOI18N
        setOption(ZoomOut);
        setText("Zoom out");
        setToolTipText("Zooms out the grid");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomOutActionPerformed(evt);
            }
        });
    }

    private void ZoomOutActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem ZoomOut) { this.ZoomOut = ZoomOut; }
}
