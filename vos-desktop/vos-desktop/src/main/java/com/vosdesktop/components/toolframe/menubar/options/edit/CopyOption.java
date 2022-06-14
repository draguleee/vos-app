package com.vosdesktop.components.toolframe.menubar.options.edit;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class CopyOption extends Option {

    private JMenuItem Copy;

    public CopyOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\copy.png")); // NOI18N
        setOption(Copy);
        setText("Copy");
        setToolTipText("Copy an object");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });
    }

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Copy) { this.Copy = Copy; }
}
