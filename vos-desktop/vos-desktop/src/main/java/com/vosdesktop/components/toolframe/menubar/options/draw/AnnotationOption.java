package com.vosdesktop.components.toolframe.menubar.options.draw;

import com.vosdesktop.components.toolframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class AnnotationOption extends Option {

    private JMenuItem Annotation;

    public AnnotationOption() { initComponents(); }

    private void initComponents() {
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_N, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\annotation.png")); // NOI18N
        setOption(Annotation);
        setText("Annotation");
        setToolTipText("Insert an annotation");
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnotationActionPerformed(evt);
            }
        });
    }

    private void AnnotationActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void setOption(JMenuItem Arc) { this.Annotation = Annotation; }
}
