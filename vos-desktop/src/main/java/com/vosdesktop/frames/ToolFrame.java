package com.vosdesktop.frames;

import com.vosdesktop.components.toolframe.editor.Grid;
import com.vosdesktop.components.toolframe.editor.TabbedPane;
import com.vosdesktop.components.toolframe.menubar.menus.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class ToolFrame extends JFrame {

    private UIManager uim = new UIManager();

    private JMenuBar MenuBar;
    private JToolBar ToolBar;

    private JTabbedPane MainTabbedPane;
    private JTabbedPane TabbedPane;

    private FileMenu fileMenu;
    private EditMenu editMenu;
    private ViewMenu viewMenu;
    private DrawMenu drawMenu;
    private SimulateMenu simulateMenu;
    private AboutMenu aboutMenu;

    // Constructor for MainFrame class
    public ToolFrame() {
        initComponents();
        setTitle("Visual OETPN Simulator - Desktop Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {

        MenuBar = new JMenuBar();
        setJMenuBar(MenuBar);

        ToolBar = new JToolBar();
        ToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ToolBar.setRollover(true);

        MainTabbedPane = new JTabbedPane();
        TabbedPane = new JTabbedPane();
        MainTabbedPane.add("Untitled", TabbedPane);

        fileMenu = new FileMenu();
        editMenu = new EditMenu();
        viewMenu = new ViewMenu();
        drawMenu = new DrawMenu();
        simulateMenu = new SimulateMenu();
        aboutMenu = new AboutMenu();

        MenuBar.add(fileMenu);
        MenuBar.add(editMenu);
        MenuBar.add(viewMenu);
        MenuBar.add(drawMenu);
        MenuBar.add(simulateMenu);
        MenuBar.add(aboutMenu);


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1328, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(MainTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE))
        );
        pack();
    }

    // Function to set up the JOptionPane
    private void setJOptionPane() {
        uim.put("OptionPane.background",new ColorUIResource(51,51,51));
        uim.put("Panel.background",new ColorUIResource(51,51,51));
        uim.put("OptionPane.messageForeground", Color.white);
        uim.put("Button.background", Color.darkGray);
        uim.put("Button.foreground", Color.white);
    }

}
