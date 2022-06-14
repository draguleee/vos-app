package com.vosdesktop.components.toolframe.menubar.options.draw;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class FoldActionOption extends Option {

    private JMenuItem FoldAction;

    public FoldActionOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\fold.png")); // NOI18N
        setOption(FoldAction);
        setText("Fold action");
        setToolTipText("Fold action");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoldActionActionPerformed(evt);
            }
        });
    }

    private void FoldActionActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem FoldAction) { this.FoldAction = FoldAction; }
}
