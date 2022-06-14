package vosdesktop.components.mainframe.toolbar.sections.draw;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class InhibatorArcButton extends AbstractButton {

    private JButton inhArcButton;

    public InhibatorArcButton() { initComponents(); }

    private void initComponents() {
        inhArcButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\inhibitor-arc.png"));
        setButton(inhArcButton);
        setToolTipText("Insert an inhibator arc");
    }

    public void setButton(JButton inhArcButton) { this.inhArcButton = inhArcButton; }
}
