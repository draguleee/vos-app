package vosdesktop.components.mainframe.menubar.options.view;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class DisableDragOption extends Option {

    private JMenuItem disableDrag;

    public DisableDragOption() { initComponents(); }

    private void initComponents() {
        disableDrag = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_CLOSE_BRACKET, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setText("Disable");
        setOption(disableDrag);
        setToolTipText("Disable drag screen");
    }

    public void setOption(JMenuItem disableDrag) { this.disableDrag = disableDrag; }
}
