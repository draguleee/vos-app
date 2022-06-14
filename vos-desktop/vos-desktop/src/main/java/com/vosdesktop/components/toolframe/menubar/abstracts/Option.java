package com.vosdesktop.components.toolframe.menubar.abstracts;

import javax.swing.*;

public abstract class Option extends JMenuItem {

    private JMenuItem menuItem;

    public abstract void setOption(JMenuItem menuItem);
}
