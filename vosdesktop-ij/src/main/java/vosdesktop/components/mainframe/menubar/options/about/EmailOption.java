package vosdesktop.components.mainframe.menubar.options.about;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class EmailOption extends Option {

    private JMenuItem email;

    public EmailOption() { initComponents(); }

    private void initComponents() {
        email = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_F10, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\mail.png"));
        setText("Send an E-mail...");
        setOption(email);
        setToolTipText("Email");
    }

    public void setOption(JMenuItem email) { this.email = email; }
}
