package com.vosdesktop.components.toolframe.menubar.options.simulate;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class EditModeOption extends Option {

    private JMenuItem EditMode;

    public EditModeOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\edit.png")); // NOI18N
        setOption(EditMode);
        setText("Edit Mode");
        setToolTipText("Enter edit mode");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditModeActionPerformed(evt);
            }
        });
    }

    private void EditModeActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem EditMode) { this.EditMode = EditMode; }
}
