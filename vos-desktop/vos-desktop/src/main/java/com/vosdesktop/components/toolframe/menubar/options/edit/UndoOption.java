package com.vosdesktop.components.toolframe.menubar.options.edit;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class UndoOption extends Option {

    private JMenuItem Undo;

    public UndoOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\undo.png")); // NOI18N
        setOption(Undo);
        setText("Undo");
        setToolTipText("Undo an operation");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoActionPerformed(evt);
            }
        });
    }

    private void UndoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Undo) { this.Undo = Undo; }
}
