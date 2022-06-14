package com.vosdesktop.components.toolframe.menubar.options.simulate;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class BackwardOption extends Option {

    private JMenuItem Backward;

    public BackwardOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_4, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\backward.png")); // NOI18N
        setOption(Backward);
        setText("Backward");
        setToolTipText("Go back one step");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackwardActionPerformed(evt);
            }
        });
    }

    private void BackwardActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Backward) { this.Backward = Backward; }
}
