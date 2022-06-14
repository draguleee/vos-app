package com.vosdesktop.components.toolframe.menubar.options.view;

import com.vosdesktop.components.toolframe.menubar.abstracts.Menu;

import javax.swing.*;

public class ZoomMenu extends Menu {

    private JMenu Zoom;

    public ZoomMenu() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\zoom.png")); // NOI18N
        setMenu(Zoom);
        setText("Zoom");
    }

    public void setMenu(JMenu Zoom) { this.Zoom = Zoom; }
}
