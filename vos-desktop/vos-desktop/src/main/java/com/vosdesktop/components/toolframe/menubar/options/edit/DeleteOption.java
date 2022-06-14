package com.vosdesktop.components.toolframe.menubar.options.edit;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class DeleteOption extends Option {

    private JMenuItem Delete;

    public DeleteOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\delete.png")); // NOI18N
        setOption(Delete);
        setText("Delete");
        setToolTipText("Delete an object");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
    }

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Delete) { this.Delete = Delete; }
}
