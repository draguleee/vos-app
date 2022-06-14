package com.vosdesktop.components.toolframe.toolbar.buttons.view;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class ZoomOutButton extends Buttons {

    private JButton zoomOutButton;

    public ZoomOutButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\zoom-out.png")); // NOI18N
        setButton(zoomOutButton);
        setToolTipText("Zooms out the grid");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomOutButtonActionPerformed(evt);
            }
        });
    }

    private void ZoomOutButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton zoomOutButton) { this.zoomOutButton = zoomOutButton; }
}
