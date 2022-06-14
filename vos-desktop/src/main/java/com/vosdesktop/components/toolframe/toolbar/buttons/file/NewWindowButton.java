package com.vosdesktop.components.toolframe.toolbar.file;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;
import com.vosdesktop.frames.ToolFrame;

import javax.swing.*;

public class NewWindowButton extends Buttons {

    private JButton newWindowButton;
    private ToolFrame toolFrame;

    public NewWindowButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\new-window.png")); // NOI18N
        setButton(newWindowButton);
        setToolTipText("Creates a new window");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewWindowButtonActionPerformed(evt);
            }
        });;
    }

    private void NewWindowButtonActionPerformed(java.awt.event.ActionEvent evt) {
        toolFrame = new ToolFrame();
        toolFrame.pack();
        toolFrame.setLocationRelativeTo(null);
        toolFrame.setVisible(true);
        toolFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void setButton(JButton newWindowButton) { this.newWindowButton = newWindowButton; }
}
