package com.vosdesktop.components.toolframe.menubar.options.file;

import com.vosdesktop.components.toolframe.menubar.abstracts.Menu;

import javax.swing.*;

public class ExportAsMenu extends Menu {

    private JMenu ExportAs;
    private PDFOption pdfOption;
    private PNGOption pngOption;
    private JPEGOption jpegOption;

    public ExportAsMenu() { initComponents(); }

    private void initComponents() {
        ExportAs = new JMenu();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\export.png")); // NOI18N
        setMenu(ExportAs);
        setText("Export as...");

        pdfOption = new PDFOption();
        pngOption = new PNGOption();
        jpegOption = new JPEGOption();

        add(pdfOption);
        add(pngOption);
        add(jpegOption);

    }

    public void setMenu(JMenu ExportAs) { this.ExportAs = ExportAs; }
}
