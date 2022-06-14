package com.vosdesktop.components.toolframe.toolbar.buttons.draw;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class PlaceButton extends Buttons {

    private JButton placeButton;

    public PlaceButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\place.png")); // NOI18N
        setButton(placeButton);
        setToolTipText("Insert a place");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceButtonActionPerformed(evt);
            }
        });
    }

    private void PlaceButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton placeButton) { this.placeButton = placeButton; }
}
