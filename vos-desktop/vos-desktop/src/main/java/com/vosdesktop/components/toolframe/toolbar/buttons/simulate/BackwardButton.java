package com.vosdesktop.components.toolframe.toolbar.buttons.simulate;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class BackwardButton extends Buttons {

    private JButton backwardButton;

    public BackwardButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\backward.png")); // NOI18N
        setButton(backwardButton);
        setToolTipText("Go back one step");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackwardButtonActionPerformed(evt);
            }
        });
    }

    private void BackwardButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton backwardButton) { this.backwardButton = backwardButton; }
}
