package com.vosdesktop.components.toolframe.menubar.options.file;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;
import com.vosdesktop.frames.ToolFrame;

import javax.swing.*;

public class CloseOption extends Option {

    private JMenuItem Close;
    private ToolFrame toolFrame;

    public CloseOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\close.png")); // NOI18N
        setOption(Close);
        setText("Close Window");
        setToolTipText("Closes the current window");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
    }

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Close) { this.Close = Close; }
}
