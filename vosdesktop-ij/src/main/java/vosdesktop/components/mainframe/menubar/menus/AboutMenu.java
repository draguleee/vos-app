package vosdesktop.components.mainframe.menubar.menus;

import vosdesktop.components.mainframe.menubar.abstracts.Menu;

import javax.swing.*;

public class AboutMenu extends Menu {

    private JMenu aboutMenu;

    public AboutMenu() { initComponents(); }

    private void initComponents() {
        aboutMenu = new JMenu();
        setText("About");
        setMenu(aboutMenu);
    }

    public void setMenu(JMenu aboutMenu) { this.aboutMenu = aboutMenu; }
}
