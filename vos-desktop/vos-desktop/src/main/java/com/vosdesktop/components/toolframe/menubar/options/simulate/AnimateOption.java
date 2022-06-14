package com.vosdesktop.components.toolframe.menubar.options.simulate;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class AnimateOption extends Option {

    private JMenuItem Animate;

    public AnimateOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\start-sim.png")); // NOI18N
        setOption(Animate);
        setText("Animate");
        setToolTipText("Start the simulation");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimateActionPerformed(evt);
            }
        });
    }

    private void AnimateActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Animate) { this.Animate = Animate; }
}
