package vosdesktop.components.mainframe.toolbar.sections.simulate;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class AnimateModeButton extends AbstractButton {

    private JButton animateModeButton;

    public AnimateModeButton() { initComponents(); }

    private void initComponents() {
        animateModeButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\animate.png"));
        setButton(animateModeButton);
        setToolTipText("Enter animate mode");
    }

    public void setButton(JButton animateModeButton) { this.animateModeButton = animateModeButton; }
}
