package vosdesktop.components.mainframe.menubar.options.view;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class ZoomInOption extends Option {

    private JMenuItem zoomIn;

    public ZoomInOption() { initComponents(); }

    private void initComponents() {
        zoomIn = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_EQUALS, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\zoom-in.png"));
        setText("Zoom in");
        setOption(zoomIn);
        setToolTipText("Zooms in the panel");
    }

    public void setOption(JMenuItem zoomIn) { this.zoomIn = zoomIn; }
}
