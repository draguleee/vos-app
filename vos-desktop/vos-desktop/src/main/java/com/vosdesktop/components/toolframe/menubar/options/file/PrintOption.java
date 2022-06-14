package com.vosdesktop.components.toolframe.menubar.options.file;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class PrintOption extends Option {

    private JMenuItem Print;

    public PrintOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\print.png")); // NOI18N
        setOption(Print);
        setText("Print...");
        setToolTipText("Prints the simulation");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
    }

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Print) { this.Print = Print; }

}
