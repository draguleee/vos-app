package com.vosdesktop.components.toolframe.menubar.options.file;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class OpenSimulationOption extends Option {

    private JMenuItem OpenSimulation;
    private JFileChooser fileChooser;
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("OETPN Simulation", "xml");

    public OpenSimulationOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\open-simulation.png")); // NOI18N
        setOption(OpenSimulation);
        setText("Open Simulation...");
        setToolTipText("Opens a saved simulation");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenSimulationActionPerformed(evt);
            }
        });
    }

    private void OpenSimulationActionPerformed(java.awt.event.ActionEvent evt) {
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        int returnVal = fileChooser.showOpenDialog(getParent());
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " + fileChooser.getSelectedFile().getName());
        }
    }

    public void setOption(JMenuItem OpenSimulation) { this.OpenSimulation = OpenSimulation; }
}
