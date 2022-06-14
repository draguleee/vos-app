package vosdesktop.components.mainframe.menubar.options.about;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class AboutCreatorOption extends Option {

    private JMenuItem aboutCreator;

    public AboutCreatorOption() { initComponents(); }

    private void initComponents() {
        aboutCreator = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_F7, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\creator.png"));
        setText("About The Creator");
        setOption(aboutCreator);
        setToolTipText("About The Creator (VOS Web)");
    }

    public void setOption(JMenuItem aboutCreator) { this.aboutCreator = aboutCreator; }
}
