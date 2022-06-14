package vosdesktop.components.mainframe.menubar.options.about;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class AboutSystemsOption extends Option {

    private JMenuItem aboutSystems;

    public AboutSystemsOption() { initComponents(); }

    private void initComponents() {
        aboutSystems = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\systems.png"));
        setText("About Systems");
        setOption(aboutSystems);
        setToolTipText("About Systems (VOS Web");
    }

    public void setOption(JMenuItem aboutSystems){ this.aboutSystems = aboutSystems; }
}
