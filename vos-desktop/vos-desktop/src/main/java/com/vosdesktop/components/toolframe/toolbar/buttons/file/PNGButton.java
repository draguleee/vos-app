package com.vosdesktop.components.toolframe.toolbar.buttons.file;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class PNGButton extends Buttons {

    private JButton pngButton;

    public PNGButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\png.png")); // NOI18N
        setButton(pngButton);
        setToolTipText("Exports the simulation as a PNG file");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { PNGButtonActionPerformed(evt); }
        });
    }

    private void PNGButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton pngButton) { this.pngButton = pngButton; }
}
