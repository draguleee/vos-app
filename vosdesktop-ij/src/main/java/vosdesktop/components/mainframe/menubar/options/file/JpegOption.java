package vosdesktop.components.mainframe.menubar.options.file;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class JpegOption extends Option {

    private JMenuItem jpeg;

    public JpegOption() { initComponents(); }

    private void initComponents() {
        jpeg = new JMenuItem();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\jpeg.png"));
        setText("JPEG");
        setOption(jpeg);
        setToolTipText("Exports the simulation as a PNG file");
    }

    public void setOption(JMenuItem jpeg) { this.jpeg = jpeg; }
}
