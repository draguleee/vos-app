package com.vosdesktop.components.toolframe.toolbar.buttons.draw;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class InhibitorArcButton extends Buttons {

    private JButton inhibitorArcButton;

    public InhibitorArcButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\inhibitor-arc.png")); // NOI18N
        setButton(inhibitorArcButton);
        setToolTipText("Insert an inhibitor arc");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InhibitorArcButtonActionPerformed(evt);
            }
        });
    }

    private void InhibitorArcButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton inhibitorArcButton) { this.inhibitorArcButton = inhibitorArcButton; }
}
