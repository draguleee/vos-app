package vosdesktop.components.mainframe.toolbar.sections.edit;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class CutButton extends AbstractButton {

    private JButton cutButton;

    public CutButton() { initComponents(); }

    private void initComponents() {
        cutButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\cut.png"));
        setButton(cutButton);
        setToolTipText("Cut an object");
    }

    public void setButton(JButton cutButton) { this.cutButton = cutButton; }
}
