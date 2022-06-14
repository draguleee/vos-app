package com.vosdesktop.components.toolframe.toolbar.buttons.draw;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class TimedTransitionButton extends Buttons {

    private JButton timedTransitionButton;

    public TimedTransitionButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\timed-transition.png")); // NOI18N
        setButton(timedTransitionButton);
        setToolTipText("Insert a timed transition");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimedTransitionButtonActionPerformed(evt);
            }
        });
    }

    private void TimedTransitionButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton timedTransitionButton) { this.timedTransitionButton = timedTransitionButton; }
}
