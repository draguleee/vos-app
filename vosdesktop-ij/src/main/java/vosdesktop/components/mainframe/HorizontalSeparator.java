package vosdesktop.components.mainframe;

import javax.swing.*;

public class HorizontalSeparator extends JPopupMenu.Separator {

    private JPopupMenu.Separator separator;

    public HorizontalSeparator() {
        initComponents();
    }

    private void initComponents() {
        separator = new JPopupMenu.Separator();
    }

}
