package com.vosdesktop.components.toolframe.menubar.options.about;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class GetStartedOption extends Option {

    private JMenuItem GetStarted;

    public GetStartedOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\home.png")); // NOI18N
        setOption(GetStarted);
        setText("Get Started");
        setToolTipText("Get Started (VOS Web)");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { GetStartedActionPerformed(evt); }
        });
    }

    private void GetStartedActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/index.html"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void setOption(JMenuItem GetStarted) { this.GetStarted = GetStarted; }
}
