package vosdesktop.components.mainframe.menubar.options.file;

import vosdesktop.components.mainframe.menubar.abstracts.Menu;

import javax.swing.*;

public class ExportAsMenu extends Menu {

    private JMenu exportAs;

    public ExportAsMenu() { initComponents(); }

    private void initComponents() {
        exportAs = new JMenu();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\export.png"));
        setText("Export as...");
        setMenu(exportAs);
    }

    public void setMenu(JMenu exportAs) { this.exportAs = exportAs; }
}
