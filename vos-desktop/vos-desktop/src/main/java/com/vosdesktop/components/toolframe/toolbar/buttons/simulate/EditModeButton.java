package com.vosdesktop.components.toolframe.toolbar.buttons.simulate;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class EditModeButton extends Buttons {

    private JButton editModeButton;

    public EditModeButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\edit.png")); // NOI18N
        setButton(editModeButton);
        setToolTipText("Enter edit mode");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditModeButtonActionPerformed(evt);
            }
        });
    }

    private void EditModeButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton editModeButton) { this.editModeButton = editModeButton; }
}
