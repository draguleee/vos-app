package com.vosdesktop.components.toolframe.menubar.options.draw;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class InhibitorArcOption extends Option {

    private JMenuItem InhibitorArc;

    public InhibitorArcOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_H, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\inhibitor-arc.png")); // NOI18N
        setOption(InhibitorArc);
        setText("Inhibitor arc");
        setToolTipText("Insert an inhibitor arc");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InhibitorArcActionPerformed(evt);
            }
        });
    }

    private void InhibitorArcActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem InhibitorArc) { this.InhibitorArc = InhibitorArc; }
}
