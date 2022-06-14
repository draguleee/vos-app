package vosdesktop.components.mainframe.menubar.options.about;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class DocumentationOption extends Option {

    private JMenuItem documentation;

    public DocumentationOption() { initComponents(); }

    private void initComponents() {
        documentation = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\documentation.png"));
        setText("Documentation");
        setOption(documentation);
        setToolTipText("Documentation (VOS Web");
    }

    public void setOption(JMenuItem documentation) { this.documentation = documentation; }
}
