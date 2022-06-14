package vosdesktop.components.mainframe.toolbar.sections.file;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class NewWindowButton extends AbstractButton {

    private JButton newWindowButton;

    public NewWindowButton() { initComponents(); }

    private void initComponents() {
        newWindowButton = new JButton();
        setIcon(new ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\new-window.png"));
        setButton(newWindowButton);
        setToolTipText("Creates a new window");
    }

    public void setButton(JButton newWindowButton) { this.newWindowButton = newWindowButton; }
}
