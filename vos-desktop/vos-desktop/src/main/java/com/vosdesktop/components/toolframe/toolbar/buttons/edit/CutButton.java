package com.vosdesktop.components.toolframe.toolbar.buttons.edit;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class CutButton extends Buttons {

    private JButton cutButton;

    public CutButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\cut.png")); // NOI18N
        setButton(cutButton);
        setToolTipText("Cut an object");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutButtonActionPerformed(evt);
            }
        });
    }

    private void CutButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton cutButton) { this.cutButton = cutButton; }
}
