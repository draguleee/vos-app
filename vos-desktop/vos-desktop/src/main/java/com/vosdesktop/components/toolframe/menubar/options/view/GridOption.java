package com.vosdesktop.components.toolframe.menubar.options.view;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;

public class GridOption extends Option {

    private JMenuItem Grid;

    public GridOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\grid.png")); // NOI18N
        setOption(Grid);
        setText("Grid");
        setToolTipText("Change grid");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { GridActionPerformed(evt); }
        });
    }

    private void GridActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Grid) { this.Grid = Grid; }
}
