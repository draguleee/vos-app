package vosdesktop.components.mainframe.menubar.menus;

import vosdesktop.components.mainframe.menubar.abstracts.Menu;

import javax.swing.*;

public class SimulateMenu extends Menu {

    private JMenu simulateMenu;

    public SimulateMenu() { initComponents(); }

    private void initComponents() {
        simulateMenu = new JMenu();
        setText("Simulate");
        setMenu(simulateMenu);
    }

    public void setMenu(JMenu simulateMenu) { this.simulateMenu = simulateMenu; }
}
