package vosdesktop.components.mainframe.toolbar.sections.simulate;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class ForwardButton extends AbstractButton {

    private JButton forwardButton;

    public ForwardButton() { initComponents(); }

    private void initComponents() {
        forwardButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\forward.png"));
        setButton(forwardButton);
        setToolTipText("Go forth one step");
    }

    public void setButton(JButton forwardButton) { this.forwardButton = forwardButton; }
}
