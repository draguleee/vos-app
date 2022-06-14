package vosdesktop.components.mainframe.menubar.options.simulate;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class BackwardOption extends Option {

    private JMenuItem backward;

    public BackwardOption() { initComponents(); }

    private void initComponents() {
        backward = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_4, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\backward.png"));
        setText("Backward");
        setOption(backward);
        setToolTipText("Go back one step");
    }

    public void setOption(JMenuItem backward) { this.backward = backward; }
}
