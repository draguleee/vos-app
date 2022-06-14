package vosdesktop.components.mainframe.menubar.options.about;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class AboutVosOption extends Option {

    private JMenuItem aboutVos;

    public AboutVosOption() { initComponents(); }

    private void initComponents() {
        aboutVos = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_F6, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\info.png"));
        setText("About VOS");
        setOption(aboutVos);
        setToolTipText("About VOS (VOS Web)");
    }

    public void setOption(JMenuItem aboutVos) { this.aboutVos = aboutVos; }
}
