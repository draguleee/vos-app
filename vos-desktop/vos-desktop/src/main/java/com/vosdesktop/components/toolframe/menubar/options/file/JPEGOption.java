package com.vosdesktop.components.toolframe.menubar.options.file;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class JPEGOption extends Option {

    private JMenuItem JPEG;

    public JPEGOption() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\jpeg.png")); // NOI18N
        setOption(JPEG);
        setText("JPEG");
        setToolTipText("Exports the simulation as a JPEG file");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { JPEGActionPerformed(evt); }
        });
    }

    private void JPEGActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem JPEG) { this.JPEG = JPEG; }
}
