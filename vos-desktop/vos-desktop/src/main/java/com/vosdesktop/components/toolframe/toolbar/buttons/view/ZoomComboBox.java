package com.vosdesktop.components.toolframe.toolbar.buttons.view;

import javax.swing.*;

public class ZoomComboBox extends JComboBox {

    private JComboBox zoomComboBox;

    public ZoomComboBox() { initComponents(); }

    private void initComponents() {
        setZoomComboBox(zoomComboBox);
        setModel(new DefaultComboBoxModel<>(new String[] { "Select value...", "todo2", "todo3", "todo4" }));
        setToolTipText("Change zoom value");
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(110, 70));
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { ZoomComboBoxActionPerformed(evt); }
        });
    }

    private void ZoomComboBoxActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setZoomComboBox(JComboBox zoomComboBox) { this.zoomComboBox = zoomComboBox; }
}
