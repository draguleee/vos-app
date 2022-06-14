package vosdesktop.components.mainframe.menubar.options.about;

import vosdesktop.components.mainframe.menubar.abstracts.Menu;

import javax.swing.*;

public class GoToMenu extends Menu {

    private JMenu goTo;

    public GoToMenu() { initComponents(); }

    private void initComponents() {
        goTo = new JMenu();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\goto.png"));
        setText("Go to...");
        setMenu(goTo);
    }

    public void setMenu(JMenu goTo) { this.goTo = goTo; }
}
