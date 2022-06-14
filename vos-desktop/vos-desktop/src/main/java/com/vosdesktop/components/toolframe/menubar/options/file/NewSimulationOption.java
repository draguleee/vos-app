package com.vosdesktop.components.toolframe.menubar.options.file;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class NewSimulationOption extends Option {

    private JMenuItem NewSimulation;
    private JTabbedPane tabbedPane;

    private int count = 0;

    public NewSimulationOption() {
        initComponents();
    }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\new-simulation.png")); // NOI18N
        setOption(NewSimulation);
        setText("New Simulation...");
        setToolTipText("Creates a new OETPN simulation");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSimulationActionPerformed(evt, new JTabbedPane(), count);
            }
        });
    }

    private void NewSimulationActionPerformed(java.awt.event.ActionEvent evt, JTabbedPane tabbedPane, int count) {
        setNewSimulationOption(tabbedPane);
    }

    public void setNewSimulationOption(JTabbedPane tabbedPane) {
        tabbedPane = new JTabbedPane();
        count++;
        String name = "OETPN " + count;
        tabbedPane.addTab(name, new JPanel());
    }

    public void setOption(JMenuItem NewSimulation) {
        this.NewSimulation = NewSimulation;
    }
}
