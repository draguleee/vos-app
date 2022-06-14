package com.vosdesktop.components.toolframe.menubar.options.draw;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class DeleteTokenOption extends Option {

    private JMenuItem DeleteToken;

    public DeleteTokenOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\delete-token.png")); // NOI18N
        setOption(DeleteToken);
        setText("Delete token");
        setToolTipText("Delete a token");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTokenActionPerformed(evt);
            }
        });
    }

    private void DeleteTokenActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem DeleteToken) { this.DeleteToken = DeleteToken; }
}
