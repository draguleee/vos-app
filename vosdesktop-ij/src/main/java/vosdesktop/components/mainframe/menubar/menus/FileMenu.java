package vosdesktop.components.mainframe.menubar.menus;

import vosdesktop.components.mainframe.menubar.abstracts.Menu;

import javax.swing.*;

public class FileMenu extends Menu {

    private JMenu fileMenu;

    public FileMenu() { initComponents(); }

    private void initComponents() {
        fileMenu = new JMenu();
        setText("File");
        setMenu(fileMenu);
    }

    public void setMenu(JMenu fileMenu) { this.fileMenu = fileMenu; }
}
