package com.vosdesktop.components.toolframe.menubar.options.edit;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class PasteOption extends Option {

    private JMenuItem Paste;

    public PasteOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\paste.png")); // NOI18N
        setOption(Paste);
        setText("Paste");
        setToolTipText("Paste an object");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteActionPerformed(evt);
            }
        });
    }

    private void PasteActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Paste) { this.Paste = Paste; }
}
