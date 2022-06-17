package vosdesktop.components.mainframe.menubar.options.file;

import vosdesktop.components.mainframe.menubar.abstracts.Option;
import vosdesktop.frames.Simulator;

import javax.swing.*;

public class NewWindowOption extends Option {

    private JMenuItem newWindow;
    private Simulator mainFrame;

    public NewWindowOption() {
        initComponents();
    }

    private void initComponents() {
        newWindow = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\new-window.png"));
        setText("New Window");
        setOption(newWindow);
        setToolTipText("Creates a new window");
    }

    public void setOption(JMenuItem newWindow) { this.newWindow = newWindow; }
}
