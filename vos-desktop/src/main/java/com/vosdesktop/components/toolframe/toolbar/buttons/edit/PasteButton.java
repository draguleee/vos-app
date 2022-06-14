package com.vosdesktop.components.toolframe.toolbar.edit;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class PasteButton extends Buttons {

    private JButton pasteButton;

    public PasteButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\paste.png")); // NOI18N
        setButton(pasteButton);
        setToolTipText("Paste an object");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteButtonActionPerformed(evt);
            }
        });
    }

    private void PasteButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton pasteButton) { this.pasteButton = pasteButton; }
}
