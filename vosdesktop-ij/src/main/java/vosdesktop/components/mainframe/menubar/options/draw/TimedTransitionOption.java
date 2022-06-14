package vosdesktop.components.mainframe.menubar.options.draw;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class TimedTransitionOption extends Option {

    private JMenuItem timedTransition;

    public TimedTransitionOption() { initComponents(); }

    private void initComponents() {
        timedTransition = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_T, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\timed-transition.png"));
        setText("Timed transition");
        setOption(timedTransition);
        setToolTipText("Insert a timed transition");
    }

    public void setOption(JMenuItem timedTransition) { this.timedTransition = timedTransition; }
}
