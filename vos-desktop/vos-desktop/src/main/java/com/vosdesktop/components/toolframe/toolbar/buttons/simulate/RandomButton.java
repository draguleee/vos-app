package com.vosdesktop.components.toolframe.toolbar.buttons.simulate;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class RandomButton extends Buttons {

    private JButton randomButton;

    public RandomButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\random.png")); // NOI18N
        setButton(randomButton);
        setToolTipText("Executes a random transition");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomButtonActionPerformed(evt);
            }
        });
    }

    private void RandomButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton randomButton) { this.randomButton = randomButton; }
}
