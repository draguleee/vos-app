package com.vosdesktop.components.toolframe.menubar.options.edit;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class RedoOption extends Option {

    private JMenuItem Redo;

    public RedoOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\redo.png")); // NOI18N
        setOption(Redo);
        setText("Redo");
        setToolTipText("Redo an operation");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedoActionPerformed(evt);
            }
        });
    }

    private void RedoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Redo) { this.Redo = Redo; }
}
