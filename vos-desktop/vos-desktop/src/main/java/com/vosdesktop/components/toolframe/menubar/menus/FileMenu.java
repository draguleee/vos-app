package com.vosdesktop.components.toolframe.menubar.menus;

import com.vosdesktop.components.toolframe.HorizontalSeparator;
import com.vosdesktop.components.toolframe.menubar.abstracts.Menu;
import com.vosdesktop.components.toolframe.menubar.options.file.*;

import javax.swing.*;

public class FileMenu extends Menu {

    private JMenu File;
    private NewWindowOption newWindow;
    private NewSimulationOption newSimulationOption;
    private OpenSimulationOption openSimulationOption;
    private SaveOption saveOption;
    private SaveAsOption saveAsOption;
    private ExportAsMenu exportAsMenu;
    private PrintOption printOption;
    private RestartOption restartOption;
    private CloseOption closeOption;
    private ExitOption exitOption;

    public FileMenu() { initComponents(); }

    private void initComponents() {
        File = new JMenu();
        setMenu(File);
        setText("File");

        newWindow = new NewWindowOption();
        newSimulationOption = new NewSimulationOption();
        openSimulationOption = new OpenSimulationOption();
        saveOption = new SaveOption();
        saveAsOption = new SaveAsOption();
        exportAsMenu = new ExportAsMenu();
        printOption = new PrintOption();
        restartOption = new RestartOption();
        closeOption = new CloseOption();
        exitOption = new ExitOption();

        add(newWindow);
        add(newSimulationOption);
        add(new HorizontalSeparator());
        add(openSimulationOption);
        add(new HorizontalSeparator());
        add(saveOption);
        add(saveAsOption);
        add(new HorizontalSeparator());
        add(exportAsMenu);
        add(new HorizontalSeparator());
        add(printOption);
        add(new HorizontalSeparator());
        add(restartOption);
        add(closeOption);
        add(exitOption);
    }

    public void setMenu(JMenu File) {
        this.File = File;
    }

}
