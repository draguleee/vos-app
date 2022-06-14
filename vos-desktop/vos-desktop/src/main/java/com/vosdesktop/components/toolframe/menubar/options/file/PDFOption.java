package com.vosdesktop.components.toolframe.menubar.options.file;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

public class PDFOption extends Option {

    private JMenuItem PDF;
    private Document document;
    private Image image;
    private JFileChooser fileChooser;
    private JPanel mainPanel;
    private Graphics2D graphics2D;

    public PDFOption() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\pdf.png")); // NOI18N
        setOption(PDF);
        setText("PDF");
        setToolTipText("Exports the simulation as a PDF file");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { PDFActionPerformed(evt); }
        });
    }

    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {
        mainPanel = new JPanel();
        document = new Document();
        image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        String suggestedDirectory = ".";
        fileChooser = new JFileChooser(suggestedDirectory);
        String EXTENSION = ".pdf";
        JFrame choose = new JFrame();
        choose.setTitle("Save To ...");
        int status = fileChooser.showSaveDialog(choose);
        if (status == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                String newfile = selectedFile.getCanonicalPath();
                if (!newfile.endsWith(EXTENSION)) {
                    newfile = newfile + EXTENSION;
                }
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(newfile));
                document.open();
                PdfContentByte contentByte = writer.getDirectContent();
                double width = mainPanel.getWidth() * 0.5;
                double height = mainPanel.getHeight() * 0.5;
                PdfTemplate template = contentByte.createTemplate(mainPanel.getWidth(), mainPanel.getHeight());
                graphics2D = template.createGraphics((float)width,(float)height);
                graphics2D.scale(0.5,0.5);
                mainPanel.print(graphics2D);
                graphics2D.dispose();
                contentByte.addTemplate(template, 10, 300);
                document.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setOption(JMenuItem PDF) { this.PDF = PDF; }
}
