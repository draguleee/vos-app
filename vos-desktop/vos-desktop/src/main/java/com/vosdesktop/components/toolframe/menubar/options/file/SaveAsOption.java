package com.vosdesktop.components.toolframe.menubar.options.file;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class SaveAsOption extends Option {

    private JMenuItem SaveAs;

    public SaveAsOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\save-as.png")); // NOI18N
        setOption(SaveAs);
        setText("Save As...");
        setToolTipText("Saves the simulation as a filetype");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsActionPerformed(evt);
            }
        });
    }

    private void SaveAsActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem SaveAs) { this.SaveAs = SaveAs; }
}
