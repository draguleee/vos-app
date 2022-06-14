package com.vosdesktop.components.toolframe.menubar.menus;

import com.vosdesktop.components.toolframe.HorizontalSeparator;
import com.vosdesktop.components.toolframe.menubar.abstracts.Menu;
import com.vosdesktop.components.toolframe.menubar.options.view.*;

import javax.swing.*;

public class ViewMenu extends Menu {

    private JMenu View;
    private ZoomInOption zoomInOption;
    private ZoomOutOption zoomOutOption;
    private ZoomMenu zoomMenu;
    private GridOption gridOption;
    private DragOption dragOption;

    public ViewMenu() { initComponents(); }

    private void initComponents() {
        View = new JMenu();
        setMenu(View);
        setText("View");

        zoomInOption = new ZoomInOption();
        zoomOutOption = new ZoomOutOption();
        zoomMenu = new ZoomMenu();
        gridOption = new GridOption();
        dragOption = new DragOption();

        add(zoomInOption);
        add(zoomOutOption);
        add(zoomMenu);
        add(new HorizontalSeparator());
        add(gridOption);
        add(dragOption);

    }

    public void setMenu(JMenu View) { this.View = View; }
}
