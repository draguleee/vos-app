package com.vosdesktop.components.toolframe.toolbar.buttons.simulate;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class AnimateModeButton extends Buttons {

    private JButton animateModeButton;

    public AnimateModeButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\animate.png")); // NOI18N
        setButton(animateModeButton);
        setToolTipText("Enter animate mode");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimateModeButtonActionPerformed(evt);
            }
        });
    }

    private void AnimateModeButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton animateModeButton) { this.animateModeButton = animateModeButton; }
}
