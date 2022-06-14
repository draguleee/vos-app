package com.vosdesktop.components.toolframe.toolbar.buttons.view;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class DragButton extends Buttons {

    private JButton dragButton;

    public DragButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\drag.png")); // NOI18N
        setButton(dragButton);
        setToolTipText("Drag screen");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DragButtonActionPerformed(evt);
            }
        });
    }

    private void DragButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton dragButton) { this.dragButton = dragButton; }
}
