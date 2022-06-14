package vosdesktop.components.mainframe.menubar.options.about;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class GetStartedOption extends Option {

    private JMenuItem getStarted;

    public GetStartedOption() { initComponents(); }

    private void initComponents() {
        getStarted = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\home.png"));
        setText("Get Started");
        setOption(getStarted);
        setToolTipText("Get Started (VOS Web)");
    }

    public void setOption(JMenuItem getStarted) { this.getStarted = getStarted; }
}
