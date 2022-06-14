package com.vosdesktop.components.toolframe.menubar.options.edit;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class CutOption extends Option {

    private JMenuItem Cut;

    public CutOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\cut.png")); // NOI18N
        setOption(Cut);
        setText("Cut");
        setToolTipText("Cut an object");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutActionPerformed(evt);
            }
        });
    }

    private void CutActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Cut) { this.Cut = Cut; }
}
