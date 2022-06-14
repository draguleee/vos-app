package vosdesktop.components.mainframe.menubar.options.view;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class ZoomOutOption extends Option {

    private JMenuItem zoomOut;

    public ZoomOutOption() { initComponents(); }

    private void initComponents() {
        zoomOut = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_MINUS, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\zoom-out.png"));
        setText("Zoom out");
        setOption(zoomOut);
        setToolTipText("Zooms out the grid");
    }

    public void setOption(JMenuItem zoomOut) { this.zoomOut = zoomOut; }
}
