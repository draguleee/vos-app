package vosdesktop.components.mainframe.menubar.options.about;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class AboutPnOption extends Option {

    private JMenuItem aboutPn;

    public AboutPnOption() { initComponents(); }

    private void initComponents() {
        aboutPn = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\petrinets.png"));
        setText("About Petri Nets");
        setOption(aboutPn);
        setToolTipText("About Petri Nets (VOS Web");
    }

    public void setOption(JMenuItem aboutPn) { this.aboutPn = aboutPn; }
}
