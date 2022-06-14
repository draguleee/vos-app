package com.vosdesktop.components.toolframe.menubar.options.file;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class PNGOption extends Option {

    private JMenuItem PNG;

    public PNGOption() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\png.png")); // NOI18N
        setOption(PNG);
        setText("PNG");
        setToolTipText("Exports the simulation as a PNG file");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
    }

    private void PNGActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem PNG) { this.PNG = PNG; }
}
