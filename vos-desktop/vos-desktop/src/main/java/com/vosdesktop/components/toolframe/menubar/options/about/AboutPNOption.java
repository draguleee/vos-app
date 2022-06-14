package com.vosdesktop.components.toolframe.menubar.options.about;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class AboutPNOption extends Option {

    private JMenuItem AboutPetriNets;

    public AboutPNOption() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\petrinets.png")); // NOI18
        setOption(AboutPetriNets);
        setText("About Petri Nets");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutPNActionPerformed(evt);
            }
        });
    }

    private void AboutPNActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-petrinets.html"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void setOption(JMenuItem AboutPetriNets) { this.AboutPetriNets = AboutPetriNets; }
}
