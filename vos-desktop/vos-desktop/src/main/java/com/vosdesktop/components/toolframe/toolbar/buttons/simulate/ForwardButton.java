package com.vosdesktop.components.toolframe.toolbar.buttons.simulate;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class ForwardButton extends Buttons {

    private JButton forwardButton;

    public ForwardButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\forward.png")); // NOI18N
        setButton(forwardButton);
        setToolTipText("Go forth one step");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForwardActionPerformed(evt);
            }
        });
    }

    private void ForwardActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton forwardButton) { this.forwardButton = forwardButton; }
}
