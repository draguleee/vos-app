package com.vosdesktop.components.toolframe.menubar.options.draw;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class ImmediateTransitionOption extends Option {

    private JMenuItem ImmediateTransition;

    public ImmediateTransitionOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_I, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\immediate-transition.png")); // NOI18N
        setOption(ImmediateTransition);
        setText("Immediate transition");
        setToolTipText("Insert an immediate transition");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImmediateTransitionActionPerformed(evt);
            }
        });
    }

    private void ImmediateTransitionActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem ImmediateTransition) { this.ImmediateTransition = ImmediateTransition; }
}
