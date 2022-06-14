package vosdesktop.components.mainframe.menubar.options.simulate;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class AnimateModeOption extends Option {

    private JMenuItem animateMode;

    public AnimateModeOption() { initComponents(); }

    private void initComponents() {
        animateMode = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\animate.png"));
        setText("Animate Mode");
        setOption(animateMode);
        setToolTipText("Enter animate mode");
    }

    public void setOption(JMenuItem animateMode) { this.animateMode = animateMode; }
}
