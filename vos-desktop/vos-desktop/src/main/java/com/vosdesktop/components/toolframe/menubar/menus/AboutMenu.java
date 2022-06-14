package com.vosdesktop.components.toolframe.menubar.menus;

import com.vosdesktop.components.toolframe.HorizontalSeparator;
import com.vosdesktop.components.toolframe.menubar.abstracts.Menu;
import com.vosdesktop.components.toolframe.menubar.options.about.*;

import javax.swing.*;

public class AboutMenu extends Menu {

    private JMenu About;
    private GetStartedOption getStartedOption;
    private DocumentationOption documentationOption;
    private GoToMenu goToMenu;
    private SendEmailOption sendEmailOption;
    private GithubOption githubOption;
    private LinkedinOption linkedinOption;

    public AboutMenu() { initComponents(); }

    private void initComponents() {
        About = new JMenu();
        setMenu(About);
        setText("About");

        getStartedOption = new GetStartedOption();
        documentationOption = new DocumentationOption();
        goToMenu = new GoToMenu();
        sendEmailOption = new SendEmailOption();
        githubOption = new GithubOption();
        linkedinOption = new LinkedinOption();

        add(getStartedOption);
        add(documentationOption);
        add(new HorizontalSeparator());
        add(goToMenu);
        add(new HorizontalSeparator());
        add(sendEmailOption);
        add(githubOption);
        add(linkedinOption);
    }

    public void setMenu(JMenu About) { this.About = About; }
}
