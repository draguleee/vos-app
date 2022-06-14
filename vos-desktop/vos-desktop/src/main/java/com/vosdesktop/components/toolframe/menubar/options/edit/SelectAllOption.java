package com.vosdesktop.components.toolframe.menubar.options.edit;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class SelectAllOption extends Option {

    private JMenuItem SelectAll;

    public SelectAllOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\select-all.png")); // NOI18N
        setOption(SelectAll);
        setText("Select All");
        setToolTipText("Select all objects");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectAllActionPerformed(evt);
            }
        });
    }

    private void SelectAllActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem SelectAll) { this.SelectAll = SelectAll; }
}
