package com.vosdesktop.components.toolframe.toolbar.buttons.file;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class PrintButton extends Buttons {

    private JButton printButton;

    public PrintButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\print.png")); // NOI18N
        setButton(printButton);
        setToolTipText("Prints the simulation");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });
    }

    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton printButton) { this.printButton = printButton; }
}
