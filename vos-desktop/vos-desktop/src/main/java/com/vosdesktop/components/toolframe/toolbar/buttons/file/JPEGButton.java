package com.vosdesktop.components.toolframe.toolbar.buttons.file;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class JPEGButton extends Buttons {

    private JButton jpegButton;

    public JPEGButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\jpeg.png")); // NOI18N
        setButton(jpegButton);
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        setToolTipText("Exports the simulation as a JPEG file");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { JPEGButtonActionPerformed(evt); }
        });
    }

    private void JPEGButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton jpegButton) { this.jpegButton = jpegButton; }
}
