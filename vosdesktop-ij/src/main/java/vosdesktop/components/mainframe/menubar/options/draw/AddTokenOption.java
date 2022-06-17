package vosdesktop.components.mainframe.menubar.options.draw;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class AddTokenOption extends Option {

    private JMenuItem addToken;

    public AddTokenOption() { initComponents(); }

    private void initComponents() {
        addToken = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\add-token.png"));
        setText("Add token");
        setOption(addToken);
        setToolTipText("Add a token");
    }

    public JMenuItem getAddTokenOption() {
        return this.addToken;
    }

    public void setOption(JMenuItem addToken) { this.addToken = addToken; }
}
