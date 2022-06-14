package com.vosdesktop.components.toolframe.menubar.options.draw;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class PlaceOption extends Option {

    private JMenuItem Place;

    public PlaceOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_P, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\place.png")); // NOI18N
        setOption(Place);
        setText("Place");
        setToolTipText("Insert a place");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceActionPerformed(evt);
            }
        });
    }

    private void PlaceActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Place) { this.Place = Place; }
}
