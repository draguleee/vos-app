package vosdesktop.components.mainframe.menubar.options.draw;

import vosdesktop.components.mainframe.menubar.abstracts.Option;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class AnnotationOption extends Option {

    private JMenuItem annotation;

    public AnnotationOption() { initComponents(); }

    private void initComponents() {
        annotation = new JMenuItem();
        setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_N, 0));
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\annotation.png"));
        setText("Annotation");
        setOption(annotation);
        setToolTipText("Insert an annotation");
    }

    public void setOption(JMenuItem annotation) { this.annotation = annotation; }
}
