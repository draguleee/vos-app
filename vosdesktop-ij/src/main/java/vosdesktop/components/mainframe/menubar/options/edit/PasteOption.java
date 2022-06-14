package vosdesktop.components.mainframe.menubar.options.edit;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class PasteOption extends Option {

    private JMenuItem paste;

    public PasteOption() { initComponents(); }

    private void initComponents() {
        paste = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\paste.png"));
        setText("Paste");
        setOption(paste);
        setToolTipText("Paste an object");
    }

    public void setOption(JMenuItem paste) { this.paste = paste; }
}
