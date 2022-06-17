package vosdesktop.components.mainframe.toolbar.sections.about;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class HomepageButton extends AbstractButton {

    private JButton homepageButton;

    public HomepageButton() { initComponents(); }

    private void initComponents() {
        homepageButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\home.png"));
        setButton(homepageButton);
        setToolTipText("VOS Homepage");
    }

    public void setButton(JButton homepageButton) { this.homepageButton = homepageButton; }
}
