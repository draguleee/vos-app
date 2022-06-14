package vosdesktop.components.mainframe.menubar.options.simulate;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class EditModeOption extends Option {

    private JMenuItem editMode;

    public EditModeOption() { initComponents(); }

    private void initComponents() {
        editMode = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\edit.png"));
        setText("Edit Mode");
        setOption(editMode);
        setToolTipText("Enter edit mode");
    }

    public void setOption(JMenuItem editMode) { this.editMode = editMode; }
}
