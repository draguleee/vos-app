package com.vosdesktop.components.toolframe.menubar.options.file;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;
import com.vosdesktop.frames.ToolFrame;

import javax.swing.*;
import java.io.File;

public class SaveOption extends Option {

    private JMenuItem Save;
    private JFileChooser fileChooser;
    private ToolFrame toolFrame;

    public SaveOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\save.png")); // NOI18N
        setOption(Save);
        setText("Save");
        setToolTipText("Saves the simulation");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
    }

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {
        toolFrame = new ToolFrame();
        fileChooser = new JFileChooser();
        int userSelection = fileChooser.showSaveDialog(toolFrame);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
        }
    }

    public void setOption(JMenuItem Save) { this.Save = Save; }
}
