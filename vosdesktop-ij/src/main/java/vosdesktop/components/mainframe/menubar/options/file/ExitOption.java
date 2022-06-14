package vosdesktop.components.mainframe.menubar.options.file;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class ExitOption extends Option {

    private JMenuItem exit;

    public ExitOption() { initComponents(); }

    private void initComponents() {
        exit = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\exit.png"));
        setText("Exit VOS Desktop App");
        setOption(exit);
        setToolTipText("Exits the application");
    }

    public void setOption(JMenuItem exit) { this.exit = exit; }
}
