package com.vosdesktop.components.toolframe.menubar.options.about;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class AboutSystemsOption extends Option {

    private JMenuItem AboutSystems;

    public AboutSystemsOption() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\systems.png")); // NOI18N
        setOption(AboutSystems);
        setText("About Systems");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { AboutSystemsActionPerformed(evt); }
        });
    }

    private void AboutSystemsActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-systems.html"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void setOption(JMenuItem AboutSystems) { this.AboutSystems = AboutSystems; }
}
