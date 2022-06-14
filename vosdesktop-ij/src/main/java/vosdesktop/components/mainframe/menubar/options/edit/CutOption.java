package vosdesktop.components.mainframe.menubar.options.edit;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class CutOption extends Option {

    private JMenuItem cut;

    public CutOption() { initComponents(); }

    private void initComponents() {
        cut = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\cut.png"));
        setText("Cut");
        setOption(cut);
        setToolTipText("Cut an object");
    }

    public void setOption(JMenuItem cut) { this.cut = cut; }
}
