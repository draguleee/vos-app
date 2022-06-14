package com.vosdesktop.components.toolframe.toolbar.buttons.view;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class ZoomInButton extends Buttons {

    private JButton zoomInButton;

    public ZoomInButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\zoom-in.png")); // NOI18N
        setButton(zoomInButton);
        setToolTipText("Zooms in the grid");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomInButtonActionPerformed(evt);
            }
        });
    }

    private void ZoomInButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton zoomInButton) { this.zoomInButton = zoomInButton; }
}
