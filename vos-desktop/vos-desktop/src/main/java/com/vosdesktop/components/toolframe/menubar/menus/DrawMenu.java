package com.vosdesktop.components.toolframe.menubar.menus;

import com.vosdesktop.components.toolframe.HorizontalSeparator;
import com.vosdesktop.components.toolframe.menubar.abstracts.Menu;
import com.vosdesktop.components.toolframe.menubar.options.draw.*;

import javax.swing.*;

public class DrawMenu extends Menu {

    private JMenu Draw;
    private PlaceOption placeOption;
    private ImmediateTransitionOption immediateTransitionOption;
    private TimedTransitionOption timedTransitionOption;
    private ArcOption arcOption;
    private InhibitorArcOption inhibitorArcOption;
    private AddTokenOption addTokenOption;
    private DeleteTokenOption deleteTokenOption;
    private FoldActionOption foldActionOption;
    private UnfoldActionOption unfoldActionOption;

    public DrawMenu() { initComponents(); }

    private void initComponents() {
        Draw = new JMenu();
        setMenu(Draw);
        setText("Draw");

        placeOption = new PlaceOption();
        immediateTransitionOption = new ImmediateTransitionOption();
        timedTransitionOption = new TimedTransitionOption();
        arcOption = new ArcOption();
        inhibitorArcOption = new InhibitorArcOption();
        addTokenOption = new AddTokenOption();
        deleteTokenOption = new DeleteTokenOption();
        foldActionOption = new FoldActionOption();
        unfoldActionOption = new UnfoldActionOption();

        add(placeOption);
        add(immediateTransitionOption);
        add(timedTransitionOption);
        add(arcOption);
        add(inhibitorArcOption);
        add(new HorizontalSeparator());
        add(addTokenOption);
        add(deleteTokenOption);
        add(new HorizontalSeparator());
        add(foldActionOption);
        add(unfoldActionOption);
    }

    public void setMenu(JMenu Draw) { this.Draw = Draw; }
}
