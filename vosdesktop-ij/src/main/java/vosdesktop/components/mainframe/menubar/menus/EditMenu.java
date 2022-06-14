package vosdesktop.components.mainframe.menubar.menus;

import vosdesktop.components.mainframe.menubar.abstracts.Menu;

import javax.swing.*;

public class EditMenu extends Menu {

    private JMenu editMenu;

    public EditMenu() { initComponents(); }

    private void initComponents() {
        editMenu = new JMenu();
        setText("Edit");
        setMenu(editMenu);
    }

    public void setMenu(JMenu editMenu) { this.editMenu = editMenu; }
}
