package vosdesktop.components.mainframe.menubar.menus;

import vosdesktop.components.mainframe.menubar.abstracts.Menu;

import javax.swing.*;

public class ViewMenu extends Menu {

    private JMenu viewMenu;

    public ViewMenu() { initComponents(); }

    private void initComponents() {
        viewMenu = new JMenu();
        setText("View");
        setMenu(viewMenu);
    }

    public void setMenu(JMenu viewMenu) { this.viewMenu = viewMenu; }
}
