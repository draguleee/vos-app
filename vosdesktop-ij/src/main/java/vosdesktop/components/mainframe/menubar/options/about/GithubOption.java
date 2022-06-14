package vosdesktop.components.mainframe.menubar.options.about;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class GithubOption extends Option {

    private JMenuItem github;

    public GithubOption() { initComponents(); }

    private void initComponents() {
        github = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_F8, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\github.png"));
        setText("Go to Github");
        setOption(github);
        setToolTipText("Github");
    }

    public void setOption(JMenuItem github) { this.github = github; }
}
