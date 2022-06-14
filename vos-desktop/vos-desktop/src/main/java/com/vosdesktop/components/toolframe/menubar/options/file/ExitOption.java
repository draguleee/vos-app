package com.vosdesktop.components.toolframe.menubar.options.file;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class ExitOption extends Option {

    private JMenuItem Exit;

    public ExitOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\exit.png")); // NOI18N
        setOption(Exit);
        setText("Exit VOS Desktop App");
        setToolTipText("Exits the application");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
    }

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Exit) { this.Exit = Exit; }
}
