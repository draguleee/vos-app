package com.vosdesktop.components.toolframe.toolbar.buttons.about;

import com.vosdesktop.components.toolframe.toolbar.abstracts.Buttons;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class GetStartedButton extends Buttons {

    private JButton getStartedButton;

    public GetStartedButton() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\home.png")); // NOI18N
        setButton(getStartedButton);
        setToolTipText("Get Started (VOS Web)");
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { GetStartedButtonActionPerformed(evt); }
        });
    }

    private void GetStartedButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/index.html"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void setButton(JButton getStartedButton) { this.getStartedButton = getStartedButton; }
}
