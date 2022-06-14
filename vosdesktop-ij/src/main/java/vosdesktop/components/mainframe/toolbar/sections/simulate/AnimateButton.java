package vosdesktop.components.mainframe.toolbar.sections.simulate;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class AnimateButton extends AbstractButton {

    private JButton animateButton;

    public AnimateButton() { initComponents(); }

    private void initComponents() {
        animateButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\start-sim.png"));
        setButton(animateButton);
        setToolTipText("Go forth one step");
    }

    public void setButton(JButton animateButton) { this.animateButton = animateButton; }
}
