package vosdesktop.components.mainframe.menubar.options.view;

import vosdesktop.components.mainframe.menubar.abstracts.Menu;

import javax.swing.*;

public class GridMenu extends Menu {

    private JMenu grid;

    public GridMenu() { initComponents(); }

    private void initComponents() {
        grid = new JMenu();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\grid.png"));
        setText("Grid");
        setMenu(grid);
    }

    public void setMenu(JMenu grid) { this.grid = grid; }
}
