package com.vosdesktop.components.toolframe.menubar.options.simulate;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class ForwardOption extends Option {

    private JMenuItem Forward;

    public ForwardOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_5, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\forward.png")); // NOI18N
        setOption(Forward);
        setText("Forward");
        setToolTipText("Go forth one step");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForwardActionPerformed(evt);
            }
        });
    }

    private void ForwardActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Forward) { this.Forward = Forward; }
}
