package vosdesktop.components.mainframe.toolbar.sections.file;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class PrintButton extends AbstractButton {

    private JButton printButton;

    public PrintButton() { initComponents(); }

    private void initComponents() {
        printButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\print.png"));
        setButton(printButton);
        setToolTipText("Prints the simulation");
    }

    public void setButton(JButton printButton) { this.printButton = printButton; }
}
