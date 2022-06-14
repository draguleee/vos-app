package vosdesktop.components.mainframe.menubar.options.draw;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class ImmediateTransitionOption extends Option {

    private JMenuItem immediateTransition;

    public ImmediateTransitionOption() { initComponents(); }

    private void initComponents() {
        immediateTransition = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_I, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\immediate-transition.png"));
        setText("Immediate transition");
        setOption(immediateTransition);
        setToolTipText("Insert an immediate transition");
    }

    public void setOption(JMenuItem immediateTransition) { this.immediateTransition = immediateTransition; }
}
