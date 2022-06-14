package com.vosdesktop.components.toolframe.toolbar.buttons.file;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class OpenSimulationButton extends Buttons {

    private JButton openSimulationButton;

    public OpenSimulationButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\open-simulation.png")); // NOI18N
        setButton(openSimulationButton);
        setToolTipText("Opens a saved simulation");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenSimulationButtonActionPerformed(evt);
            }
        });
    }

    private void OpenSimulationButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton OpenSimulationButton) { this.openSimulationButton = openSimulationButton; }
}
