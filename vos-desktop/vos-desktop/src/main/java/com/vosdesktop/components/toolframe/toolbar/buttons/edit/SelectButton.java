package com.vosdesktop.components.toolframe.toolbar.buttons.edit;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class SelectButton extends Buttons {

    private JButton selectButton;

    public SelectButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\select.png")); // NOI18N
        setButton(selectButton);
        setToolTipText("Select an object");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButtonActionPerformed(evt);
            }
        });
    }

    private void SelectButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton selectButton) { this.selectButton = selectButton; }
}
