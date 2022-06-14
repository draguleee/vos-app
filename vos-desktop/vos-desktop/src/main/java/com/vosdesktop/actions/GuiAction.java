package com.vosdesktop.actions;

import java.net.URL;

import javax.swing.*;
import javax.swing.undo.UndoableEdit;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;

public abstract class GuiAction extends AbstractAction {

    public static final String SELECTED = "selected";
    protected UndoableEditListener listener;

    protected GuiAction(String name, String tooltip, int key, int modifiers) {
        this(name, tooltip);
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(key, modifiers));
    }

    protected GuiAction(String name, String tooltip) {
        super(name);
    }
}
