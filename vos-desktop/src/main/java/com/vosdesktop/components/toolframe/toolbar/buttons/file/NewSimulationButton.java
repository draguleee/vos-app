package com.vosdesktop.components.toolframe.toolbar.file;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;

public class NewSimulationButton extends Buttons {

    private JButton newSimulationButton;

    public NewSimulationButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\new-simulation.png")); // NOI18N
        setButton(newSimulationButton);
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        setToolTipText("Creates a new OETPN simulation");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSimulationButtonActionPerformed(evt);
            }
        });
    }

    private void NewSimulationButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setButton(JButton newSimulationButton) { this.newSimulationButton = newSimulationButton; }
}
