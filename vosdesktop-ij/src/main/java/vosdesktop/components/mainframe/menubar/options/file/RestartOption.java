package vosdesktop.components.mainframe.menubar.options.file;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class RestartOption extends Option {

    private JMenuItem restart;

    public RestartOption() { initComponents(); }

    private void initComponents() {
        restart = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\restart.png")); // NOI18N
        setText("Restart VOS Desktop App");
        setOption(restart);
        setToolTipText("Restarts the application");
    }

    public void setOption(JMenuItem restart) { this.restart = restart; }
}
