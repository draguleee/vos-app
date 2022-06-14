package com.vosdesktop.components.toolframe.menubar.options.simulate;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class AnimateModeOption extends Option {

    private JMenuItem AnimateMode;

    public AnimateModeOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\animate.png")); // NOI18N
        setOption(AnimateMode);
        setText("Animate Mode");
        setToolTipText("Enter animate mode");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimateModeActionPerformed(evt);
            }
        });
    }

    private void AnimateModeActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem AnimateMode) { this.AnimateMode = AnimateMode; }
}
