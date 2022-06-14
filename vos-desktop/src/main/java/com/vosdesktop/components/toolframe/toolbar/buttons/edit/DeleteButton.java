package com.vosdesktop.components.toolframe.toolbar.edit;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class DeleteButton extends Buttons {

    private JButton deleteButton;

    public DeleteButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\delete.png")); // NOI18N
        setButton(deleteButton);
        setToolTipText("Delete an object");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
    }

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton deleteButton) { this.deleteButton = deleteButton; }
}
