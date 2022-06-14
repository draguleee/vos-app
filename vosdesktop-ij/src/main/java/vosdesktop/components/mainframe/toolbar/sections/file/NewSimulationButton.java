package vosdesktop.components.mainframe.toolbar.sections.file;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class NewSimulationButton extends AbstractButton {

    private JButton newSimulationButton;

    public NewSimulationButton() { initComponents(); }

    private void initComponents() {
        newSimulationButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\new-simulation.png")); // NOI18N
        setButton(newSimulationButton);
        setToolTipText("Creates a new OETPN simulation");
    }

    public void setButton(JButton newSimulationButton) { this.newSimulationButton = newSimulationButton; }
}
