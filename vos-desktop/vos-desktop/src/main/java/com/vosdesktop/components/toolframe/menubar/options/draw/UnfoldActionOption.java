package com.vosdesktop.components.toolframe.menubar.options.draw;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class UnfoldActionOption extends Option {

    private JMenuItem UnfoldAction;

    public UnfoldActionOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\unfold.png")); // NOI18N
        setOption(UnfoldAction);
        setText("Unfold action");
        setToolTipText("Unold action");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnfoldActionActionPerformed(evt);
            }
        });
    }

    private void UnfoldActionActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem UnfoldAction) { this.UnfoldAction = UnfoldAction; }
}
