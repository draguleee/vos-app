package vosdesktop.components.mainframe.toolbar.sections.draw;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class TimedTransitionButton extends AbstractButton {

    private JButton timTransButton;

    public TimedTransitionButton() { initComponents(); }

    private void initComponents() {
        timTransButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\timed-transition.png"));
        setButton(timTransButton);
        setToolTipText("Insert a timed transition");
    }

    public void setButton(JButton timTransButton) { this.timTransButton = timTransButton; }
}
