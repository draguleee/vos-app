package com.vosdesktop.components.toolframe.toolbar.buttons.draw;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class AddTokenButton extends Buttons {

    private JButton addTokenButton;

    public AddTokenButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\add-token.png")); // NOI18N
        setButton(addTokenButton);
        setToolTipText("Add a token");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTokenButtonActionPerformed(evt);
            }
        });
    }

    private void AddTokenButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton addTokenButton) { this.addTokenButton = addTokenButton; }
}
