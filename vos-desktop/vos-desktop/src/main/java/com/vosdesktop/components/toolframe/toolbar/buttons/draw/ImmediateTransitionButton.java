package com.vosdesktop.components.toolframe.toolbar.buttons.draw;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class ImmediateTransitionButton extends Buttons {

    private JButton immediateTransitionButton;

    public ImmediateTransitionButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\immediate-transition.png")); // NOI18N
        setButton(immediateTransitionButton);
        setToolTipText("Insert an immediate transition");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImmediateTransitionButtonActionPerformed(evt);
            }
        });
    }

    private void ImmediateTransitionButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton immediateTransitionButton) { this.immediateTransitionButton = immediateTransitionButton; }
}
