package vosdesktop.components.mainframe.menubar.options.file;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class SaveOption extends Option {

    private JMenuItem save;

    public SaveOption() { initComponents(); }

    private void initComponents() {
        save = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\save.png"));
        setText("Save Simulation...");
        setOption(save);
        setToolTipText("Saves a simulation");
    }

    public void setOption(JMenuItem save) { this.save = save; }
}
