package vosdesktop.components.mainframe.toolbar.sections.file;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class OpenSimulationButton extends AbstractButton {

    private JButton openSimulationButton;

    public OpenSimulationButton() { initComponents(); }

    private void initComponents() {
        openSimulationButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\open-simulation.png")); // NOI18N
        setButton(openSimulationButton);
        setToolTipText("Opens a simulation");
    }

    public void setButton(JButton openSimulationButton) { this.openSimulationButton = openSimulationButton; }
}
