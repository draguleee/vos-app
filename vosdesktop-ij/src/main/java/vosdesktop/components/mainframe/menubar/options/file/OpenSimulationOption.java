package vosdesktop.components.mainframe.menubar.options.file;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class OpenSimulationOption extends Option {

    private JMenuItem openSimulation;

    public OpenSimulationOption() { initComponents(); }

    private void initComponents() {
        openSimulation = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\open-simulation.png")); // NOI18N
        setText("Open Simulation...");
        setOption(openSimulation);
        setToolTipText("Opens a simulation");
    }

    public void setOption(JMenuItem openSimulation) { this.openSimulation = openSimulation; }
}
