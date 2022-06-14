package com.vosdesktop.frames;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
import java.net.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import com.vosdesktop.handlers.*;

public class LoginFrame extends JFrame {

    // Class variables
    private static int userID = -1;
    private DatabaseHandler handler = null;
    private UIManager uim = new UIManager();

    // Variables declaration - do not modify
    private javax.swing.JLabel AboutOETPN;
    private javax.swing.JLabel AboutPNs;
    private javax.swing.JLabel AboutSystems;
    private javax.swing.JLabel AboutVOS;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel GitHub;
    private javax.swing.JPanel LFButtons;
    private javax.swing.JTextField LFEmailField;
    private javax.swing.JLabel LFEmailLabel;
    private javax.swing.JLabel LFEmailStar;
    private javax.swing.JLabel LFMessage1;
    private javax.swing.JLabel LFMessage2;
    private javax.swing.JPasswordField LFPassField;
    private javax.swing.JLabel LFPassLabel;
    private javax.swing.JLabel LFPassStar;
    private javax.swing.JPanel LFText;
    private javax.swing.JPanel LFUserData;
    private javax.swing.JLabel LinkedIn;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginForm;
    private javax.swing.JButton NoAccButton;
    private javax.swing.JLabel TextAbout1;
    private javax.swing.JLabel TextAbout2;
    private javax.swing.JLabel TextAboutCreator1;
    private javax.swing.JLabel TextAboutCreator2;
    private javax.swing.JLabel TextAboutCreator3;
    private javax.swing.JLabel TextAboutVOS;
    private javax.swing.JLabel TextEmail1;
    private javax.swing.JLabel TextEmail2;
    private javax.swing.JLabel WVOS_DesktopApp;
    private javax.swing.JPanel WVOS_Links;
    private javax.swing.JPanel WVOS_Login;
    private javax.swing.JScrollPane WVOS_Text;
    private javax.swing.JPanel WVOS_Title;
    private javax.swing.JLabel WVOS_Welcome;
    private javax.swing.JTextArea WelcomeText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration

