package com.vosdesktop.components.toolframe.menubar.options.draw;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class AddTokenOption extends Option {

    private JMenuItem AddToken;

    public AddTokenOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\add-token.png")); // NOI18N
        setOption(AddToken);
        setText("Add token");
        setToolTipText("Add a token");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTokenActionPerformed(evt);
            }
        });
    }

    private void AddTokenActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem AddToken) { this.AddToken = AddToken; }
}
