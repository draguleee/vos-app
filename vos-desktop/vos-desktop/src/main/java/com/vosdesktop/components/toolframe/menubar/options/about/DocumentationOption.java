package com.vosdesktop.components.toolframe.menubar.options.about;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.print.Doc;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DocumentationOption extends Option {

    private JMenuItem Documentation;

    public DocumentationOption() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\documentation.png")); // NOI18N
        setOption(Documentation);
        setText("Documentation");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { DocumentationActionPerformed(evt); }
        });
    }

    private void DocumentationActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/documentation.html"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void setOption(JMenuItem Documentation) { this.Documentation = Documentation; }
}
