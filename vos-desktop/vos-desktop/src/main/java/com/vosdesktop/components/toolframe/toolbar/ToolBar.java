package com.vosdesktop.components.toolframe.toolbar;

import com.vosdesktop.components.toolframe.VerticalSeparator;
import com.vosdesktop.components.toolframe.menubar.options.draw.InhibitorArcOption;
import com.vosdesktop.components.toolframe.toolbar.buttons.about.GetStartedButton;
import com.vosdesktop.components.toolframe.toolbar.buttons.draw.*;
import com.vosdesktop.components.toolframe.toolbar.buttons.edit.*;
import com.vosdesktop.components.toolframe.toolbar.buttons.file.*;
import com.vosdesktop.components.toolframe.toolbar.buttons.simulate.*;
import com.vosdesktop.components.toolframe.toolbar.buttons.view.*;

import javax.swing.*;

public class ToolBar extends JToolBar {

    private JToolBar toolBar;

    private NewWindowButton newWindowButton;
    private NewSimulationButton newSimulationButton;
    private OpenSimulationButton openSimulationButton;
    private SaveButton saveButton;
    private SaveAsButton saveAsButton;
    private PDFButton pdfButton;
    private PNGButton pngButton;
    private JPEGButton jpegButton;
    private PrintButton printButton;

    private UndoButton undoButton;
    private RedoButton redoButton;
    private CutButton cutButton;
    private CopyButton copyButton;
    private PasteButton pasteButton;
    private DeleteButton deleteButton;
    private SelectButton selectButton;
    private SelectAllButton selectAllButton;

    private ZoomOutButton zoomOutButton;
    private ZoomComboBox zoomComboBox;
    private ZoomInButton zoomInButton;
    private GridButton gridButton;
    private DragButton dragButton;

    private PlaceButton placeButton;
    private ImmediateTransitionButton immediateTransitionButton;
    private TimedTransitionButton timedTransitionButton;
    private ArcButton arcButton;
    private InhibitorArcButton inhibitorArcButton;
    private AddTokenButton addTokenButton;
    private DeleteTokenButton deleteTokenButton;
    private FoldActionButton foldActionButton;
    private UnfoldActionButton unfoldActionButton;

    private AnimateModeButton animateModeButton;
    private EditModeButton editModeButton;

    private GetStartedButton getStartedButton;

    public ToolBar() {
        initComponents();
    }

    private void initComponents() {
        setToolBar(toolBar);
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setRollover(true);

        fileSection();
        editSection();
        viewSection();
        drawSection();
        simulateSection();
        aboutSection();

    }

    public void setToolBar(JToolBar toolBar) { this.toolBar = toolBar; }


    public void fileSection() {

        newWindowButton = new NewWindowButton();
        newSimulationButton = new NewSimulationButton();
        openSimulationButton = new OpenSimulationButton();
        saveButton = new SaveButton();
        saveAsButton = new SaveAsButton();
        pdfButton = new PDFButton();
        pngButton = new PNGButton();
        jpegButton = new JPEGButton();
        printButton = new PrintButton();

        add(newWindowButton);
        add(newSimulationButton);
        add(new VerticalSeparator());
        add(openSimulationButton);
        add(new VerticalSeparator());
        add(saveButton);
        add(saveAsButton);
        add(new VerticalSeparator());
        add(pdfButton);
        add(pngButton);
        add(jpegButton);
        add(new VerticalSeparator());
        add(printButton);
        add(new VerticalSeparator());

    }


    public void editSection() {

        undoButton = new UndoButton();
        redoButton = new RedoButton();
        cutButton = new CutButton();
        copyButton = new CopyButton();
        pasteButton = new PasteButton();
        deleteButton = new DeleteButton();
        selectButton = new SelectButton();
        selectAllButton = new SelectAllButton();

        add(undoButton);
        add(redoButton);
        add(new VerticalSeparator());
        add(cutButton);
        add(copyButton);
        add(pasteButton);
        add(deleteButton);
        add(new VerticalSeparator());
        add(selectButton);
        add(selectAllButton);
        add(new VerticalSeparator());

    }


    public void viewSection() {

        zoomOutButton = new ZoomOutButton();
        zoomComboBox = new ZoomComboBox();
        zoomInButton = new ZoomInButton();
        gridButton = new GridButton();
        dragButton = new DragButton();

        add(zoomOutButton);
        add(zoomComboBox);
        add(zoomInButton);
        add(new VerticalSeparator());
        add(gridButton);
        add(dragButton);
        add(new VerticalSeparator());

    }

    public void drawSection() {

        placeButton = new PlaceButton();
        immediateTransitionButton = new ImmediateTransitionButton();
        timedTransitionButton = new TimedTransitionButton();
        arcButton = new ArcButton();
        inhibitorArcButton = new InhibitorArcButton();
        addTokenButton = new AddTokenButton();
        deleteTokenButton = new DeleteTokenButton();
        foldActionButton = new FoldActionButton();
        unfoldActionButton = new UnfoldActionButton();

        add(placeButton);
        add(immediateTransitionButton);
        add(timedTransitionButton);
        add(arcButton);
        add(inhibitorArcButton);
        add(new VerticalSeparator());
        add(addTokenButton);
        add(deleteTokenButton);
        add(new VerticalSeparator());
        add(foldActionButton);
        add(unfoldActionButton);
        add(new VerticalSeparator());

    }


    public void simulateSection() {

        animateModeButton = new AnimateModeButton();
        editModeButton = new EditModeButton();

        add(animateModeButton);
        add(editModeButton);
        add(new VerticalSeparator());

    }

    private void aboutSection() {

        getStartedButton = new GetStartedButton();

        add(getStartedButton);
    }
}
