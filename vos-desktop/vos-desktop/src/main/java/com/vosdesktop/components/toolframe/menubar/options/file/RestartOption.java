package com.vosdesktop.components.toolframe.menubar.options.file;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;
import com.vosdesktop.frames.LoginFrame;

import javax.swing.*;

public class RestartOption extends Option {

    private JMenuItem Restart;
    private LoginFrame loginFrame;

    public RestartOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\restart.png")); // NOI18N
        setOption(Restart);
        setText("Restart VOS Desktop App");
        setToolTipText("Restarts the application");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });
    }

    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Restart) { this.Restart = Restart; }
}
