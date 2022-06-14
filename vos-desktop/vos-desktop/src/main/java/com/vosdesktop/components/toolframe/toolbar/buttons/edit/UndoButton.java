package com.vosdesktop.components.toolframe.toolbar.buttons.edit;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class UndoButton extends Buttons {

    private JButton undoButton;

    public UndoButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\undo.png")); // NOI18N
        setButton(undoButton);
        setToolTipText("Undo an operation");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoButtonActionPerformed(evt);
            }
        });
    }

    private void UndoButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton undoButton) { this.undoButton = undoButton; }
}
