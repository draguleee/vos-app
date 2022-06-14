package vosdesktop.components.mainframe.toolbar.sections.draw;

import vosdesktop.components.mainframe.toolbar.abstracts.AbstractButton;

import javax.swing.*;

public class AnnotationButton extends AbstractButton {

    private JButton annotationButton;

    public AnnotationButton() { initComponents(); }

    private void initComponents() {
        annotationButton = new JButton();
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\annotation.png"));
        setButton(annotationButton);
        setToolTipText("Insert an annotation");
    }

    public void setButton(JButton annotationButton) { this.annotationButton = annotationButton; }
}
