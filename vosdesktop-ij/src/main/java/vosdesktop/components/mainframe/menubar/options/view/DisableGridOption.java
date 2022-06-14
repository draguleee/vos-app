package vosdesktop.components.mainframe.menubar.options.view;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class DisableGridOption extends Option {

    private JMenuItem disableGrid;

    public DisableGridOption() { initComponents(); }

    private void initComponents() {
        disableGrid = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_PERIOD, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setText("Disable Grid");
        setOption(disableGrid);
        setToolTipText("Disables the grid");
    }

    public void setOption(JMenuItem disableGrid) { this.disableGrid = disableGrid; }
}
