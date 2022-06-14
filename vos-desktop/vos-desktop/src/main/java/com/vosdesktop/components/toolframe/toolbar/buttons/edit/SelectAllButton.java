package com.vosdesktop.components.toolframe.toolbar.buttons.edit;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class SelectAllButton extends Buttons {

    private JButton selectAllButton;

    public SelectAllButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\select-all.png")); // NOI18N
        setButton(selectAllButton);
        setToolTipText("Select all objects");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectAllButtonActionPerformed(evt);
            }
        });
    }

    private void SelectAllButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton selectAllButton) { this.selectAllButton = selectAllButton; }
}
