package vosdesktop.components.mainframe.menubar.options.view;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class EnableDragOption extends Option {

    private JMenuItem enableDrag;

    public EnableDragOption() { initComponents(); }

    private void initComponents() {
        enableDrag = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_OPEN_BRACKET, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setText("Enable");
        setOption(enableDrag);
        setToolTipText("Enable drag screen");
    }

    public void setOption(JMenuItem enableDrag) { this.enableDrag = enableDrag; }
}
