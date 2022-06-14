package com.vosdesktop.components.toolframe.toolbar.buttons.draw;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class DeleteTokenButton extends Buttons {

    private JButton deleteTokenButton;

    public DeleteTokenButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\delete-token.png")); // NOI18N
        setButton(deleteTokenButton);
        setToolTipText("Delete a token");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTokenButtonActionPerformed(evt);
            }
        });
    }

    private void DeleteTokenButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton deleteTokenButton) { this.deleteTokenButton = deleteTokenButton; }
}
