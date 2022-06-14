package vosdesktop.components.mainframe.toolbar.sections.draw;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class AddTokenButton extends AbstractButton {

    private JButton addTokenButton;

    public AddTokenButton() { initComponents(); }

    private void initComponents() {
        addTokenButton= new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\add-token.png"));
        setButton(addTokenButton);
        setToolTipText("Insert a token");
    }

    public void setButton(JButton addTokenButton) { this.addTokenButton = addTokenButton; }
}
