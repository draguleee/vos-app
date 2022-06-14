package vosdesktop.components.mainframe.menubar.menus;

import vosdesktop.components.mainframe.menubar.abstracts.Menu;

import javax.swing.*;

public class DrawMenu extends Menu {

    private JMenu drawMenu;

    public DrawMenu() { initComponents(); }

    private void initComponents() {
        drawMenu = new JMenu();
        setText("Draw");
        setMenu(drawMenu);
    }

    public void setMenu(JMenu drawMenu) { this.drawMenu = drawMenu; }
}
