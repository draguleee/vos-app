package com.vosdesktop.components.toolframe.menubar.options.draw;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class ArcOption extends Option {

    private JMenuItem Arc;

    public ArcOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_A, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\arc.png")); // NOI18N
        setOption(Arc);
        setText("Arc");
        setToolTipText("Insert an arc");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArcActionPerformed(evt);
            }
        });
    }

    private void ArcActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Arc) { this.Arc = Arc; }
}
