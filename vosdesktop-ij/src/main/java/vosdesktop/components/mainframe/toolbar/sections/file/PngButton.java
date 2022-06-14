package vosdesktop.components.mainframe.toolbar.sections.file;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class PngButton extends AbstractButton {

    private JButton pngButton;

    public PngButton() { initComponents(); }

    private void initComponents() {
        pngButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\png.png"));
        setButton(pngButton);
        setToolTipText("Exports the simulation as a PNG file");
    }

    public void setButton(JButton pngButton) { this.pngButton = pngButton; }
}
