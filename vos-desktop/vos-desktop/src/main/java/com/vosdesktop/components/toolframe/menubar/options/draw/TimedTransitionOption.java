package com.vosdesktop.components.toolframe.menubar.options.draw;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class TimedTransitionOption extends Option {

    private JMenuItem TimedTransition;

    public TimedTransitionOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_T, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\timed-transition.png")); // NOI18N
        setOption(TimedTransition);
        setText("Timed transition");
        setToolTipText("Insert a timed transition");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimedTransitionActionPerformed(evt);
            }
        });
    }

    private void TimedTransitionActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem TimedTransition) { this.TimedTransition = TimedTransition; }
}
