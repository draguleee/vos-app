package vosdesktop.components.mainframe.menubar.options.draw;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class ArcOption extends Option {

    private JMenuItem arc;

    public ArcOption() { initComponents(); }

    private void initComponents() {
        arc = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_A, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\arc.png"));
        setText("Arc");
        setOption(arc);
        setToolTipText("Insert an arc");
    }

    public void setOption(JMenuItem arc) { this.arc = arc; }
}
