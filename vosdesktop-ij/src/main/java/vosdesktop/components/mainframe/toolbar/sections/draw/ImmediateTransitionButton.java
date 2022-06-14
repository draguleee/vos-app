package vosdesktop.components.mainframe.toolbar.sections.draw;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class ImmediateTransitionButton extends AbstractButton {

    private JButton immTransButton;

    public ImmediateTransitionButton() { initComponents(); }

    private void initComponents() {
        immTransButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\immediate-transition.png"));
        setButton(immTransButton);
        setToolTipText("Insert an immediate transition");
    }

    public void setButton(JButton immTransButton) { this.immTransButton = immTransButton; }

}
