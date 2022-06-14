package vosdesktop.components.mainframe.menubar.options.simulate;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;

public class AnimateOption extends Option {

    private JMenuItem animate;

    public AnimateOption() { initComponents(); }

    private void initComponents() {
        animate = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\start-sim.png"));
        setText("Animate");
        setOption(animate);
        setToolTipText("Start the simulation");
    }

    public void setOption(JMenuItem animate) { this.animate = animate; }
}
