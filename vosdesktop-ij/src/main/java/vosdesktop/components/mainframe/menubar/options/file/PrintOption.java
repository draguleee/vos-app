package vosdesktop.components.mainframe.menubar.options.file;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class PrintOption extends Option {

    private JMenuItem print;

    public PrintOption() { initComponents(); }

    private void initComponents() {
        print = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\print.png"));
        setText("Print...");
        setOption(print);
        setToolTipText("Prints the simulation");
    }

    public void setOption(JMenuItem print) { this.print = print; }
}
