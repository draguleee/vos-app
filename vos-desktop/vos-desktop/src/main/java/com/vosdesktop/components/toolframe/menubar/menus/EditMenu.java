package com.vosdesktop.components.toolframe.menubar.menus;

import com.vosdesktop.components.toolframe.HorizontalSeparator;
import com.vosdesktop.components.toolframe.menubar.abstracts.Menu;
import com.vosdesktop.components.toolframe.menubar.options.edit.*;

import javax.swing.*;

public class EditMenu extends Menu {

    private JMenu Edit;
    private UndoOption undoOption;
    private RedoOption redoOption;
    private CutOption cutOption;
    private CopyOption copyOption;
    private PasteOption pasteOption;
    private DeleteOption deleteOption;
    private SelectOption selectOption;
    private SelectAllOption selectAllOption;

    public EditMenu() { initComponents(); }

    private void initComponents() {
        Edit = new JMenu();
        setMenu(Edit);
        setText("Edit");

        undoOption = new UndoOption();
        redoOption = new RedoOption();
        cutOption = new CutOption();
        copyOption = new CopyOption();
        pasteOption = new PasteOption();
        deleteOption = new DeleteOption();
        selectOption = new SelectOption();
        selectAllOption = new SelectAllOption();

        add(undoOption);
        add(redoOption);
        add(new HorizontalSeparator());
        add(cutOption);
        add(copyOption);
        add(pasteOption);
        add(deleteOption);
        add(new HorizontalSeparator());
        add(selectOption);
        add(selectAllOption);

    }

    public void setMenu(JMenu Edit) { this.Edit = Edit; }
}
