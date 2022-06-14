package com.vosdesktop.components.toolframe.toolbar.edit;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class RedoButton extends Buttons {

    private JButton redoButton;

    public RedoButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\redo.png")); // NOI18N
        setButton(redoButton);
        setToolTipText("Redo an operation");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedoButtonActionPerformed(evt);
            }
        });
    }

    private void RedoButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton redoButton) { this.redoButton = redoButton; }
}
