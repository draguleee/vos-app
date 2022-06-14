package vosdesktop.components.mainframe.menubar.options.simulate;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class ForwardOption extends Option {

    private JMenuItem forward;

    public ForwardOption() { initComponents(); }

    private void initComponents() {
        forward = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_5, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\forward.png"));
        setText("Forward");
        setOption(forward);
        setToolTipText("Go forth one step");
    }

    public void setOption(JMenuItem forward) { this.forward = forward; }
}
