package com.vosdesktop.components.toolframe.toolbar.file;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class SaveAsButton extends Buttons {

    private JButton saveAs;

    public SaveAsButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\save-as.png")); // NOI18N
        setButton(saveAs);
        setToolTipText("Saves the simulation as a filetype");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsButtonActionPerformed(evt);
            }
        });
    }

    private void SaveAsButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton saveAs) { this.saveAs = saveAs; }
}
