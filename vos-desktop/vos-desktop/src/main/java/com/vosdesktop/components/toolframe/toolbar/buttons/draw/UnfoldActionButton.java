package com.vosdesktop.components.toolframe.toolbar.buttons.draw;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class UnfoldActionButton extends Buttons {

    private JButton unfoldActionButton;

    public UnfoldActionButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\unfold.png")); // NOI18N
        setButton(unfoldActionButton);
        setToolTipText("Unfold action");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnfoldActionButtonActionPerformed(evt);
            }
        });
    }

    private void UnfoldActionButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton unfoldActionButton) { this.unfoldActionButton = unfoldActionButton; }
}
