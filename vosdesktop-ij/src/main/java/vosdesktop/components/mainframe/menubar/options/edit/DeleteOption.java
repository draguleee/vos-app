package vosdesktop.components.mainframe.menubar.options.edit;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class DeleteOption extends Option {

    private JMenuItem delete;

    public DeleteOption() { initComponents(); }

    private void initComponents() {
        delete = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\delete.png"));
        setText("Delete");
        setOption(delete);
        setToolTipText("Delete an object");
    }

    public void setOption(JMenuItem delete) { this.delete = delete; }
}
