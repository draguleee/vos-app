package vosdesktop.components.mainframe.menubar.options.file;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class PngOption extends Option {

    private JMenuItem png;

    public PngOption() { initComponents(); }

    private void initComponents() {
        png = new JMenuItem();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\png.png"));
        setText("PNG");
        setOption(png);
        setToolTipText("Exports the simulation as a PNG file");
    }

    public void setOption(JMenuItem png) { this.png = png; }
}
