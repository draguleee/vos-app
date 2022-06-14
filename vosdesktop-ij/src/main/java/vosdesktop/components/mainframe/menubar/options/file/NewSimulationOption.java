package vosdesktop.components.mainframe.menubar.options.file;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class NewSimulationOption extends Option {

    private JMenuItem newSimulation;
    private int count = 0;
    private JTabbedPane tabbedPane;

    public NewSimulationOption() { initComponents(); }

    private void initComponents() {
        newSimulation = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\new-simulation.png")); // NOI18N
        setText("New Simulation...");
        setOption(newSimulation);
        setToolTipText("Creates a new OETPN simulation");
    }

    public void setOption(JMenuItem newSimulation) { this.newSimulation = newSimulation; }
}
