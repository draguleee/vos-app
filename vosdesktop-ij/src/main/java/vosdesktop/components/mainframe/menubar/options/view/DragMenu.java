package vosdesktop.components.mainframe.menubar.options.view;

import vosdesktop.components.mainframe.menubar.abstracts.Menu;

import javax.swing.*;

public class DragMenu extends Menu {

    private JMenu drag;

    public DragMenu() { initComponents(); }

    private void initComponents() {
        drag = new JMenu();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\drag.png"));
        setText("Drag");
        setMenu(drag);
    }

    public void setMenu(JMenu drag) { this.drag = drag; }
}
