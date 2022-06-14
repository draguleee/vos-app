package vosdesktop.components.mainframe.menubar.options.draw;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class DeleteTokenOption extends Option {

    private JMenuItem deleteToken;

    public DeleteTokenOption() { initComponents(); }

    private void initComponents() {
        deleteToken = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\delete-token.png"));
        setText("Delete token");
        setOption(deleteToken);
        setToolTipText("Delete a token");
    }

    public void setOption(JMenuItem deleteToken) { this.deleteToken = deleteToken; }
}
