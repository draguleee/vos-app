package com.vosdesktop.components.toolframe.menubar.menus;

import com.vosdesktop.components.toolframe.HorizontalSeparator;
import com.vosdesktop.components.toolframe.menubar.abstracts.Menu;
import com.vosdesktop.components.toolframe.menubar.options.simulate.*;

import javax.swing.*;

public class SimulateMenu extends Menu {

    private JMenu Simulate;
    private AnimateModeOption animateModeOption;
    private EditModeOption editModeOption;
    private BackwardOption backwardOption;
    private ForwardOption forwardOption;
    private AnimateOption animateOption;
    private RandomOption randomOption;

    public SimulateMenu() { initComponents(); }

    private void initComponents() {
        Simulate = new JMenu();
        setMenu(Simulate);
        setText("Simulate");

        animateModeOption = new AnimateModeOption();
        editModeOption = new EditModeOption();
        backwardOption = new BackwardOption();
        forwardOption = new ForwardOption();
        animateOption = new AnimateOption();
        randomOption = new RandomOption();

        add(animateModeOption);
        add(editModeOption);
        add(new HorizontalSeparator());
        add(backwardOption);
        add(forwardOption);
        add(animateOption);
        add(randomOption);
    }

    public void setMenu(JMenu Simulate) { this.Simulate = Simulate; }
}
