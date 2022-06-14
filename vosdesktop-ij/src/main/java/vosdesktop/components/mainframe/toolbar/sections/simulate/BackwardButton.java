package vosdesktop.components.mainframe.toolbar.sections.simulate;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class BackwardButton extends AbstractButton {

    private JButton backwardButton;

    public BackwardButton() { initComponents(); }

    private void initComponents() {
        backwardButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\backward.png"));
        setButton(backwardButton);
        setToolTipText("Go back one step");
    }

    public void setButton(JButton backwardButton) { this.backwardButton = backwardButton; }
}
