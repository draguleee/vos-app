package vosdesktop.components.mainframe.toolbar.sections.file;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class JpegButton extends AbstractButton {

    private JButton jpegButton;

    public JpegButton() { initComponents(); }

    private void initComponents() {
        jpegButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\jpeg.png"));
        setButton(jpegButton);
        setToolTipText("Exports the simulation as a PNG file");
    }

    public void setButton(JButton jpegButton) { this.jpegButton = jpegButton; }
}
