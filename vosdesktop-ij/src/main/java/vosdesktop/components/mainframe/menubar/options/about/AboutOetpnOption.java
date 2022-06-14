package vosdesktop.components.mainframe.menubar.options.about;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class AboutOetpnOption extends Option {

    private JMenuItem aboutOetpn;

    public AboutOetpnOption() { initComponents(); }

    private void initComponents() {
        aboutOetpn = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\oetpn.png"));
        setText("About OETPNs");
        setOption(aboutOetpn);
        setToolTipText("About OETPNs (VOS Web)");
    }

    public void setOption(JMenuItem aboutOetpn) { this.aboutOetpn = aboutOetpn; }
}
