package com.vosdesktop.components.toolframe.toolbar.buttons.file;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class PDFButton extends Buttons {

    private JButton pdfButton;

    public PDFButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\pdf.png")); // NOI18N
        setButton(pdfButton);
        setToolTipText("Exports the simulation as a PDF file");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { PDFButtonActionPerformed(evt); }
        });
    }

    private void PDFButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton pdfButton) { this.pdfButton = pdfButton; }
}
