package com.vosdesktop.components.toolframe.toolbar.file;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class SaveButton extends Buttons {

    private JButton save;

    public SaveButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\save.png")); // NOI18N
        setButton(save);
        setToolTipText("Saves the simulation");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
    }

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton save) { this.save = save; }
}
