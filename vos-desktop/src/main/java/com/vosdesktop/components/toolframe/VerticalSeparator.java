package com.vosdesktop.components.toolframe;

import javax.swing.*;

public class VerticalSeparator extends JToolBar.Separator {

    private JToolBar.Separator separator;

    public VerticalSeparator() {
        initComponents();
    }

    private void initComponents() {
        separator = new JToolBar.Separator();
    }

}
