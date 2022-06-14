package com.vosdesktop.components.toolframe.toolbar.buttons.draw;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class ArcButton extends Buttons {

    private JButton arcButton;

    public ArcButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\arc.png")); // NOI18N
        setButton(arcButton);
        setToolTipText("Insert an arc");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArcButtonActionPerformed(evt);
            }
        });
    }

    private void ArcButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton arcButton) { this.arcButton = arcButton; }
}
