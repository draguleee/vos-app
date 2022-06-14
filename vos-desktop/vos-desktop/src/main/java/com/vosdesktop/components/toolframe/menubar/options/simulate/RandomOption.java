package com.vosdesktop.components.toolframe.menubar.options.simulate;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class RandomOption extends Option {

    private JMenuItem Random;

    public RandomOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\random.png")); // NOI18N
        setOption(Random);
        setText("Random");
        setToolTipText("Executes a random transition");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomActionPerformed(evt);
            }
        });
    }

    private void RandomActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Random) { this.Random = Random; }

}
