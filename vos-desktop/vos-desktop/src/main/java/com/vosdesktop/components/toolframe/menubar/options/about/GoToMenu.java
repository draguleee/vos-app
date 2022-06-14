package com.vosdesktop.components.toolframe.menubar.options.about;

import com.vosdesktop.components.toolframe.menubar.abstracts.Menu;

import javax.swing.*;

public class GoToMenu extends Menu {

    private JMenu GoTo;
    private AboutSystemsOption aboutSystemsOption;
    private AboutPNOption aboutPNOption;
    private AboutOETPNOption aboutOETPNOption;
    private AboutVOSOption aboutVOSOption;
    public AboutCreatorOption aboutCreatorOption;

    public GoToMenu() { initComponents(); }

    private void initComponents() {
        setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\goto.png")); // NOI18N
        setMenu(GoTo);
        setText("Go to...");

        aboutSystemsOption = new AboutSystemsOption();
        aboutPNOption = new AboutPNOption();
        aboutOETPNOption = new AboutOETPNOption();
        aboutVOSOption = new AboutVOSOption();
        aboutCreatorOption = new AboutCreatorOption();

        add(aboutSystemsOption);
        add(aboutPNOption);
        add(aboutOETPNOption);
        add(aboutVOSOption);
        add(aboutCreatorOption);
    }

    public void setMenu(JMenu GoTo) { this.GoTo = GoTo; }
}
