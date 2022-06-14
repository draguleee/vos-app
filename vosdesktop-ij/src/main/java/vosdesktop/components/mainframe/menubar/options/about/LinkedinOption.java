package vosdesktop.components.mainframe.menubar.options.about;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class LinkedinOption extends Option {

    private JMenuItem linkedin;

    public LinkedinOption() { initComponents(); }

    private void initComponents() {
        linkedin = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_F9, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\linkedin.png"));
        setText("Go to Linkedin");
        setOption(linkedin);
        setToolTipText("Linkedin");
    }

    public void setOption(JMenuItem linkedin) { this.linkedin = linkedin; }
}
