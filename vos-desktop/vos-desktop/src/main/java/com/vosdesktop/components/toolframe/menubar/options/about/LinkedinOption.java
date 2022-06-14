package com.vosdesktop.components.toolframe.menubar.options.about;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class LinkedinOption extends Option {

    private JMenuItem Linkedin;

    public LinkedinOption() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\linkedin.png")); // NOI18N
        setOption(Linkedin);
        setText("Go to Linkedin");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { LinkedinActionPerformed(evt); }
        });
    }

    private void LinkedinActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/andreea-ioana-dragu-870a121a1/"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void setOption(JMenuItem Linkedin) { this.Linkedin = Linkedin; }
}
