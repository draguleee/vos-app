package vosdesktop.components.mainframe.menubar.options.view;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class EnableGridOption extends Option {

    private JMenuItem enableGrid;

    public EnableGridOption() { initComponents(); }

    private void initComponents() {
        enableGrid = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_COMMA, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setText("Enable Grid");
        setOption(enableGrid);
        setToolTipText("Enables the grid");
    }

    public void setOption(JMenuItem enableGrid) { this.enableGrid = enableGrid; }
}
