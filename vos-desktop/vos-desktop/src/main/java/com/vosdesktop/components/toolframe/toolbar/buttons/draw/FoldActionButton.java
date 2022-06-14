package com.vosdesktop.components.toolframe.toolbar.buttons.draw;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class FoldActionButton extends Buttons {

    private JButton foldActionButton;

    public FoldActionButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\fold.png")); // NOI18N
        setButton(foldActionButton);
        setToolTipText("Fold action");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoldActionButtonActionPerformed(evt);
            }
        });
    }

    private void FoldActionButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton foldActionButton) { this.foldActionButton = foldActionButton; }
}
