package com.vosdesktop.components.toolframe.menubar.options.about;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;

public class SendEmailOption extends Option {

    private JMenuItem SendEmail;

    public SendEmailOption() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\mail.png")); // NOI18N
        setOption(SendEmail);
        setText("Send an E-mail...");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendEmailActionPerformed(evt);
            }
        });
    }

    private void SendEmailActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String message = "mailto:aandreid14@gmail.com";
            URI uri = URI.create(message);
            Desktop.getDesktop().mail(uri);
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public void setOption(JMenuItem SendEmail) { this.SendEmail = SendEmail; }
}