    /**
     * LoginFrame() <br>
     * Default constructor for LoginFrame class.
     * Calls all the methods defined in this class.
     */
    public LoginFrame() {

        handler = DatabaseHandler.getInstance();                            // Get / create the instance
        initComponents();                                                   // Initialize the components
        setTitle("Visual OETPN Simulator - Desktop Application (Log In)");  // Set frame title


        // Set the hyperlinks
        setHomepageHyperlink();
        setAboutSystemsHyperlink();
        setAboutPNsHyperlink();
        setAboutOETPNHyperlink();
        setAboutVOSHyperlink();
        setGithubProfileHyperlink();
        setLinkedinProfileHyperlink();
        setEmailOption();

        // Set the placeholders
        setLFEmailFieldText();
        setLFPassFieldText();

        // Setup the frame (center location & visibility)
        setStarsInvisible();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * setStarsInvisible() <br>
     * Sets the markers for the e-mail and password field to invisible.
     * If one or both fields remain empty, the markers will be visible.
     * If one or both fields are filled in, the markers will not appear.
     *
     * @param
     * @return none
     */
    private void setStarsInvisible() {
        LFEmailStar.setVisible(false);
        LFPassStar.setVisible(false);
    }

    /**
     * markEmptyFields() <br>
     * Marks the empty fields after pressing the Log In button.
     * If there is one or both fields empty, they will be marked accordingly.
     * If there are both fields filled in, nothing happens.
     *
     * @param
     * @return the state of the fields (empty or filled in)
     */
    private boolean markEmptyFields() {
        boolean isEmpty = false;
        if(LFEmailField.getText().isEmpty() || LFEmailField.getForeground() == Color.gray) {
            isEmpty = true;
            LFEmailStar.setVisible(true);
        }
        if(String.valueOf(LFPassField.getPassword()).isEmpty() || LFPassField.getForeground() == Color.gray) {
            isEmpty = true;
            LFPassStar.setVisible(true);
        }
        return isEmpty;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        LoginForm = new JPanel();
        LFText = new JPanel();
        LFMessage1 = new JLabel();
        LFMessage2 = new JLabel();
        LFUserData = new JPanel();
        LFEmailLabel = new JLabel();
        LFEmailField = new JTextField();
        LFPassLabel = new JLabel();
        LFPassField = new JPasswordField();
        LFEmailStar = new JLabel();
        LFPassStar = new JLabel();
        LFButtons = new JPanel();
        LoginButton = new JButton();
        NoAccButton = new JButton();
        WVOS_Login = new JPanel();
        WVOS_Title = new JPanel();
        WVOS_Welcome = new JLabel();
        WVOS_DesktopApp = new JLabel();
        WVOS_Text = new JScrollPane();
        WelcomeText = new JTextArea();
        WVOS_Links = new JPanel();
        TextAboutVOS = new JLabel();
        AboutVOS = new JLabel();
        TextAboutCreator1 = new JLabel();
        GitHub = new JLabel();
        TextAboutCreator2 = new JLabel();
        LinkedIn = new JLabel();
        TextAboutCreator3 = new JLabel();
        TextEmail1 = new JLabel();
        Email = new JLabel();
        TextEmail2 = new JLabel();
        TextAbout1 = new JLabel();
        AboutSystems = new JLabel();
        AboutPNs = new JLabel();
        AboutOETPN = new JLabel();
        TextAbout2 = new JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        LoginForm.setBackground(new java.awt.Color(51, 51, 51));

        LFText.setBackground(new java.awt.Color(51, 51, 51));

        LFMessage1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        LFMessage1.setText("Log In");

        LFMessage2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LFMessage2.setText("to start using VOS Desktop Application");

        javax.swing.GroupLayout LFTextLayout = new javax.swing.GroupLayout(LFText);
        LFText.setLayout(LFTextLayout);
        LFTextLayout.setHorizontalGroup(
                LFTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LFTextLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LFMessage2)
                                .addGap(19, 19, 19))
                        .addGroup(LFTextLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(LFMessage1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LFTextLayout.setVerticalGroup(
                LFTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LFTextLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LFMessage1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LFMessage2)
                                .addContainerGap())
        );

        LFUserData.setBackground(new java.awt.Color(51, 51, 51));

        LFEmailLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LFEmailLabel.setText("E-mail");

        LFEmailField.setBackground(java.awt.Color.darkGray);
        LFEmailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LFEmailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LFEmailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LFEmailFieldFocusLost(evt);
            }
        });

        LFPassLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LFPassLabel.setText("Password");

        LFPassField.setBackground(java.awt.Color.darkGray);
        LFPassField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LFPassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LFPassFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LFPassFieldFocusLost(evt);
            }
        });

        LFEmailStar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LFEmailStar.setText("*");

        LFPassStar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LFPassStar.setText("*");

        javax.swing.GroupLayout LFUserDataLayout = new javax.swing.GroupLayout(LFUserData);
        LFUserData.setLayout(LFUserDataLayout);
        LFUserDataLayout.setHorizontalGroup(
                LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LFUserDataLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LFPassLabel)
                                        .addComponent(LFEmailLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LFPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(LFEmailField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LFEmailStar)
                                        .addComponent(LFPassStar))
                                .addContainerGap(18, Short.MAX_VALUE))
        );
        LFUserDataLayout.setVerticalGroup(
                LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LFUserDataLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LFEmailLabel)
                                        .addComponent(LFEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LFEmailStar))
                                .addGap(18, 18, 18)
                                .addGroup(LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LFPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LFPassLabel)
                                        .addComponent(LFPassStar))
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        LFButtons.setBackground(new java.awt.Color(51, 51, 51));

        LoginButton.setBackground(java.awt.Color.darkGray);
        LoginButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoginButton.setText("Log In");
        LoginButton.setBorderPainted(false);
        LoginButton.setRequestFocusEnabled(false);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        NoAccButton.setBackground(java.awt.Color.darkGray);
        NoAccButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NoAccButton.setText("Don't have an account? Sign up");
        NoAccButton.setBorderPainted(false);
        NoAccButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoAccButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LFButtonsLayout = new javax.swing.GroupLayout(LFButtons);
        LFButtons.setLayout(LFButtonsLayout);
        LFButtonsLayout.setHorizontalGroup(
                LFButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LFButtonsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(LFButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LFButtonsLayout.createSequentialGroup()
                                                .addComponent(LoginButton)
                                                .addGap(73, 73, 73))
                                        .addComponent(NoAccButton, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
        );
        LFButtonsLayout.setVerticalGroup(
                LFButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LFButtonsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LoginButton)
                                .addGap(18, 18, 18)
                                .addComponent(NoAccButton)
                                .addContainerGap())
        );

        javax.swing.GroupLayout LoginFormLayout = new javax.swing.GroupLayout(LoginForm);
        LoginForm.setLayout(LoginFormLayout);
        LoginFormLayout.setHorizontalGroup(
                LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginFormLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LFButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                        .addGroup(LoginFormLayout.createSequentialGroup()
                                .addGroup(LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(LoginFormLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(LFText, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(LoginFormLayout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(LFUserData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(17, Short.MAX_VALUE))
        );
        LoginFormLayout.setVerticalGroup(
                LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginFormLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(LFText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(LFUserData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(LFButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(84, Short.MAX_VALUE))
        );

        WVOS_Login.setBackground(new java.awt.Color(51, 51, 51));
        WVOS_Login.setForeground(new java.awt.Color(255, 255, 255));

        WVOS_Title.setBackground(new java.awt.Color(51, 51, 51));

        WVOS_Welcome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        WVOS_Welcome.setText("Visual OETPN Simulator (VOS)");

        WVOS_DesktopApp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        WVOS_DesktopApp.setText("Desktop Application");

        javax.swing.GroupLayout WVOS_TitleLayout = new javax.swing.GroupLayout(WVOS_Title);
        WVOS_Title.setLayout(WVOS_TitleLayout);
        WVOS_TitleLayout.setHorizontalGroup(
                WVOS_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WVOS_TitleLayout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addGroup(WVOS_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(WVOS_Welcome)
                                        .addGroup(WVOS_TitleLayout.createSequentialGroup()
                                                .addGap(150, 150, 150)
                                                .addComponent(WVOS_DesktopApp)))
                                .addContainerGap())
        );
        WVOS_TitleLayout.setVerticalGroup(
                WVOS_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WVOS_TitleLayout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(WVOS_Welcome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WVOS_DesktopApp))
        );

        WelcomeText.setEditable(false);
        WelcomeText.setBackground(java.awt.Color.darkGray);
        WelcomeText.setColumns(20);
        WelcomeText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WelcomeText.setRows(5);
        WelcomeText.setText("Visual OETPN Simulator (short: VOS) is an open-source tool that helps students learning in \ntechnical fields to understand, design and simulate Object-Enhanced Timed Petri Nets (OETPNs).\n\nVisual OETPN Simulator was developed by Automation and Applied Informatics student, Dragu \nAndreea, as a bachelor's thesis, including researches on Petri Nets (specifically OETPNs) and \nDesktop Development technologies and programming languages (Java, Swing, MySQL).\n\nAnd, the most important thing of all, Visual OETPN Simulator is completely free to use. The user \nmust create a new account to start using the tool, or if they already have an account, they must \nlog into their account.");
        WelcomeText.setCaretColor(new java.awt.Color(0, 0, 0));
        WelcomeText.setFocusable(false);
        WVOS_Text.setViewportView(WelcomeText);

        WVOS_Links.setBackground(new java.awt.Color(51, 51, 51));

        TextAboutVOS.setText("To find out more about Visual OETPN Simulator, please visit");

        AboutVOS.setText("About VOS.");

        TextAboutCreator1.setText("To find out more about the creator of this tool, please visit my");

        GitHub.setText("GitHub");

        TextAboutCreator2.setText("or");

        LinkedIn.setText("LinkedIn");

        TextAboutCreator3.setText("profiles.");

        TextEmail1.setText("Or,");

        Email.setText("e-mail");

        TextEmail2.setText("me directly.");

        TextAbout1.setText("To find out more about systems, Petri Nets and OETPNs, please visit ");

        AboutSystems.setText("About Systems,");

        AboutPNs.setText("About PNs,");

        AboutOETPN.setText("About OETPNs.");

        TextAbout2.setText("and");

        javax.swing.GroupLayout WVOS_LinksLayout = new javax.swing.GroupLayout(WVOS_Links);
        WVOS_Links.setLayout(WVOS_LinksLayout);
        WVOS_LinksLayout.setHorizontalGroup(
                WVOS_LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(WVOS_LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                                .addComponent(TextAboutVOS)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutVOS))
                                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                                .addComponent(TextAboutCreator1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(GitHub)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TextAboutCreator2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LinkedIn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TextAboutCreator3))
                                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                                .addComponent(TextEmail1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Email)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TextEmail2))
                                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                                .addComponent(TextAbout1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutSystems)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutPNs)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TextAbout2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutOETPN)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WVOS_LinksLayout.setVerticalGroup(
                WVOS_LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(WVOS_LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextAbout1)
                                        .addComponent(AboutSystems)
                                        .addComponent(AboutPNs)
                                        .addComponent(AboutOETPN)
                                        .addComponent(TextAbout2))
                                .addGap(18, 18, 18)
                                .addGroup(WVOS_LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextAboutVOS)
                                        .addComponent(AboutVOS))
                                .addGap(18, 18, 18)
                                .addGroup(WVOS_LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextAboutCreator1)
                                        .addComponent(GitHub)
                                        .addComponent(TextAboutCreator2)
                                        .addComponent(LinkedIn)
                                        .addComponent(TextAboutCreator3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(WVOS_LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextEmail1)
                                        .addComponent(TextEmail2)
                                        .addComponent(Email))
                                .addContainerGap())
        );

        javax.swing.GroupLayout WVOS_LoginLayout = new javax.swing.GroupLayout(WVOS_Login);
        WVOS_Login.setLayout(WVOS_LoginLayout);
        WVOS_LoginLayout.setHorizontalGroup(
                WVOS_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_LoginLayout.createSequentialGroup()
                                .addGap(12, 30, Short.MAX_VALUE)
                                .addGroup(WVOS_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WVOS_LoginLayout.createSequentialGroup()
                                                .addComponent(WVOS_Links, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WVOS_LoginLayout.createSequentialGroup()
                                                .addComponent(WVOS_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(87, 87, 87))))
                        .addGroup(WVOS_LoginLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(WVOS_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        WVOS_LoginLayout.setVerticalGroup(
                WVOS_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_LoginLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(WVOS_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(WVOS_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(WVOS_Links, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(WVOS_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LoginForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LoginForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(WVOS_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    /**
     * LFEmailFieldFocusGained(java.awt.event.FocusEvent evt) <br>
     * The e-mail field gains focus when clicked.
     * The e-mail field has gained focus when there is a blinking cursor
     * and the field's background text has disappeared.
     *
     * @param evt the FocusEvent
     * @return none
     * */
    private void LFEmailFieldFocusGained(java.awt.event.FocusEvent evt) {
        if(LFEmailField.getForeground() == Color.gray) {
            LFEmailField.setText("");
            LFEmailField.setForeground(null);
        }
    }

    /**
     * LFEmailFieldFocusLost(java.awt.event.FocusEvent evt) <br>
     * The e-mail field loses focus when there is another field clicked.
     * The e-mail field has lost focus when the blinking cursor is missing
     * and the field's background text is visible.
     *
     * @param evt the FocusEvent
     * @return none
     */
    private void LFEmailFieldFocusLost(java.awt.event.FocusEvent evt) {
        setLFEmailFieldText();
    }

    /**
     * LFPassFieldFocusGained(java.awt.event.FocusEvent evt) <br>
     * The password field gains focus when clicked.
     * The password field has gained focus when there is a blinking cursor
     * and the field's background text has disappeared.
     *
     * @param evt the FocusEvent
     * @return none
     * */
    private void LFPassFieldFocusGained(java.awt.event.FocusEvent evt) {
        if(LFPassField.getForeground() == Color.gray) {
            LFPassField.setText("");
            LFPassField.setEchoChar('*');
            LFPassField.setForeground(null);
        }
    }

    /**
     * LFPassFieldFocusLost(java.awt.event.FocusEvent evt) <br>
     * The password field loses focus when there is another field clicked.
     * The password field has lost focus when the blinking cursor is missing
     * and the field's background text is visible.
     *
     * @param evt the FocusEvent
     * @return none
     */
    private void LFPassFieldFocusLost(java.awt.event.FocusEvent evt) {
        setLFPassFieldText();
    }

    /**
     * LoginButtonActionPerformed(java.awt.event.ActionEvent evt) <br>
     * The action responsible for logging the user into the application. <br>
     * If the Log In button is pressed and there are one or both fields
     * empty, a dialog with "Please enter all fields!" message will
     * appear. <br>
     * If the credentials match the credentials registered in the database, the
     * user will be logged in successfully. <br>
     * If one or both credentials are wrong, a dialog with "Wrong username or password!"
     * message will appear.
     *
     * @param evt the ActionEvent
     * @return none
     */
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setStarsInvisible();
        if(markEmptyFields()) {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Please enter all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if((userID = handler.checkCredentials(LFEmailField.getText(), String.valueOf(LFPassField.getPassword()))) > 0) {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Log In Successful! \nWelcome to VOS!", "Success", JOptionPane.INFORMATION_MESSAGE);
            ToolFrame toolFrame = new ToolFrame();
            toolFrame.pack();
            toolFrame.setLocationRelativeTo(null);
            toolFrame.setVisible(true);
            this.dispose();
        }
        else {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Wrong username or password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * NoAccButtonActionPerformed(java.awt.event.ActionEvent evt) <br>
     * The action responsible for redirecting the user to Sign Up form.
     * If the "Don't have an account? Sign Up" button is pressed, the
     * user will be redirected to the Sign Up form.
     *
     * @param evt the ActionEvent
     * @return none
     */
    private void NoAccButtonActionPerformed(java.awt.event.ActionEvent evt) {
        SignupFrame signupFrame = new SignupFrame();
        signupFrame.pack();
        signupFrame.setLocationRelativeTo(null);
        signupFrame.setVisible(true);
        this.dispose();
    }

    /**
     * setJOptionPane() <br>
     * Sets the layout for the message dialogs.
     *
     * @param
     * @return none
     */
    private void setJOptionPane() {
        uim.put("OptionPane.background",new ColorUIResource(51,51,51));
        uim.put("Panel.background",new ColorUIResource(51,51,51));
        uim.put("OptionPane.messageForeground", Color.white);
        uim.put("Button.background", Color.darkGray);
        uim.put("Button.foreground", Color.white);
    }

    /**
     * setLFEmailFieldText() <br>
     * Sets the background text for the e-mail field when focus is lost. <br>
     * This method will be called in:
     * <br> - The LFEmailFieldFocusLost event (for setting the background text when focus is lost)
     * <br> - The LoginFrame's class constructor (for general setup)
     *
     */
    private void setLFEmailFieldText() {
        if(LFEmailField.getText().isEmpty()) {
            LFEmailField.setText("E-mail");
            LFEmailField.setForeground(Color.gray);
        }
    }

    /**
     * setLFPassFieldText() <br>
     * Sets the background text for the password field when focus is lost. <br>
     * This method will be called in:
     * <br> - The LFPassFieldFocusLost event (for setting the background text when focus is lost)
     * <br> - The LoginFrame's class constructor (for general setup)
     *
     */
    private void setLFPassFieldText() {
        if(String.valueOf(LFPassField.getPassword()).isEmpty()) {
            LFPassField.setEchoChar('*');
            LFPassField.setText("Password");
            LFPassField.setForeground(Color.gray);
        }
    }

    /**
     * setHomepageHyperlink() <br>
     * Links the VOS Web's homepage to a JLabel (WVOS_Welcome). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange WVOS_Welcome JLabel, they will be
     * redirected to "https://visual-oetpn-simulator.netlify.app/index.html".
     *
     * @param
     * @return none
     */
    private void setHomepageHyperlink() {
        WVOS_Welcome.setForeground(Color.orange.darker());
        WVOS_Welcome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        WVOS_Welcome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/index.html"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    /**
     * setAboutSystemsHyperlink() <br>
     * Links the VOS About Systems page to a JLabel (AboutSystems). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange AboutSystems JLabel, they will be
     * redirected to "https://visual-oetpn-simulator.netlify.app/pages/about-systems.html".
     *
     * @param
     * @return none
     */
    private void setAboutSystemsHyperlink() {
        AboutSystems.setForeground(Color.orange.darker());
        AboutSystems.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        AboutSystems.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-systems.html"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    /**
     * setAboutPNsHyperlink() <br>
     * Links the VOS About Petri Nets page to a JLabel (AboutPNs). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange AboutPNs JLabel, they will be
     * redirected to "https://visual-oetpn-simulator.netlify.app/pages/about-petrinets.html".
     *
     * @param
     * @return none
     */
    private void setAboutPNsHyperlink() {
        AboutPNs.setForeground(Color.orange.darker());
        AboutPNs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        AboutPNs.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-petrinets.html"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    /**
     * setAboutOETPNHyperlink() <br>
     * Links the VOS Web's homepage to a JLabel (WVOS_Welcome). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange WVOS_Welcome JLabel, they will be
     * redirected to "https://visual-oetpn-simulator.netlify.app/index.html".
     *
     * @param
     * @return none
     */
    private void setAboutOETPNHyperlink() {
        AboutOETPN.setForeground(Color.orange.darker());
        AboutOETPN.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        AboutOETPN.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-oetpns.html"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    /**
     * setAboutVOSHyperlink() <br>
     * Links the VOS About VOS page to a JLabel (AboutVOS). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange AboutVOS JLabel, they will be
     * redirected to "https://visual-oetpn-simulator.netlify.app/pages/about-vos.html".
     *
     * @param
     * @return none
     */
    private void setAboutVOSHyperlink() {
        AboutVOS.setForeground(Color.orange.darker());
        AboutVOS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        AboutVOS.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-vos.html"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    /**
     * setGithubProfileHyperlink() <br>
     * Links the creator's GitHub profile to a JLabel (GitHub). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange GitHub JLabel, they will be
     * redirected to "https://github.com/draguleee".
     *
     * @param
     * @return none
     */
    private void setGithubProfileHyperlink() {
        GitHub.setForeground(Color.orange.darker());
        GitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        GitHub.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://github.com/draguleee"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    /**
     * setLinkedinProfileHyperlink() <br>
     * Links the creator's LinkedIn profile to a JLabel (LinkedIn). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange LinkedIn JLabel, they will be
     * redirected to "https://www.linkedin.com/in/andreea-ioana-dragu-870a121a1/".
     *
     * @param
     * @return none
     */
    private void setLinkedinProfileHyperlink() {
        LinkedIn.setForeground(Color.orange.darker());
        LinkedIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        LinkedIn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/andreea-ioana-dragu-870a121a1/"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    /**
     * setEmailOption() <br>
     * Links the electronic mail to a JLabel (Email). <br>
     * The receiver will be the creator of this application. The puropose
     * of this functionality is to get in touch with the creator if an user
     * wants to bring modifications to this application.
     *
     * @param
     * @return none
     */
    private void setEmailOption() {
        Email.setForeground(Color.orange.darker());
        Email.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Email.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    String message = "mailto:aandreid14@gmail.com";
                    URI uri = URI.create(message);
                    Desktop.getDesktop().mail(uri);
                }
                catch(IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
