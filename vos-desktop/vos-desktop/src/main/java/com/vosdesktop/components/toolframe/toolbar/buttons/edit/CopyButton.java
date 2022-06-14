package com.vosdesktop.components.toolframe.toolbar.buttons.edit;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class CopyButton extends Buttons {

    private JButton copyButton;

    public CopyButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\copy.png")); // NOI18N
        setButton(copyButton);
        setToolTipText("Copy an object");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyButtonActionPerformed(evt);
            }
        });
    }

    private void CopyButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton copyButton) { this.copyButton = copyButton; }
}
