package com.vosdesktop.components.toolframe.menubar.options.edit;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class SelectOption extends Option {

    private JMenuItem Select;

    public SelectOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\select.png")); // NOI18N
        setOption(Select);
        setText("Select");
        setToolTipText("Select an object");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectActionPerformed(evt);
            }
        });
    }

    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Select) { this.Select = Select; }
}
