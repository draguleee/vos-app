package com.vosdesktop.components.toolframe.toolbar.buttons.view;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class GridButton extends Buttons {

    private JButton gridButton;

    public GridButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\grid.png")); // NOI18N
        setButton(gridButton);
        setToolTipText("Change grid");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { GridButtonActionPerformed(evt); }
        });
    }

    private void GridButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton gridButton) { this.gridButton = gridButton; }
}
