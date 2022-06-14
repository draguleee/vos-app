package com.vosdesktop.components.toolframe.toolbar.buttons.simulate;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class AnimateButton extends Buttons {

    private JButton animateButton;

    public AnimateButton() { initComponents(); }

    public void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\start-sim.png")); // NOI18N
        setButton(animateButton);
        setToolTipText("Start the simulation");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimateButtonActionPerformed(evt);
            }
        });
    }

    private void AnimateButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton animateButton) { this.animateButton = animateButton; }
}
