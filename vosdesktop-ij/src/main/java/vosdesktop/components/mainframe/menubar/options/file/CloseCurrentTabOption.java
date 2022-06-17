package vosdesktop.components.mainframe.menubar.options.file;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class CloseCurrentTabOption extends Option {

    private JMenuItem close;

    public CloseCurrentTabOption() { initComponents(); }

    private void initComponents() {
        close = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\close-current.png"));
        setText("Close current tab");
        setOption(close);
        setToolTipText("Closes the current tab");
    }

    public void setOption(JMenuItem close) { this.close = close; }
}
