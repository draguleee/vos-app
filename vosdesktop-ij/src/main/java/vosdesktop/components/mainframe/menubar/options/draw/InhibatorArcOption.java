package vosdesktop.components.mainframe.menubar.options.draw;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class InhibatorArcOption extends Option {

    private JMenuItem inhibatorArc;

    public InhibatorArcOption() { initComponents(); }

    private void initComponents() {
        inhibatorArc = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_H, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\inhibitor-arc.png"));
        setText("Inhibitor arc");
        setOption(inhibatorArc);
        setToolTipText("Insert an inhibitor arc");
    }

    public void setOption(JMenuItem inhibatorArc) { this.inhibatorArc = inhibatorArc; }
}
