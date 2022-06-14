package com.vosdesktop.components.toolframe.menubar.options.file;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;
import com.vosdesktop.frames.ToolFrame;

import javax.swing.*;

public class NewWindowOption extends Option {

    private JMenuItem NewWindow;
    private ToolFrame toolFrame;

    public NewWindowOption() {
        initComponents();
    }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\new-window.png")); // NOI18N
        setOption(NewWindow);
        setText("New Window");
        setToolTipText("Creates a new window");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewWindowActionPerformed(evt);
            }
        });;
    }

    private void NewWindowActionPerformed(java.awt.event.ActionEvent evt) {
        setNewWindowOption();
    }

    public void setNewWindowOption() {
        toolFrame = new ToolFrame();
        toolFrame.pack();
        toolFrame.setLocationRelativeTo(null);
        toolFrame.setVisible(true);
        toolFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void setOption(JMenuItem NewWindow) {
        this.NewWindow = NewWindow;
    }
}
